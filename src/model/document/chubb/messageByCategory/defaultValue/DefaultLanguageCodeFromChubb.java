package model.document.chubb.messageByCategory.defaultValue;

public enum DefaultLanguageCodeFromChubb {

	ENGLISH (229,"English","01"),
	SPANISH (230,"Spanish","02"),
	PORTUGUESE(247,"Portuguese","20");
	
	private Integer key;
	private String description, msgID;

	private DefaultLanguageCodeFromChubb(Integer key, String description, String msgID) {
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
