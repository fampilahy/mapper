package mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import consumer.ResponseSplitInfoDeserializer;
import model.document.chubb.messageByCategory.defaultValues.AddressTypeCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentFrequencyCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentMethodCodeFromChubb;
import model.document.chubb.s6Transaction.Address;
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

public interface Converter {

	static final String SPACE = " ";

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument();

	public static ProcessTransactionRequest processDefaultConversionSIB21DocumentToChubbDocument(
			final SIB21Document sib21Document, final TransactionTypeCodeFromChubb transactionTypeCodeFromChubb, final ProductRelationSIB21Chubb  productRelationSIB21Chubb) {

		ResponseSplitInfoDeserializer responseSplitInfoDeserializer = new ResponseSplitInfoDeserializer();
		ResponseSplitInfo responseSplitInfo = responseSplitInfoDeserializer.getObject(productRelationSIB21Chubb.getChubbProductCode());
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

		PaymentInfo paymentInfo = getPaymentInfo(sib21Document,responseSplitInfo);
		s6Transaction.setPaymentInfo(paymentInfo);

		Product product = new Product();
		product.setProdCd("1");
		product.setCoverageCd(2);
		
		Product[] products = { product };
		s6Transaction.setProducts(products);

		Customer customer = getCustomer(sib21Document);
		// customer.setCustId(custId);
		// customer.setCustType(custType);
		Customer[] customers = { customer };

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();
		processTransactionRequest.setTransaction(s6Transaction);

		return processTransactionRequest;
	}

	public static Servicio getServicio(final SIB21Document sib21Document) {
		return sib21Document != null ? sib21Document.getServicio() : null;
	}

	public static Function<SIB21Document, Servicio> getServicio = (sib21Document) -> sib21Document != null
			? sib21Document.getServicio() : null;

	// -----------------------

	public static Integer getLineNum(SIB21Document sib21Document) {
		//According to Chubb agent during the last call on 22/06/2018 value would always be 1 (means first transaction inside the xml file)
		return 1;
	}

	// -----------------------

//	public static String getCampaign(SIB21Document sib21Document) {
//		return "PE16003702";
//	}
	
	public static String getCampaign(ResponseSplitInfo responseSplitInfo) {
		return responseSplitInfo.getSplitInfo()==null?null:responseSplitInfo.getSplitInfo().getSplitKey();
	}

	public static Product[] getProducts(final SIB21Document sib21Document,ResponseSplitInfo responseSplitInfo){
		if (responseSplitInfo==null||responseSplitInfo.getSplitInfo()==null||responseSplitInfo.getSplitInfo().getProducts()==null) return null;
		List<Product> products = new ArrayList<Product>();
		Product product = buildProduct(responseSplitInfo);
		if(product==null) return null;
		products.add(product);
		return products.isEmpty()?null: (Product[])products.toArray();
	}
	
	public static Product buildProduct(ResponseSplitInfo responseSplitInfo){
		//SIB21 only allow one sale
		Product product = null;
		if (responseSplitInfo==null||responseSplitInfo.getSplitInfo()==null||responseSplitInfo.getSplitInfo().getProducts()==null||responseSplitInfo.getSplitInfo().getProducts()[0].getProductId()==null) return null;
		product = new Product();
		product.setProdCd(responseSplitInfo.getSplitInfo().getProducts()[0].getProductId());
		return product;
	}
	
	// -----------------------

	public static PaymentInfo getPaymentInfo(final SIB21Document sib21Document,ResponseSplitInfo responseSplitInfo) {
		//according to the last call with Chubb agent on 22/06/2018 value will always be BORDEREAUX so that the system wont ask for additional information
		PaymentMethodCodeFromChubb paymentMethod = PaymentMethodCodeFromChubb.BORDEREAUX;
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setPayMethod(paymentMethod.getKey());
		paymentInfo.setPayFreq(getPaymentFreq(sib21Document,responseSplitInfo));
		return paymentInfo;
	}

	public static Integer getPaymentMethod(final SIB21Document sib21Document) {
		return 0;
	}

	public static Integer getPaymentFreq(final SIB21Document sib21Document, final ResponseSplitInfo responseSplitInfo) {
		//According to last call with Chubb agent on 22/06/2018 payment frequencies are related to Product definition
		Servicio servicio = sib21Document.getServicio();
		if (servicio == null)
			return null;

		Integer tmp_NumPag = servicio.getTmp_NumPag();
		Integer payFreq = null;
		if (tmp_NumPag == null)
			return null;

		switch (tmp_NumPag) {

		case 1: 
			payFreq = PaymentFrequencyCodeFromChubb.MENSUAL.getKey();
			break;

		case 2: // do action here BIMESTRAL
			break;

		case 3: 
			payFreq = PaymentFrequencyCodeFromChubb.TRIMESTRAL.getKey();
			break;

		case 4: // do action here TETRAMESTRAL
			break;

		case 5: 
			payFreq = PaymentFrequencyCodeFromChubb.SEMESTRAL.getKey();
			break;

		case 6: // do action here ANUAL
			payFreq = PaymentFrequencyCodeFromChubb.ANUAL.getKey();
			break;

		case 7: // do action here
			break;

		case 8: // do action here
			break;

		case 9: // do action here MESES SIN INTERESES
			break;

		default:
			break;
		}
		
		return validatePaymentFrequencyCode(payFreq,responseSplitInfo);
	}
	
	public static Integer validatePaymentFrequencyCode(Integer payFreq, ResponseSplitInfo responseSplitInfo ){
		if(payFreq==null || responseSplitInfo ==null || responseSplitInfo.getSplitInfo()==null)return null;
		PaymentFrequency[] availablePaymentFrequencies = responseSplitInfo.getSplitInfo().getPaymentFrequencies();
		if(availablePaymentFrequencies==null ||availablePaymentFrequencies.length==0 )return null;
		for(PaymentFrequency availablePaymentFrequency : availablePaymentFrequencies){
			//means paymentFrequencyCode from SIB21 is accurate to one of Chub available payment frequency for the current campaign
			if(payFreq==availablePaymentFrequency.getPaymentFrequencyCode()) return payFreq;
		}
		return null;
	}
	
	
	public static PaymentFrequency[] getAvailableAvailablePaymentFrequencies(ResponseSplitInfo responseSplitInfo){
		return responseSplitInfo==null?null: responseSplitInfo.getSplitInfo().getPaymentFrequencies();
	}

	// -----------------------
	public static Customer[] getCustomers(final SIB21Document sib21Document) {
		// TODO
		return null;
	}

	public static Customer getCustomer(final SIB21Document sib21Document) {
		return null;
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

	public static String getLasName(final SIB21Document sib21Document) {
		return null;
	}

	public static String getFirstName(final SIB21Document sib21Document) {
		return null;
	}

	// -----------------------

	public static CustProd getCustProd(final SIB21Document sib21Document) {
		return null;
	}

	public static String getProdCd(final SIB21Document sib21Document) {
		return null;
	}

	public static Integer getBenLv(final SIB21Document sib21Document) {
		return null;
	}

	// -----------------------

	// TODO Customers[].custAdds
	// -----------------------

	public static Address[] getAdresses(final SIB21Document sib21Document, final String strUUID) {

		List<Address> addresses = new ArrayList<Address>();
		Address address = getAddress(sib21Document,strUUID);

		if (address != null)
			addresses.add(address);

		Address email = getEmail(sib21Document,strUUID);
		if (email != null)
			addresses.add(email);

		return !addresses.isEmpty() ? (Address[]) addresses.toArray() : null;
	}

	public static Address getAddress(final SIB21Document sib21Document, final String strUUID) {
		return sib21Document.getServicio() == null ? null : (new Address()).withAddrId(strUUID).withAddrType(AddressTypeCodeFromChubb.HOME.getKey()).withLine1(buildAddress(sib21Document));
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
		// TODO change the addrId
		return sib21Document.getServicio() == null ? null
				: (new Address()).withAddrId(strUUID).withAddrType(AddressTypeCodeFromChubb.MAIL.getKey())
						.withLine1(sib21Document.getServicio().getTmp_Email());
	}
	
	
	
	
	

	// -----------------------
}
