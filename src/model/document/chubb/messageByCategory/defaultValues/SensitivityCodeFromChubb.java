package model.document.chubb.messageByCategory.defaultValues;

public enum SensitivityCodeFromChubb {

	COMPLAINT_REGISTERED(228,"Complaint Registered","99"),
	UPDATE_ADDRESS_INFO(2951,"Update Address Info","AA"),
	POLIZA_REACTIVADA(100426,"Poliza Reactivada","24"),
	SE_ENVIA_INFORMACION_A_SINIESTROS(100486,"Se envia informacion a Siniestros","23"),
	UPDATE_RESIDENTIAL_ADDRESS(100624,"Update residential address","19"),
	SENIOR_GOVT_OFFICIAL(100743,"Senior Govt Official","01");
	
	private Integer key;
	private String description, msgID;

	private SensitivityCodeFromChubb(Integer key, String description, String msgID) {
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
