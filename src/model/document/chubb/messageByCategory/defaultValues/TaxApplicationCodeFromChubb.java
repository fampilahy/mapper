package model.document.chubb.messageByCategory.defaultValues;

public enum TaxApplicationCodeFromChubb {

	NO_TAX_EXCLUSIONS(1395,"No Tax Exclusions","00"),
	EXCLUDE_ALL_TAXES(1396,"Exclude All Taxes","99"),
	ALL_TAXES_INCLUDED_IN_AMOUNT(1956,"All taxes included in amount","98");
	
	private Integer key;
	private String description, msgID;

	private TaxApplicationCodeFromChubb(Integer key, String description, String msgID) {
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
