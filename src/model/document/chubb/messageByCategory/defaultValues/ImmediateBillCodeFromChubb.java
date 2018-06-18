package model.document.chubb.messageByCategory.defaultValues;

public enum ImmediateBillCodeFromChubb {
	
	DO_NOT_BILL_IMMEDIATELY(2050,"Do not bill immediately","01"),
	BILL_IMMEDIATELY_AND_RECONCILE_TO_PAID(2051,"Bill immediately and reconcile to Paid","02"),
	BILL_IMMEDIATELY(2052,"Bill immediately","03"),
	BILL_CURRENT_TRANSACTION_ADJUSTMENT_ONLY(2727,"Bill current transaction adjustment only","04"),
	BILL_CURRENT_TRANSACTION_ADJUSTMENT_ONLY_RECONCILE_TO_PAID(2728,"Bill current transaction adjustment only, reconcile to paid","05"),
	BILL_ALL_UNBILLED_ADJUSTMENTS_ONLY(2729,"Bill all unbilled adjustments only","06"),
	BILL_ALL_UNBILLED_ADJUSTMENTS_ONLY_RECONCILE_TO_PAID(2730,"Bill all unbilled adjustments only, reconcile to paid","07");
	
	private Integer key;
	private String description, msgID;

	private ImmediateBillCodeFromChubb(Integer key, String description, String msgID) {
		this.key = key;
		this.description = description;
		this.msgID = msgID;
	}

	public Integer getKey() {
		return key;
	}

	public String getDescription() {
		return description;
	}

	public String getMsgID() {
		return msgID;
	}
	

}
