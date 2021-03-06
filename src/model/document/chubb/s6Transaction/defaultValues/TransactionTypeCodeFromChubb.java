package model.document.chubb.s6Transaction.defaultValues;

public enum TransactionTypeCodeFromChubb {

	SALES("NEW", ""),
	ADD_INSURED("CHG", "ADI"),
	UPDATE_BENEFICIARY("CHG", "BEC"),
	BENEFIT_LEVEL_CHANGE("CHG", "BLC"),
	ENDORSEMENT_CHANGE("CHG", "PCH"),
	PAYMENT_CHANGE("CHG", "PPC"),
	REMOVE_INSURED("CHG", "REI"),
	REFERENCE_CHANGE("CHG", "RFC"),
	UNITS_CHANGE("CHG", "UNC"),
	NO_REFUND_CANCELLATION("CHG", "PCN"),
	REFUND_CANCELLATION("CHG", "PCR"),
	CUSTOMER_CHANGE("CHG", "CIC"),
	REINSTATEMENT("CHG", "RNS"),
	SUSPENSION("CHG", "SUS"),
	UN_SUSPENSION("CHG", "UNS");

	private String tranType, chgType;

	private TransactionTypeCodeFromChubb(String tranType, String chgType) {
		this.tranType = tranType;
		this.chgType = chgType;
	}

	public String getTranType() {
		return tranType;
	}

	public String getChgType() {
		return chgType;
	}

}
