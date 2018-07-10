package mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

import com.fasterxml.jackson.databind.JsonNode;

import consumer.ResponseSplitInfoDeserializer;
import model.document.chubb.messageByCategory.defaultValues.AddressTypeCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.CoverageCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.MexicoProvinceCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentFrequencyCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentMethodCodeFromChubb;
import model.document.chubb.s6Transaction.Address;
import model.document.chubb.s6Transaction.Beneficiary;
import model.document.chubb.s6Transaction.BeneficiaryDetail;
import model.document.chubb.s6Transaction.CorrespondenceType;
import model.document.chubb.s6Transaction.CustProd;
import model.document.chubb.s6Transaction.CustType;
import model.document.chubb.s6Transaction.Customer;
import model.document.chubb.s6Transaction.PaymentInfo;
import model.document.chubb.s6Transaction.Product;
import model.document.chubb.s6Transaction.S6Transaction;
import model.document.chubb.s6Transaction.defaultValues.TransactionTypeCodeFromChubb;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.PaymentFrequency;
import model.document.chubb.splitInfo.defaultValues.ProductRelationSIB21Chubb;
import model.document.chubb.splitInfo.response.ResponseSplitInfo;
import model.document.sib21.SIB21Document;
import model.document.sib21.Servicio;
import tools.JsonTool;

public interface Converter {

	public static final String SPACE = " ";
	public static final Boolean TRUE = true;

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument();

	public static ProcessTransactionRequest processDefaultConversionSIB21DocumentToChubbDocument(
			final SIB21Document sib21Document, final TransactionTypeCodeFromChubb transactionTypeCodeFromChubb, final ProductRelationSIB21Chubb  productRelationSIB21Chubb) {

		ResponseSplitInfoDeserializer responseSplitInfoDeserializer = new ResponseSplitInfoDeserializer();
		ResponseSplitInfo responseSplitInfo = responseSplitInfoDeserializer.getObject(productRelationSIB21Chubb.getChubbSplitKey());
		if(responseSplitInfo ==null) return null;
		
		UUID uuid = UUID.randomUUID();
		String strUUID = uuid.toString();
		
		S6Transaction s6Transaction = new S6Transaction();

		String tranType = transactionTypeCodeFromChubb.getTranType();
		s6Transaction.setTranType(tranType);

		String chgType = transactionTypeCodeFromChubb.getChgType(); //should be empty string for sale
		s6Transaction.setChgType(chgType);

		Integer lineNum = getLineNum(sib21Document);
		s6Transaction.setLineNum(lineNum);

		String countryCd = CountryCodeFromChubb.MEXICO.getMsgID();
		s6Transaction.setCountryCd(countryCd);

		String campaign = getCampaign(responseSplitInfo);
		s6Transaction.setCampaign(campaign);
		
		s6Transaction.setRefAmount(null);

		PaymentInfo paymentInfo = getPaymentInfo(sib21Document,responseSplitInfo);
		s6Transaction.setPaymentInfo(paymentInfo);

		Product[] products = getProducts( responseSplitInfo);
		s6Transaction.setProducts(products);

		Customer[] customers = getCustomers(sib21Document,responseSplitInfo,strUUID,products);	
		
		JsonNode json = JsonTool.fromDocumentToJsonNode(customers);
		
		s6Transaction.setPolNum(sib21Document.getServicio().getTmp_NumPol());
		
		s6Transaction.setCustomers(customers);
		
		s6Transaction.setAddresses(getAdresses(sib21Document, strUUID));
		s6Transaction.setAppDate(null);
		s6Transaction.setEfftDate(getEffectiveDate(sib21Document));
		s6Transaction.setCorrespondence(CorrespondenceType.PRINT);
		s6Transaction.setTranNote("Sales performed through Banregio service");
		s6Transaction.setPolExpDate(null);
		s6Transaction.setBill(null);
		s6Transaction.setCancelReason(null);
		s6Transaction.setEndorsReason(null);
		s6Transaction.setPremiumCheck(null);

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();
		processTransactionRequest.setTransaction(s6Transaction);
		
		json = JsonTool.fromDocumentToJsonNode(processTransactionRequest);
		System.out.println("Converter.processDefaultConversionSIB21DocumentToChubbDocument().processTransactionRequest \n"+json);
		return processTransactionRequest;
	}

	public static Servicio getServicio(final SIB21Document sib21Document) {
		return sib21Document != null ? sib21Document.getServicio() : null;
	}

	public static Function<SIB21Document, Servicio> getServicio = (sib21Document) -> sib21Document != null
			? sib21Document.getServicio() : null;

	// -----------------------

	public static Integer getLineNum(final SIB21Document sib21Document) {
		//According to Chubb agent during the last call on 22/06/2018 value would always be 1 (means first transaction inside the xml file)
		return 1;
	}

	public static String getEffectiveDate(final SIB21Document sib21Document){
		return (sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_FecIni()==null||sib21Document.getServicio().getTmp_FecIni().equals(""))?null:sib21Document.getServicio().getTmp_FecIni();
	}
	
	// -----------------------

	public static String getPersonalId(final SIB21Document sib21Document) {
		return (sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_RFC()==null||sib21Document.getServicio().getTmp_RFC().equals(""))? null: sib21Document.getServicio().getTmp_RFC();
	}
	
	public static String getCampaign(final ResponseSplitInfo responseSplitInfo) {
		return responseSplitInfo.getSplitInfo()==null?null:responseSplitInfo.getSplitInfo().getSplitKey();
	}

	public static Product[] getProducts(final ResponseSplitInfo responseSplitInfo){
		if (responseSplitInfo==null||responseSplitInfo.getSplitInfo()==null||responseSplitInfo.getSplitInfo().getProducts()==null) return null;
		List<Product> products = new ArrayList<Product>();
		Product product = buildProduct(responseSplitInfo);
		if(product==null) return null;
		products.add(product);
		return products.isEmpty()?null: products.toArray(new Product[0]);
	}
	
	public static Product buildProduct(final ResponseSplitInfo responseSplitInfo){
		Product product = null;
		if (responseSplitInfo==null||responseSplitInfo.getSplitInfo()==null||responseSplitInfo.getSplitInfo().getProducts()==null||responseSplitInfo.getSplitInfo().getProducts()[0].getProductId()==null) return null;
		product = new Product();
		product.setProdCd(responseSplitInfo.getSplitInfo().getProducts()[0].getProductId());
		product.setCoverageCd(CoverageCodeFromChubb.MAIN_INSURED_ONLY.getKey());
		product.setDepNum(null);
		product.setPremiumOverAmt(null);
		product.setPremiumOverRs(null);
		return product;
	}
	
	public static PaymentInfo getPaymentInfo(final SIB21Document sib21Document,ResponseSplitInfo responseSplitInfo) {
		//according to the last call with Chubb agent on 22/06/2018 value will always be BORDEREAUX so that the system wont ask for additional information
		PaymentMethodCodeFromChubb paymentMethod = PaymentMethodCodeFromChubb.BORDEREAUX;
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setPayMethod(paymentMethod.getKey());
		paymentInfo.setPayFreq(getPaymentFreq(sib21Document,responseSplitInfo));
		paymentInfo.setTaxAppCd(null);
		paymentInfo.setDebitDay(null);
		paymentInfo.setTaxJurisCd(null);
		paymentInfo.setExpDate(null);
		paymentInfo.setCollCd("BRM");
		return paymentInfo;
	}

	public static Integer getPaymentMethod(final SIB21Document sib21Document) {
		return 0;
	}
	
	public static Integer getPaymentFreq(final SIB21Document sib21Document, final ResponseSplitInfo responseSplitInfo) {
		//According to last call with Chubb agent on 22/06/2018 payment frequencies are related to Product definition
//		  @Rec_Mensua	= 12,	/* Recibos mensuales */
//		  @Rec_Bimest	= 6,	/* Recibos bimestrales */
//		  @Rec_Trimes	= 4,	/* Recibos trimestrales */
//		  @Rec_Tetram	= 3,	/* Recibos tetramestrales */
//		  @Rec_Semest	= 2,	/* Recibos semestrales */
//		  @Rec_Anual	= 1,	/* Recibos anuales */
		Servicio servicio = sib21Document.getServicio();
		if (servicio == null)
			return null;

		Integer tmp_NumPag = servicio.getTmp_NumPag();
		Integer payFreq = null;
		if (tmp_NumPag == null)
			return null;

		System.out.println("Converter.getPaymentFreq().tmp_NumPag ==> "+tmp_NumPag);
		switch (tmp_NumPag) {

		case 1: payFreq = PaymentFrequencyCodeFromChubb.ANUAL.getKey();
			break;

		case 2: payFreq = PaymentFrequencyCodeFromChubb.SEMESTRAL.getKey();
			break;

		case 3: 
			break;

		case 4: payFreq = PaymentFrequencyCodeFromChubb.TRIMESTRAL.getKey();
			break;

		case 5: 
			break;

		case 6: //bimestral
			break;

		case 7:
		case 8: 
		case 9:
		case 10: 
		case 11: 
			break;
			
		case 12: payFreq = PaymentFrequencyCodeFromChubb.MENSUAL.getKey();
			break;

		default:
			System.err.println("tmp_NumPag valor unknown ==> "+tmp_NumPag);
			System.err.println("set payFreq to default ==> "+PaymentFrequencyCodeFromChubb.ANUAL.getKey());
			payFreq = PaymentFrequencyCodeFromChubb.ANUAL.getKey();
			break;
		}
		
		System.out.println("Converter.getPaymentFreq() ==> "+payFreq.toString());
		return validatePaymentFrequencyCode(payFreq,responseSplitInfo);
	}
	
	
	public static Integer validatePaymentFrequencyCode(Integer payFreq, ResponseSplitInfo responseSplitInfo ){
		if(payFreq==null || responseSplitInfo ==null || responseSplitInfo.getSplitInfo()==null)return null;
		PaymentFrequency[] availablePaymentFrequencies = responseSplitInfo.getSplitInfo().getPaymentFrequencies();
		if(availablePaymentFrequencies==null ||availablePaymentFrequencies.length==0 )return null;
		for(PaymentFrequency availablePaymentFrequency : availablePaymentFrequencies){
			//means paymentFrequencyCode from SIB21 is accurate to one of Chub available payment frequency for the current campaign
			if(payFreq.intValue()==availablePaymentFrequency.getPaymentFrequencyCode().intValue()) return payFreq;
		}
		return null;
	}
	
	public static PaymentFrequency[] getAvailableAvailablePaymentFrequencies(ResponseSplitInfo responseSplitInfo){
		return responseSplitInfo==null?null: responseSplitInfo.getSplitInfo().getPaymentFrequencies();
	}

	public static Customer[] getCustomers(final SIB21Document sib21Document,ResponseSplitInfo responseSplitInfo,String strUUID, Product[] products) {
		Customer customer = getCustomer(sib21Document, responseSplitInfo, strUUID, products);
		return customer ==null ? null:new Customer[]{customer.withCustAdds(new String[]{strUUID})};
	}

	public static String getCustId(final SIB21Document sib21Document) {
		return null;
	}

	public static CustType getCustType(final SIB21Document sib21Document) {
		return null;
	}

	public static Boolean getPolHolder(final SIB21Document sib21Document) {
		return null;
	}

	public static Boolean getPolPayer(final SIB21Document sib21Document) {
		return null;
	}

	public static String getLastName(final SIB21Document sib21Document) {
		return null;
	}

	public static String getFirstName(final SIB21Document sib21Document) {
		return null;
	}

	// -----------------------

	public static CustProd getCustProd( final SIB21Document sib21Document ,final ResponseSplitInfo responseSplitInfo) {
		//TODO create CustProd
		
		CustProd custProd = new CustProd();
		custProd.setProdCd(responseSplitInfo.getSplitInfo().getProducts()[0].getProductId());
		custProd.setBenLv(1);
		custProd.setUnits(null);
		custProd.setBeneficiary(new Beneficiary());
		
		//TODO take change ratingsFactor
//		int[] ratingsFactor = {600167};
//		custProd.setRatingsFactor(ratingsFactor);
		
		custProd.setBeneficiary(getBeneficiary(sib21Document));
		
		return custProd;
	}
	
	public static CustProd[] getCustProds(final SIB21Document sib21Document, final ResponseSplitInfo responseSplitInfo) {
		CustProd custProd = getCustProd(sib21Document,responseSplitInfo);
		return custProd==null?null:new CustProd[]{custProd};
	}

	public static String getProdCd(final SIB21Document sib21Document) {
		return null;
	}

	public static Integer getBenLv(final SIB21Document sib21Document) {
		return null;
	}
	
	
	public static Beneficiary getBeneficiary(final SIB21Document sib21Document){
		if(sib21Document==null||sib21Document.getServicio()==null)return null;
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setBeneficiaries(getbeneficiaries(sib21Document));
		beneficiary.setNotes("Aqui vienen los porcentages de cada benificiarios");
		
		return beneficiary;
	}
	
	public static BeneficiaryDetail[] getbeneficiaries (final SIB21Document sib21Document){
		List<BeneficiaryDetail> beneficiaries = new ArrayList<BeneficiaryDetail>();
		BeneficiaryDetail beneficiaryDetail = null;
		for (int beneficiaryIndex = 1; beneficiaryIndex < 5;beneficiaryIndex++){
			beneficiaryDetail = getBeneficiaryDetail(sib21Document, beneficiaryIndex);
			
			if(beneficiaryDetail!=null){
				System.out.println("Beneficiaries "+beneficiaryDetail.toString());
				beneficiaries.add(beneficiaryDetail);
			}
		}
		System.out.println("Beneficiaries "+beneficiaries.toString());
		return beneficiaries.size() > 0 ?  beneficiaries.toArray(new BeneficiaryDetail[0]) : new BeneficiaryDetail[0];
	}
	
	public static BeneficiaryDetail getBeneficiaryDetail (final SIB21Document sib21Document,final Integer beneficiaryIndex){
		
		if(sib21Document==null||sib21Document.getServicio()==null ||beneficiaryIndex==null||beneficiaryIndex==0) return null;
		
		String percentage = null, relationship =null, name = null;
		switch(beneficiaryIndex){
			case 1 :  percentage= isValidPercentage(sib21Document.getServicio().getTmp_Porce1())?sib21Document.getServicio().getTmp_Porce1():null; break;
			case 2 :  percentage= isValidPercentage(sib21Document.getServicio().getTmp_Porce2())?sib21Document.getServicio().getTmp_Porce2():null; break;
			case 3 :  percentage= isValidPercentage(sib21Document.getServicio().getTmp_Porce3())?sib21Document.getServicio().getTmp_Porce3():null; break;
			case 4 :  percentage= isValidPercentage(sib21Document.getServicio().getTmp_Porce4())?sib21Document.getServicio().getTmp_Porce4():null; break;
		}
		if(percentage==null) return null;
		
		switch(beneficiaryIndex){
			case 1 :  relationship= validateRelationShip(sib21Document.getServicio().getTmp_Paren1()); break;
			case 2 :  relationship= validateRelationShip(sib21Document.getServicio().getTmp_Paren2()); break;
			case 3 :  relationship= validateRelationShip(sib21Document.getServicio().getTmp_Paren3()); break;
			case 4 :  relationship= validateRelationShip(sib21Document.getServicio().getTmp_Paren4()); break;
		}
		
		switch(beneficiaryIndex){
			case 1 :  name= validateName(sib21Document.getServicio().getTmp_Nombr1()); break;
			case 2 :  name= validateName(sib21Document.getServicio().getTmp_Nombr2()); break;
			case 3 :  name= validateName(sib21Document.getServicio().getTmp_Nombr3()); break;
			case 4 :  name= validateName(sib21Document.getServicio().getTmp_Nombr4()); break;
		}
		
		BeneficiaryDetail beneficiaryDetail = new BeneficiaryDetail();
		beneficiaryDetail.setName(name);
		beneficiaryDetail.setPercentage(percentageToDouble(percentage));
		beneficiaryDetail.setRelationship(relationship);
		beneficiaryDetail.setPersonalID(null);
		
		
		return beneficiaryDetail;
	}
	
	public static Double percentageToDouble(String percentage){
		Double percentageD = 0.0;
		if(percentage==null) return percentageD;
		try{ percentageD = Double.parseDouble(percentage.trim()); }catch(Exception e ){ }
		return percentageD;
	}
		
	public static boolean isValidPercentage(String percentage){
		return (percentage==null||percentage.equals(" ")||percentage.equals("")||percentage.equals("000")||percentage.equals("00")||percentage.equals("0")) ? false:true;
	}
	
	public static String validateRelationShip(String relationship){
		return relationship==null?"":relationship;
	}
		
	public static String validateName(String name){
		return name==null?"":name;
	}
	
	// -----------------------

	// TODO Customers[].custAdds
	// -----------------------

	public static Address[] getAdresses(final SIB21Document sib21Document, final String strUUID) {

		List<Address> addresses = new ArrayList<Address>();
		Address address = getAddress(sib21Document,strUUID);

		Address email = getEmail(sib21Document,strUUID);
		
		if (address != null){
//			address.setAddrId("1");
			addresses.add(address);
		}
			
//		if (email != null){
//			email.setAddrId("2");
//			addresses.add(email);
//		}

		return !addresses.isEmpty() ? addresses.toArray(new Address[0]) : null;
	}

	public static Address getAddress(final SIB21Document sib21Document, final String strUUID) {
		if(sib21Document==null || sib21Document.getServicio()==null) return null;
		String line1 = sib21Document.getServicio().getTmp_CalNum();
		if(line1==null || line1.equals("")) return null;
		
		Address address = new Address();

		String city = sib21Document.getServicio().getTmp_Locali();
		Integer provinceCd = MexicoProvinceCodeFromChubb.NUEVO_LEON.getKey(); //TODO collect ProvinceCode
		String countryCd = CountryCodeFromChubb.MEXICO.getMsgID();
		
		address.setAddrId(strUUID);
		address.setAddrType(AddressTypeCodeFromChubb.HOME.getKey());
		address.setLine1(line1);
		address.setCity(city);
		address.setProvinceCd(provinceCd);
		address.setCountryCd(countryCd);
		
		return address;
	}
	
	

	public static String buildAddress(final SIB21Document sib21Document) {
		String address = null;
		if(sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_CalNum()==null||sib21Document.getServicio().getTmp_CalNum().equals("")) return null;
		address = sib21Document.getServicio().getTmp_CalNum();
		address += sib21Document.getServicio().getTmp_Coloni()==null?"":SPACE+sib21Document.getServicio().getTmp_Coloni();
		address += sib21Document.getServicio().getTmp_Locali()==null?"":SPACE+sib21Document.getServicio().getTmp_Locali();
		return address += sib21Document.getServicio().getTmp_Entida()==null?"":SPACE+sib21Document.getServicio().getTmp_Entida();
	}

	public static Address getEmail(final SIB21Document sib21Document, final String strUUID) {
		return (sib21Document == null || sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_EmaAdi()==null||sib21Document.getServicio().getTmp_EmaAdi().equals(""))? null
				: (new Address()).withAddrId(strUUID).withAddrType(AddressTypeCodeFromChubb.MAIL.getKey())
						.withLine1(sib21Document.getServicio().getTmp_EmaAdi());
	}
	
	public static Customer getCustomer(final SIB21Document sib21Document,final ResponseSplitInfo responseSplitInfo, String strUUID,Product[] products) {
		if(responseSplitInfo==null || responseSplitInfo.getSplitInfo()==null||responseSplitInfo.getSplitInfo().getProducts()==null||responseSplitInfo.getSplitInfo().getProducts().length==0)
			return null;
		
		Customer customer = new Customer();
		String firstName = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Nombre()==null?null:sib21Document.getServicio().getTmp_Nombre();
		String lastName = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_ApePat()==null?null:sib21Document.getServicio().getTmp_ApePat();
		String middleName= sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_ApeMat()==null?null:sib21Document.getServicio().getTmp_ApeMat();
		
		
		customer.setCustType(CustType.MI);
		
		customer.setPolHolder(TRUE);
		customer.setPolPayer(TRUE);
		customer.setLastName(lastName);
		customer.setFirstName(firstName);
		customer.setMiddleName(middleName);
		customer.setTitle(null);
		customer.setLangCd(null);
		customer.setPersonalId(getPersonalId(sib21Document));
		
		//TODO birthDate
		customer.setBirthDate("1987-07-28");
//		customer.setBirthDate(getStrBirthDate(sib21Document));
		customer.setSexCd(null);
		customer.setEmailAddr(getStrEmail(sib21Document));
		customer.setCallPrefCd(null);
		customer.setNationCd(null);
		customer.setEduCd(null);
		customer.setOcupCd(null);
		customer.setIndCd(null);
		customer.setMaritalCd(null);
		customer.setRelationshipCd(null);
		String[] custAdds = {strUUID};
		customer.setCustAdds(custAdds);
		customer.setDependentType(null);
		customer.setCustProds(getCustProds(sib21Document,responseSplitInfo));
		return customer;
	}
	
	public static String getStrEmail(final SIB21Document sib21Document){
		return (sib21Document==null ||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Email().equals(""))?null: sib21Document.getServicio().getTmp_Email();
	}
	
	public static String getStrBirthDate(final SIB21Document sib21Document){
		return (sib21Document==null ||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_FecNac().equals(""))?null: sib21Document.getServicio().getTmp_FecNac();
	}
	
	
	
	public static Customer getCustomer1(final SIB21Document sib21Document){
		String name1 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Nombr1()==null?null:sib21Document.getServicio().getTmp_Nombr1();
		String relationship1 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Paren1()==null?null:sib21Document.getServicio().getTmp_Paren1();
		String percent1 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Porce1()==null?null:sib21Document.getServicio().getTmp_Porce1();
		return null;//TODO collect customer1
	}
	
	public static Customer getCustomer2(final SIB21Document sib21Document){
		String name2 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Nombr2()==null?null:sib21Document.getServicio().getTmp_Nombr2();
		String relationship2 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Paren2()==null?null:sib21Document.getServicio().getTmp_Paren2();
		String percent2 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Porce2()==null?null:sib21Document.getServicio().getTmp_Porce2();
		return null;
	}
	
	
	public static Customer getCustomer3(final SIB21Document sib21Document){
		String name3 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Nombr3()==null?null:sib21Document.getServicio().getTmp_Nombr3();
		String relationship3 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Paren3()==null?null:sib21Document.getServicio().getTmp_Paren3();
		String percent3 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Porce3()==null?null:sib21Document.getServicio().getTmp_Porce3();
		return null;
	}
	
	public static Customer getCustomer4(final SIB21Document sib21Document){
		String name4 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Nombr4()==null?null:sib21Document.getServicio().getTmp_Nombr4();
		String relationship4 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Paren4()==null?null:sib21Document.getServicio().getTmp_Paren4();
		String percent4 = sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_Porce4()==null?null:sib21Document.getServicio().getTmp_Porce4();
		return null;
	}

	
	
	// -----------------------
}
