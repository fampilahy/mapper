package model.document.chubb.messageByCategory.defaultValue;

public enum MessageCategoryCodeFromChubb {
	
	PROVINCE_CODE ("36"),
	COUNTRY_CODE ("27"),
	ADDRESS_TYPE_CODE ("39"),
	TITLE ("3"),//TOCONTINUEHE
	LANGUAGE_CODE ("5"),
	SEX_CODE ("90000"),
	EXCLUSION_CODE ("CONV5"),
	CALL_PREFERENCE_CODE ("15"),
	NATIONALITY_CODE ("6"),
	RACE_CODE ("7"),
	RELIGION_CODE ("8"),
	EDUCATION_CODE ("9"),
	OCCUPATION_CODE ("CNV3"),
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
