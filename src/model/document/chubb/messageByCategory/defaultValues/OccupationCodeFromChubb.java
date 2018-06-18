package model.document.chubb.messageByCategory.defaultValues;

public enum OccupationCodeFromChubb {
	
	CUSTOMER_SERVICE(2451,"Customer Service","00166"),
	DISABLED(2452,"Disabled","00167");
	
	private Integer key;
	private String description, msgID;

	private OccupationCodeFromChubb(Integer key, String description, String msgID) {
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
