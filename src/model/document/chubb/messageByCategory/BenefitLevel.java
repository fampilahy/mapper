package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class BenefitLevel extends ChubbDocument {

	private Integer benefitLevelCode;
	private String benefitLevelDescription;
	private Premium[] premiums;
	private Double MAX_BEN_AMT_MI;
	private Double MAX_BEN_AMT_SP;
	private Double MAX_BEN_AMT_DP;

	public BenefitLevel() {
	}

	public BenefitLevel(Integer benefitLevelCode, String benefitLevelDescription, Premium[] premiums,
			Double MAX_BEN_AMT_MI, Double MAX_BEN_AMT_SP, Double MAX_BEN_AMT_DP) {
		this.benefitLevelCode = benefitLevelCode;
		this.benefitLevelDescription = benefitLevelDescription;
		this.premiums = premiums;
		this.MAX_BEN_AMT_MI = MAX_BEN_AMT_MI;
		this.MAX_BEN_AMT_SP = MAX_BEN_AMT_SP;
		this.MAX_BEN_AMT_DP = MAX_BEN_AMT_DP;
	}

	public Integer getBenefitLevelCode() {
		return benefitLevelCode;
	}

	public void setBenefitLevelCode(Integer benefitLevelCode) {
		this.benefitLevelCode = benefitLevelCode;
	}

	public String getBenefitLevelDescription() {
		return benefitLevelDescription;
	}

	public void setBenefitLevelDescription(String benefitLevelDescription) {
		this.benefitLevelDescription = benefitLevelDescription;
	}

	public Premium[] getPremiums() {
		return premiums;
	}

	public void setPremiums(Premium[] premiums) {
		this.premiums = premiums;
	}

	public Double getMAX_BEN_AMT_MI() {
		return MAX_BEN_AMT_MI;
	}

	public void setMAX_BEN_AMT_MI(Double mAX_BEN_AMT_MI) {
		MAX_BEN_AMT_MI = mAX_BEN_AMT_MI;
	}

	public Double getMAX_BEN_AMT_SP() {
		return MAX_BEN_AMT_SP;
	}

	public void setMAX_BEN_AMT_SP(Double mAX_BEN_AMT_SP) {
		MAX_BEN_AMT_SP = mAX_BEN_AMT_SP;
	}

	public Double getMAX_BEN_AMT_DP() {
		return MAX_BEN_AMT_DP;
	}

	public void setMAX_BEN_AMT_DP(Double mAX_BEN_AMT_DP) {
		MAX_BEN_AMT_DP = mAX_BEN_AMT_DP;
	}

}
