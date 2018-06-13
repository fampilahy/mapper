package model.document.chubb;

public enum TransactionFromChubb {

	SALES("NEW", ""),
	ADD_INSURED("CHG", ""),
	UPDATE_BENEFICIARY("CHG", ""),
	BENEFIT_LEVEL_CHANGE("CHG", ""),
	ENDORSEMENT_CHANGE("CHG", ""),
	PAYMENT_CHANGE("CHG", ""),
	REMOVE_INSURED("CHG", ""),
	REFERENCE_CHANGE("CHG", ""),
	UNITS_CHANGE("CHG", ""),
	NO_REFUND_CANCELLATION("CHG", ""),
	REFUND_CANCELLATION("CHG", ""),
	CUSTOMER_CHANGE("CHG", ""),
	REINSTATEMENT("CHG", ""),
	SUSPENSION("CHG", ""),
	UN_SUSPENSION("CHG", "");

	private String tranType, chgType;

	TransactionFromChubb(String tranType, String chgType) {
		this.tranType = tranType;
		this.chgType = chgType;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public String getChgType() {
		return chgType;
	}

	public void setChgType(String chgType) {
		this.chgType = chgType;
	}

}
