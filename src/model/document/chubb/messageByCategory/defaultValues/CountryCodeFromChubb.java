package model.document.chubb.messageByCategory.defaultValues;

public enum CountryCodeFromChubb {

	BRAZIL (101,"Brazil","BZ"),
	MEXICO (159,"Mexico","MX"),
	ARGENTINA(92,"Argentina","AR"),
	PERU (168,"Peru","PE"),
	USA (198,"USA","US");
	
	private Integer key;
	private String description, msgID;

	private CountryCodeFromChubb(Integer key, String description, String msgID) {
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
