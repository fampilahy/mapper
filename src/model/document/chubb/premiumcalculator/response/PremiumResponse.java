package model.document.chubb.premiumcalculator.response;

import model.document.chubb.ChubbDocument;

public class PremiumResponse extends ChubbDocument {

	private double premium1;
	private double tax1;
	private double totalPremium;
	private boolean hasError;
	private String errorCode;
	private String errorMessage;

	public PremiumResponse() {
	}

	public PremiumResponse(double premium1, double tax1, double totalPremium, boolean hasError, String errorCode,
			String errorMessage) {
		this.premium1 = premium1;
		this.tax1 = tax1;
		this.totalPremium = totalPremium;
		this.hasError = hasError;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public double getPremium1() {
		return premium1;
	}

	public void setPremium1(double premium1) {
		this.premium1 = premium1;
	}

	public double getTax1() {
		return tax1;
	}

	public void setTax1(double tax1) {
		this.tax1 = tax1;
	}

	public double getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
