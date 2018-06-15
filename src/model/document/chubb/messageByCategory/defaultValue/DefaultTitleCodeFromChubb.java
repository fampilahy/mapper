package model.document.chubb.messageByCategory.defaultValue;

public enum DefaultTitleCodeFromChubb {
	
	
	SR (100767,"Sr.","05"),
	SRA (100769,"Sra.","06"),
	MRS(100908,"Mrs.","02");
	
	private Integer key;
	private String description, msgID;

	private DefaultTitleCodeFromChubb(Integer key, String description, String msgID) {
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
