package mapper;

import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;

public class AltaMapeador extends AbstractMapper {

	public AltaMapeador(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

	@Override
	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument(SIB21Document sib21Document) {
		return MapperConverter.processDefaultConvertSIB21DocumentToChubbDocument(sib21Document,
				this.transactionTypeCodeFromChubb);
	}

}
