package mapper;

import java.util.function.Function;

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
import model.document.sib21.SIB21Document;
import model.document.sib21.Servicio;

public interface Converter {

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument();

	public static ProcessTransactionRequest processDefaultConvertSIB21DocumentToChubbDocument(
			final SIB21Document sib21Document, final TransactionTypeCodeFromChubb transactionTypeCodeFromChubb) {

		S6Transaction s6Transaction = new S6Transaction();

		String tranType = transactionTypeCodeFromChubb.getTranType();
		String chgType = transactionTypeCodeFromChubb.getChgType();
		Integer lineNum = 0;//TODO add value
		Integer countryCd = CountryCodeFromChubb.MEXICO.getKey();
		String campaign = "";//TODO add value
		PaymentInfo paymentInfo = getPaymentInfo(sib21Document);
	
		Product product = new Product();
		product.setProdCd("1");
		product.setCoverageCd(2);
		Product[] products = {product};//TODO getProducts
		
		Customer customer = getCustomer(sib21Document);
//		customer.setCustId(custId);
//		customer.setCustType(custType);
		Customer[] customers = {customer};
		
		

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();

		return processTransactionRequest;
	}
	
	public static Servicio getServicio(final SIB21Document sib21Document){
		return sib21Document!=null ? sib21Document.getServicio():null;
	} 	
	public static Function<SIB21Document,Servicio> getServicio = (  sib21Document) -> sib21Document != null ? sib21Document.getServicio(): null;
	
	//-----------------------
	
	public static PaymentInfo getPaymentInfo(final SIB21Document sib21Document){
		
		//TODO take values from Norma doc and do the condition to change them to chubb doc
		PaymentMethodCodeFromChubb paymentMethod = PaymentMethodCodeFromChubb.DEBITO_BANCARIO;
		PaymentFrequencyCodeFromChubb paymentFrequency = PaymentFrequencyCodeFromChubb.ANUAL;
		PaymentInfo paymentInfo = new PaymentInfo();
		
		paymentInfo.setPayMethod(paymentMethod.getKey());
		paymentInfo.setPayFreq(paymentFrequency.getKey());
		
//		paymentInfo.setPayMethod(getPaymentMethod(sib21Document));
//		paymentInfo.setPayFreq(getPaymentFreq(sib21Document));

		return paymentInfo;
	}
	public static Integer getPaymentMethod (final SIB21Document sib21Document){
		return 0;
	}
	public static Integer getPaymentFreq (final SIB21Document sib21Document){
		return 0;
	}
	
	//-----------------------
	
	public static Customer getCustomer(final SIB21Document sib21Document){
		return null;
	}
	public static String getCustId(final SIB21Document sib21Document){
		return null;
	}
	public static CustType getCustType(final SIB21Document sib21Document){
		return null;
	}
	public static Boolean getPolHolder(final SIB21Document sib21Document){
		return null;
	}
	public static Boolean getPolPayer(final SIB21Document sib21Document){
		return null;
	}
	public static String getLasName(final SIB21Document sib21Document){
		return null;
	}
	public static String getFirstName(final SIB21Document sib21Document){
		return null;
	}
	
	//-----------------------
	
	public static CustProd getCustProd(final SIB21Document sib21Document){
		return null;
	}
	public static String getProdCd(final SIB21Document sib21Document){
		return null;
	}
	public static Integer getBenLv(final SIB21Document sib21Document){
		return null;
	}
	
	//-----------------------
	
	//TODO Customers[].custAdds
	//-----------------------
	
	public static Address[] getAdresses (final SIB21Document sib21Document){
		return null;
	}
	public static Address getAddress(final SIB21Document sib21Document){
		return null;
	}
	public static Address getEmail(final SIB21Document sib21Document){
		return null;
	}
	
	//-----------------------
}
