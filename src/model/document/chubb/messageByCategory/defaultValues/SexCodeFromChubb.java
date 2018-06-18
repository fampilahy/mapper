package model.document.chubb.messageByCategory.defaultValues;

public enum SexCodeFromChubb {
	
	FEMENINO (600000,"Femenino","02"),
	MASCULINO (600001,"Masculino","01");
	
	private Integer key;
	private String description, msgID;

	private SexCodeFromChubb(Integer key, String description, String msgID) {
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
