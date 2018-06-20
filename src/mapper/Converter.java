package mapper;

import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentFrequencyCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.PaymentMethodCodeFromChubb;
import model.document.chubb.s6Transaction.Address;
import model.document.chubb.s6Transaction.CustProd;
import model.document.chubb.s6Transaction.Customer;
import model.document.chubb.s6Transaction.PaymentInfo;
import model.document.chubb.s6Transaction.Product;
import model.document.chubb.s6Transaction.S6Transaction;
import model.document.chubb.s6Transaction.defaultValues.TransactionTypeCodeFromChubb;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.PaymentFrequency;
import model.document.sib21.SIB21Document;

public interface Converter {

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument();

	public static ProcessTransactionRequest processDefaultConvertSIB21DocumentToChubbDocument(
			SIB21Document sib21Document, TransactionTypeCodeFromChubb transactionTypeCodeFromChubb) {
		
		S6Transaction s6Transaction = new S6Transaction();
		
		String tranType = transactionTypeCodeFromChubb.getTranType();
		
		
		String chgType = transactionTypeCodeFromChubb.getChgType();
		Integer lineNum = 0;
		
		Integer countryCd = CountryCodeFromChubb.MEXICO.getKey();
		String campaign = "";
		
		PaymentMethodCodeFromChubb paymentMethod = PaymentMethodCodeFromChubb.DEBITO_BANCARIO;
		PaymentFrequencyCodeFromChubb paymentFrequency = PaymentFrequencyCodeFromChubb.ANUAL;
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setPayMethod(paymentMethod.getKey());
		paymentInfo.setPayFreq(paymentFrequency.getKey());
		
		Product product = new Product();
		product.setProdCd("1");
		product.setCoverageCd(2);
		
		
		
		
		
		
		
		
		

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();

		return processTransactionRequest;
	}

}
