package model.document.chubb.messageByCategory.defaultValues;

public enum SuspensionReasonCodeFromChubb {

	
	// to fill 
	BATCH_ASSIGNED_POSS_MISS(1406,"Batch Assigned - Poss. Miss","00"),
	AWAITING_GIRO_O_DDA_APPROVAL(1407,"Awaiting GIRO/DDA Approval","01"),
	DATA_INCOMPLETE(1408,"Data Incomplete","02"),
	BOUNCEBACK(1409,"Bounceback","03"),
	AWAITING_CUSTOMER_GIRO_FORM(1410,"Awaiting Customer GIRO Form","04"),
	MISSING_REQUIRED_DATA_ELEMENTS(1411,"Missing Required Data Elements","05"),
	GENERAL_POLICY_HOLD(1412,"General Policy Hold","06"),
	SECURITY_HOLD(1413,"Security Hold","07");
	
	private Integer key;
	private String description, msgID;

	private SuspensionReasonCodeFromChubb(Integer key, String description, String msgID) {
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
