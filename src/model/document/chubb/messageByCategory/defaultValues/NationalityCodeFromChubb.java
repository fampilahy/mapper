package model.document.chubb.messageByCategory.defaultValues;

public enum NationalityCodeFromChubb {

	MEXICO(1002256,"México","ak"),
	FRANCIA(1002266,"Francia","au"),
	ESTADOS_UNIDOS(1002248,"Estados Unidos","ac");
	
	private Integer key;
	private String description, msgID;

	private NationalityCodeFromChubb(Integer key, String description, String msgID) {
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
