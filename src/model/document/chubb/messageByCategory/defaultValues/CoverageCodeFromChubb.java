package model.document.chubb.messageByCategory.defaultValues;

public enum CoverageCodeFromChubb {
	
	MAIN_INSURED_ONLY(1680,"Main Insured Only","MO"),
	MAIN_INSURED_AND_SPOUSE(1681,"Main Insured and Spouse","MS"),
	MAIN_INSURED_AND_FAMILY(1682,"Main Insured and Family","MF"),
	SPOUSE_ONLY(1683,"Spouse Only","SO"),
	SPOUSE_AND_DEPENDENT(1684,"Spouse and Dependent","SD"),
	DEPENDENT_ONLY(1685,"Dependent Only","DO"),
	MAIN_INSURED_AND_DEPENDENTS(1686,"Main Insured and Dependents","MD");
	
	private Integer key;
	private String description, msgID;

	private CoverageCodeFromChubb(Integer key, String description, String msgID) {
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
