package mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

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
import model.document.sib21.SIB21Document;
import model.document.sib21.Servicio;

public interface Converter {

	static final String SPACE = " ";

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument();

	public static ProcessTransactionRequest processDefaultConversionSIB21DocumentToChubbDocument(
			final SIB21Document sib21Document, final TransactionTypeCodeFromChubb transactionTypeCodeFromChubb, final ProductRelationSIB21Chubb  productRelationSIB21Chubb) {

		S6Transaction s6Transaction = new S6Transaction();

		String tranType = transactionTypeCodeFromChubb.getTranType();
		s6Transaction.setTranType(tranType);

		String chgType = transactionTypeCodeFromChubb.getChgType(); //should be empty string for sale
		s6Transaction.setChgType(chgType);

		Integer lineNum = getLineNum(sib21Document);
		s6Transaction.setLineNum(lineNum);

		String countryCd = CountryCodeFromChubb.MEXICO.getMsgID();
		s6Transaction.setCountryCd(countryCd);

		String campaign = getCampaign(sib21Document);
		s6Transaction.setCampaign(campaign);

		PaymentInfo paymentInfo = getPaymentInfo(sib21Document);
		s6Transaction.setPaymentInfo(paymentInfo);

		Product product = new Product();
		product.setProdCd("1");
		product.setCoverageCd(2);
		Product[] products = { product };// TODO getProducts
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
		return 1;
	}

	// -----------------------

	public static String getCampaign(SIB21Document sib21Document) {
		return "PE16003702";
	}

	// -----------------------

	public static PaymentInfo getPaymentInfo(final SIB21Document sib21Document) {

		// TODO take values from Norma doc and do the condition to change them
		// to chubb doc
		PaymentMethodCodeFromChubb paymentMethod = PaymentMethodCodeFromChubb.DEBITO_BANCARIO;//TODO
		// PaymentFrequencyCodeFromChubb paymentFrequency =
		// PaymentFrequencyCodeFromChubb.ANUAL;
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setPayMethod(paymentMethod.getKey());// TODO get payment
															// method
		paymentInfo.setPayFreq(getPaymentFreq(sib21Document));

		return paymentInfo;
	}

	public static Integer getPaymentMethod(final SIB21Document sib21Document) {
		return 0;
	}

	public static Integer getPaymentFreq(final SIB21Document sib21Document) {
		Servicio servicio = sib21Document.getServicio();
		if (servicio == null)
			return null;

		Integer tmp_NumPag = servicio.getTmp_NumPag();
		Integer payFreq = null;
		if (tmp_NumPag == null)
			return null;

		switch (tmp_NumPag) {

		case 1: // do action here MENSUAL
			payFreq = PaymentFrequencyCodeFromChubb.MENSUAL.getKey();
			break;

		case 2: // do action here BIMESTRAL
			break;

		case 3: // do action here TRIMESTRAL
			payFreq = PaymentFrequencyCodeFromChubb.TRIMESTRAL.getKey();
			break;

		case 4: // do action here TETRAMESTRAL
			break;

		case 5: // do action here SEMESTRAL
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

		return payFreq;
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

	public static Address[] getAdresses(final SIB21Document sib21Document) {

		List<Address> addresses = new ArrayList<Address>();
		Address address = getAddress(sib21Document);

		if (address != null)
			addresses.add(address);

		Address email = getEmail(sib21Document);
		if (email != null)
			addresses.add(email);

		return !addresses.isEmpty() ? (Address[]) addresses.toArray() : null;
	}

	public static Address getAddress(final SIB21Document sib21Document) {
		return sib21Document.getServicio() == null ? null : buildAddress(sib21Document);
	}

	public static Address buildAddress(final SIB21Document sib21Document) {
		if( sib21Document.getServicio() == null) return null;
		
		
		
		
		
		return null;
	}

	public static Address getEmail(final SIB21Document sib21Document) {
		// TODO change the addrId
		return sib21Document.getServicio() == null ? null
				: (new Address()).withAddrId("EMAIL").withAddrType(AddressTypeCodeFromChubb.MAIL.getKey())
						.withLine1(sib21Document.getServicio().getTmp_Email());
	}
	
	
	
	
	

	// -----------------------
}
