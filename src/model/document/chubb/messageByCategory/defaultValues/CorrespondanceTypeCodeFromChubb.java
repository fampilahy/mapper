package model.document.chubb.messageByCategory.defaultValues;

public enum CorrespondanceTypeCodeFromChubb {

	TEST_PRINT_OUT(1807,"Test Print Output","TEST"),
	EMAIL(1993,"E-Mail","EMAIL"),
	PRINT(1994,"Print","PRINT"),
	PRINT_PREVIEW(1995,"Print Preview","PREVIEW"),
	BOTH(2898,"Both","BOTH"),
	EXTERNAL_MERGE_PRINT(2957,"External Merge Print","EXTERNAL_PRINT"),
	EXTERNAL_MERGE_E_MAIL(2958,"External Merge E-Mail","EXTERNAL_EMAIL");
	
	private Integer key;
	private String description, msgID;

	private CorrespondanceTypeCodeFromChubb(Integer key, String description, String msgID) {
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
