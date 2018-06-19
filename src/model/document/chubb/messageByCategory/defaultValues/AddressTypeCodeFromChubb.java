package model.document.chubb.messageByCategory.defaultValues;

public enum AddressTypeCodeFromChubb {
	
	HOME(219,"Home","01"),
	MAIL(220,"Mail","02"),
	WORK(221,"Work","03");
	
	private Integer key;
	private String description, msgID;

	private AddressTypeCodeFromChubb(Integer key, String description, String msgID) {
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
