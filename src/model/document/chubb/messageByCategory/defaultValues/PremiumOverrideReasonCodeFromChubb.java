package model.document.chubb.messageByCategory.defaultValues;

public enum PremiumOverrideReasonCodeFromChubb {

	DESCUENTO_PROMOCIONAL(100455, "Descuento Promocional", "01");

	private Integer key;
	private String description, msgID;

	private PremiumOverrideReasonCodeFromChubb(Integer key, String description, String msgID) {
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
