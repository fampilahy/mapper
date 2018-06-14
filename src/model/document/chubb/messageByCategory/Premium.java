package model.document.chubb.messageByCategory;

public class Premium {

	private String individual;

	private java.math.BigDecimal premiumValue;

	public Premium() {
	}

	public Premium(String individual, java.math.BigDecimal premiumValue) {
		this.individual = individual;
		this.premiumValue = premiumValue;
	}

	public String getIndividual() {
		return individual;
	}

	public void setIndividual(String individual) {
		this.individual = individual;
	}

	public java.math.BigDecimal getPremiumValue() {
		return premiumValue;
	}

	public void setPremiumValue(java.math.BigDecimal premiumValue) {
		this.premiumValue = premiumValue;
	}

	
	
}
