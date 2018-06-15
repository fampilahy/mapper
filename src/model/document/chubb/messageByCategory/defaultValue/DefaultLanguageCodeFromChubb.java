package model.document.chubb.messageByCategory.defaultValue;

public enum DefaultLanguageCodeFromChubb {

	ENGLISH(229), SPANISH(230), PORTUGUESE(247);

	private DefaultLanguageCodeFromChubb(Integer languageCode) {
		this.languageCode = languageCode;
	}

	private Integer languageCode;

	public Integer getLanguageCode() {
		return this.languageCode;
	}

}
