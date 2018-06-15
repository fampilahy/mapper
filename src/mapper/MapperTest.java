package mapper;

import model.document.chubb.s6Transaction.Address;
import model.document.chubb.s6Transaction.CustProd;
import model.document.chubb.s6Transaction.Customer;
import model.document.chubb.s6Transaction.PaymentInfo;
import model.document.chubb.s6Transaction.Product;
import model.document.chubb.s6Transaction.S6Transaction;
import model.document.chubb.s6Transaction.defaultValue.TransactionFromChubb;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;

public class MapperTest {

	public static ProcessTransactionRequest convertSIB21DocumentToChubbDocument(SIB21Document sib21Document) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// TODO mapping process from SIB21Document to TransactionRequestDocument

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
		TransactionFromChubb transaction = TransactionFromChubb.SALES;
		
		//we gonna test SALES first (alta)
		s6Transaction.setTranType(transaction.getTranType());
		s6Transaction.setChgType(transaction.getChgType());
		
		
		
		

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();
		
		return processTransactionRequest;
	}

}
