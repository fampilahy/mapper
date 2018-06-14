package model.document.chubb.messageByCategory.request;

import model.document.chubb.ChubbDocument;

public class GetMessagesByCategoryRequest extends ChubbDocument {

	private String categoryCode;
	private String countryCode;
	private Integer languageCode;

	public GetMessagesByCategoryRequest() {
	}

	public GetMessagesByCategoryRequest(String categoryCode, String countryCode,
			Integer languageCode) {
		this.categoryCode = categoryCode;
		this.countryCode = countryCode;
		this.languageCode = languageCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Integer getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(Integer languageCode) {
		this.languageCode = languageCode;
	}

}
