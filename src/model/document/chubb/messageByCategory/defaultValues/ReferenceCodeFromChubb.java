package model.document.chubb.messageByCategory.defaultValues;

public enum ReferenceCodeFromChubb {

	REF1(1687,"REF1","REF1"),
	REF2(1688,"REF2","REF2"),
	REF3(1689,"REF3","REF3"),
	REF4(1690,"REF4","REF4"),
	PROSPECT_REFERENCE(1691,"Prospect Reference","REF5"),
	REF6(1692,"REF6","REF6"),
	REF7(1693,"REF7","REF7"),
	REF8(1694,"REF8","REF8"),
	REF9(1695,"REF9","REF9"),
	GLOBAL_MARKETING_ID(1696,"Global Marketing ID","REF10"),
	BROKERPRO_REFERENCE_NUMBER(3690,"BrokerPro Reference Number","REF99"),
	DIGITAL_MKEY(3737,"Digital_mkey","POLREF11"),
	CAMPAIGN(3738,"Campaign","POLREF12"),
	SOURCE(3739,"Source","POLREF13"),
	COUNTRY(3740,"Country","POLREF14"),
	PRODUCT(3741,"Product","POLREF15"),
	MEDIUM(3742,"Medium","POLREF16"),
	TARGET(3743,"Target","POLREF17"),
	CONTENT(3744,"Content","POLREF18"),
	TERMS(3745,"Terms","POLREF19"),
	CYBER_LICENSE(3746,"Cyber_License","POLREF20");
	
	private Integer key;
	private String description, msgID;

	private ReferenceCodeFromChubb(Integer key, String description, String msgID) {
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
