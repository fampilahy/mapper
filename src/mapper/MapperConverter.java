package mapper;

import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.s6Transaction.Address;
import model.document.chubb.s6Transaction.CustProd;
import model.document.chubb.s6Transaction.Customer;
import model.document.chubb.s6Transaction.PaymentInfo;
import model.document.chubb.s6Transaction.Product;
import model.document.chubb.s6Transaction.S6Transaction;
import model.document.chubb.s6Transaction.defaultValues.TransactionTypeCodeFromChubb;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;

public interface MapperConverter {

	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument(SIB21Document sib21Document);

	public static ProcessTransactionRequest processDefaultConvertSIB21DocumentToChubbDocument(
			SIB21Document sib21Document, TransactionTypeCodeFromChubb transactionTypeCodeFromChubb) {
		
		
		
		String tranType = transactionTypeCodeFromChubb.getTranType();
		String chgType = transactionTypeCodeFromChubb.getChgType();
		Integer lineNum = 0;
		
		Integer countryCd = CountryCodeFromChubb.MEXICO.getKey();
		String campaign = "";
		
		
		
		

		 CustProd custProd = new CustProd();
		// custProd.setProdCd(prodCd);
		// custProd.setBenLv(benLv);

		Address address = new Address();
		// address.setAddrId(addrId);
		// address.setAddrType(addrType);
		// address.setLine1(line1);

		Customer customer = new Customer();
		// customer.setCustId(custId);
		// customer.setCustType(custType);
		// customer.setPolHolder(polHolder);
		// customer.setPolPayer(polPayer);
		// customer.setLastName(lastName);
		// customer.setFirstName(firstName);

		Product product = new Product();
		// product.setProdCd(prodCd);
		// product.setCoverageCd(coverageCd);

		// -------------------------------------------------------------------------------------------
		PaymentInfo paymentInfo = new PaymentInfo();
		// paymentInfo.setPayMethod(payMethod);
		// paymentInfo.setPayFreq(payFreq);
		// for sales we just need these 2 infos, for other more info are needed
		// -------------------------------------------------------------------------------------------

		S6Transaction s6Transaction = new S6Transaction();

		// we gonna test SALES first (alta)

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();

		return processTransactionRequest;
	}

}
