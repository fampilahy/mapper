package model.document.chubb.request;

import model.document.chubb.ChubbDocument;
import model.document.chubb.S6Transaction;

public class ProcessTransactionRequest extends ChubbDocument {

	private Boolean allowDuplicate;
	private Boolean shouldCommit;
	private Boolean shouldReplace;
	private Boolean storeInQueue;
	private S6Transaction transaction;

	public ProcessTransactionRequest() {

	}

	public Boolean getAllowDuplicate() {
		return allowDuplicate;
	}

	public void setAllowDuplicate(Boolean allowDuplicate) {
		this.allowDuplicate = allowDuplicate;
	}

	public Boolean getShouldCommit() {
		return shouldCommit;
	}

	public void setShouldCommit(Boolean shouldCommit) {
		this.shouldCommit = shouldCommit;
	}

	public Boolean getShouldReplace() {
		return shouldReplace;
	}

	public void setShouldReplace(Boolean shouldReplace) {
		this.shouldReplace = shouldReplace;
	}

	public Boolean getStoreInQueue() {
		return storeInQueue;
	}

	public void setStoreInQueue(Boolean storeInQueue) {
		this.storeInQueue = storeInQueue;
	}

	public S6Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(S6Transaction transaction) {
		this.transaction = transaction;
	}

}
