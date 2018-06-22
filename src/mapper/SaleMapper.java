package mapper;

import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;

public class SaleMapper extends AbstractMapper {

	public SaleMapper(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

	@Override
	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument() {
		return Converter.processDefaultConvertSIB21DocumentToChubbDocument(sib21Document,
				this.transactionTypeCodeFromChubb);
	}

	
	
	
}



