package model.document.chubb.messageByCategory.defaultValue;

public enum DefaultCountryCodeFromChubb {

	
	MEXICO ("MX"),
	ARGENTINA("AR");
	
	private DefaultCountryCodeFromChubb(String countryCode){
		this.countryCode = countryCode;
	}
	
	private String countryCode ;

	public String getCountryCode(){
		return countryCode;
	}
	
}
