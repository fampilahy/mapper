package model.document.chubb.messageByCategory.defaultValues;

public enum CallPreferenceCodeFromChubb {

	MORNING(101145,"Morning","01"),
	EVENING(101265,"Evening","03"),
	AFTERNOON(101465,"Afternoon","02");
	
	private Integer key;
	private String description, msgID;

	private CallPreferenceCodeFromChubb(Integer key, String description, String msgID) {
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
