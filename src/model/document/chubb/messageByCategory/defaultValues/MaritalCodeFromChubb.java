package model.document.chubb.messageByCategory.defaultValues;

public enum MaritalCodeFromChubb {
	
	SEPARATED (100748,"Separated","03"),
	SINGLE (100760,"Single","04"),
	MARRIED(101107,"Married","02"),
	DIVORCED(101236,"Divorced.","01"),
	WODOWED(101567,"Wodowed","05"),
	OTHERS(102043,"Others","99");
	
	
	private Integer key;
	private String description, msgID;

	private MaritalCodeFromChubb(Integer key, String description, String msgID) {
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
