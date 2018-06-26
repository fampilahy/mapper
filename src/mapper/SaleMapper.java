package mapper;

import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.defaultValues.ProductRelationSIB21Chubb;
import model.document.sib21.SIB21Document;

public class SaleMapper extends AbstractMapper {

	public SaleMapper(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

	@Override
	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument() {
		return Converter.processDefaultConversionSIB21DocumentToChubbDocument(sib21Document,
				this.transactionTypeCodeFromChubb, getProductRelationSIB21Chubb(sib21Document));
	}

	public ProductRelationSIB21Chubb getProductRelationSIB21Chubb(SIB21Document sib21Document) {
		return ProductRelationSIB21Chubb.ORO; // TODO for now we just implement
												// ORO for test then we will add
												// accordingly to time;
	}

}
