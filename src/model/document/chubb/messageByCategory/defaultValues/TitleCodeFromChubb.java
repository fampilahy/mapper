package model.document.chubb.messageByCategory.defaultValues;

public enum TitleCodeFromChubb {
	
	SR (100767,"Sr.","05"),
	SRA (100769,"Sra.","06"),
	MRS(100908,"Mrs.","02"),
	MS(100910,"Ms.","03"),
	MISS(101126,"Miss","04"),
	STA(101591,"Sta.","07"),
	SA(101733,"Sa.","08"),
	MR(101996,"Mr.","01");
	
	private Integer key;
	private String description, msgID;

	private TitleCodeFromChubb(Integer key, String description, String msgID) {
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
