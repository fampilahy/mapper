package model.document.chubb.s6transaction.response;

import model.document.chubb.ChubbDocument;

public class S6TransactionResult extends ChubbDocument {

	private String s6TransactionID;
	private String policyNumber;
	private S6TransactionStatus statusCode;
	private String rejectionCode;
	private String rejectionReason;
	private String rejectionDetails;
	private String botlTransaction;

	public S6TransactionResult() {

	}

	public String getS6TransactionID() {
		return s6TransactionID;
	}

	public void setS6TransactionID(String s6TransactionID) {
		this.s6TransactionID = s6TransactionID;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public S6TransactionStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(S6TransactionStatus statusCode) {
		this.statusCode = statusCode;
	}

	public String getRejectionCode() {
		return rejectionCode;
	}

	public void setRejectionCode(String rejectionCode) {
		this.rejectionCode = rejectionCode;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public String getRejectionDetails() {
		return rejectionDetails;
	}

	public void setRejectionDetails(String rejectionDetails) {
		this.rejectionDetails = rejectionDetails;
	}

	public String getBotlTransaction() {
		return botlTransaction;
	}

	public void setBotlTransaction(String botlTransaction) {
		this.botlTransaction = botlTransaction;
	}

}
