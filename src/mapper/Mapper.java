package mapper;

import model.document.chubb.Address;
import model.document.chubb.CustProd;
import model.document.chubb.Customer;
import model.document.chubb.PaymentInfo;
import model.document.chubb.Product;
import model.document.chubb.S6Transaction;
import model.document.chubb.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;

public class Mapper {

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
		
		
		

		ProcessTransactionRequest processTransactionRequest = new ProcessTransactionRequest();
		
		return processTransactionRequest;
	}

}
