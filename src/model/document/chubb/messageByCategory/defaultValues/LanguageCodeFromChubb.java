package model.document.chubb.messageByCategory.defaultValues;

public enum LanguageCodeFromChubb {

	ENGLISH (229,"English","01"),
	SPANISH (230,"Spanish","02"),
	FRENCH (234,"French","07"),
	DUTCH (232,"Dutch","04"),
	ITALIAN (241,"Italian","14"),
	PORTUGUESE(247,"Portuguese","20");
	
	private Integer key;
	private String description, msgID;

	private LanguageCodeFromChubb(Integer key, String description, String msgID) {
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
