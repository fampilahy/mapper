package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class ProductPremium extends ChubbDocument {

	private Integer benefitLevelID;
	private String individual;
	private Integer rf_Combo_SeqNum;
	private Integer referenceCode;
	private String referenceDescription;
	private String categoryCode;
	private String categoryDescription;
	private Double premium;

	public ProductPremium() {
	}

	public ProductPremium(Integer benefitLevelID, String individual, Integer rf_Combo_SeqNum, Integer referenceCode,
			String referenceDescription, String categoryCode, String categoryDescription, Double premium) {
		this.benefitLevelID = benefitLevelID;
		this.individual = individual;
		this.rf_Combo_SeqNum = rf_Combo_SeqNum;
		this.referenceCode = referenceCode;
		this.referenceDescription = referenceDescription;
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
		this.premium = premium;
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

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

}
