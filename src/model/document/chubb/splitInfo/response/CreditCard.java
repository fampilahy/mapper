package model.document.chubb.splitInfo.response;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;

public class CreditCard extends ChubbDocument {

	private String creditCardCode;
	private String creditCardDescription;
	private Integer creditCardClass;
	private Calendar inactiveDate;
	private Boolean requiredExpirationDate;
	private String[] prefixes;
	private String[] templates;

	public CreditCard() {
	}

	public CreditCard(String creditCardCode, String creditCardDescription, Integer creditCardClass,
			Calendar inactiveDate, Boolean requiredExpirationDate, String[] prefixes, String[] templates) {
		this.creditCardCode = creditCardCode;
		this.creditCardDescription = creditCardDescription;
		this.creditCardClass = creditCardClass;
		this.inactiveDate = inactiveDate;
		this.requiredExpirationDate = requiredExpirationDate;
		this.prefixes = prefixes;
		this.templates = templates;

	}

	public String getCreditCardCode() {
		return creditCardCode;
	}

	public String getCreditCardDescription() {
		return creditCardDescription;
	}

	public Integer getCreditCardClass() {
		return creditCardClass;
	}

	public Calendar getInactiveDate() {
		return inactiveDate;
	}

	public Boolean getRequiredExpirationDate() {
		return requiredExpirationDate;
	}

	public String[] getPrefixes() {
		return prefixes;
	}

	public String[] getTemplates() {
		return templates;
	}

	public void setCreditCardCode(String creditCardCode) {
		this.creditCardCode = creditCardCode;
	}

	public void setCreditCardDescription(String creditCardDescription) {
		this.creditCardDescription = creditCardDescription;
	}

	public void setCreditCardClass(Integer creditCardClass) {
		this.creditCardClass = creditCardClass;
	}

	public void setInactiveDate(Calendar inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public void setRequiredExpirationDate(Boolean requiredExpirationDate) {
		this.requiredExpirationDate = requiredExpirationDate;
	}

	public void setPrefixes(String[] prefixes) {
		this.prefixes = prefixes;
	}

	public void setTemplates(String[] templates) {
		this.templates = templates;
	}
	
	
	

}
