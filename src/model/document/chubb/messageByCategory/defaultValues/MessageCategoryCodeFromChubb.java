package model.document.chubb.messageByCategory.defaultValues;

public enum MessageCategoryCodeFromChubb {
	
	PROVINCE_CODE ("36"),
	COUNTRY_CODE ("27"),//not all value collected
	ADDRESS_TYPE_CODE ("39"),
	TITLE ("3"),
	LANGUAGE_CODE ("5"),//not all value collected
	SEX_CODE ("90000"),
	EXCLUSION_CODE ("CONV5"),//not all value collected
	CALL_PREFERENCE_CODE ("15"),
	NATIONALITY_CODE ("6"),//not all value collected
	RACE_CODE ("7"),//no value from chubb
	RELIGION_CODE ("8"),//no value from chubb
	EDUCATION_CODE ("9"),//no value from chubb
	OCCUPATION_CODE ("CNV3"),//not all value collected
	INDUSTRY_CODE ("CNV4"),
	MARITAL_STATUS_CODE ("12"),
	SENSITIVITY_CODE ("42"),
	IMMEDIATE_BILL_CODE ("IMMBILL"),
	PAYMENT_METHOD ("L6"),
	PAYMENT_FREQUENCY ("L5"),
	TAX_APPLICATION_CODE ("SE"),
	REFERENCE_KEY ("POLREF"),
	COVERAGE_CODE ("COVERAGE"),
	PREMIUM_OVERRIDE_REASON ("SW"),
	CANCEL_REASON ("SC"),
	ENDORSEMENT_REASON ("SB"),
	SUSPENSION_REASON ("SS"),
	CORRESPONDANCE_TYPE ("DLVRYCHN");
	
	private MessageCategoryCodeFromChubb(String categoryCode){
		this.categoryCode = categoryCode;
	}
	
	private String categoryCode ;

	public String getCategoryCode() {
		return categoryCode;
	}


}
