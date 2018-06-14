package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class ProductScheduledBenefit extends ChubbDocument {

	private Integer benefitLevelID;
	private String individual;
	private String benefitCode;
	private String benefitDescription;
	private String categoryCode;
	private String categoryDescription;
	private Integer rf_Combo_SeqNum;
	private Integer referenceCode;
	private String referenceDescription;
	private Double amount;

	public ProductScheduledBenefit() {
	}

	public ProductScheduledBenefit(Integer benefitLevelID, String individual, String benefitCode,
			String benefitDescription, String categoryCode, String categoryDescription, Integer rf_Combo_SeqNum,
			Integer referenceCode, String referenceDescription, Double amount) {
		this.benefitLevelID = benefitLevelID;
		this.individual = individual;
		this.benefitCode = benefitCode;
		this.benefitDescription = benefitDescription;
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
		this.rf_Combo_SeqNum = rf_Combo_SeqNum;
		this.referenceCode = referenceCode;
		this.referenceDescription = referenceDescription;
		this.amount = amount;
	}

	public Integer getBenefitLevelID() {
		return benefitLevelID;
	}

	public void setBenefitLevelID(Integer benefitLevelID) {
		this.benefitLevelID = benefitLevelID;
	}

	public String getIndividual() {
		return individual;
	}

	public void setIndividual(String individual) {
		this.individual = individual;
	}

	public String getBenefitCode() {
		return benefitCode;
	}

	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public String getBenefitDescription() {
		return benefitDescription;
	}

	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Integer getRf_Combo_SeqNum() {
		return rf_Combo_SeqNum;
	}

	public void setRf_Combo_SeqNum(Integer rf_Combo_SeqNum) {
		this.rf_Combo_SeqNum = rf_Combo_SeqNum;
	}

	public Integer getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(Integer referenceCode) {
		this.referenceCode = referenceCode;
	}

	public String getReferenceDescription() {
		return referenceDescription;
	}

	public void setReferenceDescription(String referenceDescription) {
		this.referenceDescription = referenceDescription;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
