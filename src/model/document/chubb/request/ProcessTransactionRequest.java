package model.document.chubb.request;

import model.document.chubb.ChubbDocument;
import model.document.chubb.S6Transaction;

public class ProcessTransactionRequest extends ChubbDocument {

	// This flag indicates if the product included in the S6 transactions allows
	// or not more than one policy for the same customer.
	private Boolean allowDuplicate = false;

	// This is a flag that indicates if the transaction must be committed or not
	// in the S6 database.
	private Boolean shouldCommit = false;

	// This is a flag that indicates if the customer information must be
	// replaced by the one that is coming as part of the S6 transaction. It
	// applies when the customer already exists in the S6 database.
	private Boolean shouldReplace = false;

	// This is a flag that indicates if the transaction must be stored in the
	// service queue to be processed later when the transaction cannot be
	// processed in real time.
	private Boolean storeInQueue = false;

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
