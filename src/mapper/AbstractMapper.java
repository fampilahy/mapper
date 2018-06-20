package mapper;

import model.document.chubb.s6Transaction.defaultValues.TransactionTypeCodeFromChubb;
import model.document.sib21.SIB21Document;

public abstract class AbstractMapper implements Converter {

	protected TransactionTypeCodeFromChubb transactionTypeCodeFromChubb = TransactionTypeCodeFromChubb.SALES;
	protected SIB21Document sib21Document;

	public TransactionTypeCodeFromChubb getTransactionTypeCodeFromChubb() {
		return transactionTypeCodeFromChubb;
	}

	public void setTransactionTypeCodeFromChubb(TransactionTypeCodeFromChubb transactionTypeCodeFromChubb) {
		this.transactionTypeCodeFromChubb = transactionTypeCodeFromChubb;
	}

	public SIB21Document getSib21Document() {
		return sib21Document;
	}

	public void setSib21Document(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

}
