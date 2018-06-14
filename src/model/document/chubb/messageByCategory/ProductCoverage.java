package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class ProductCoverage extends ChubbDocument{
	
	 private Integer benefitLevelID;
	    private String coverageCode;
	    private String coverageDescription;
	    private String individual;
	    private Double MI_CVG_AMT;
	    private Double MI_TAX_BEN_AMT;
	    private Double SPS_CVG_AMT;
	    private Double SP_TAX_BEN_AMT;
	    private Double DEP_CVG_AMT;
	    private Double DP_TAX_BEN_AMT;
	    private Double MALE_PCT;
	    private Double FEMALE_PCT;
	    private Double UNISEX_PCT;

	    public ProductCoverage() {
	    }

	    public ProductCoverage(
	           Integer benefitLevelID,
	           String coverageCode,
	           String coverageDescription,
	           String individual,
	           Double MI_CVG_AMT,
	           Double MI_TAX_BEN_AMT,
	           Double SPS_CVG_AMT,
	           Double SP_TAX_BEN_AMT,
	           Double DEP_CVG_AMT,
	           Double DP_TAX_BEN_AMT,
	           Double MALE_PCT,
	           Double FEMALE_PCT,
	           Double UNISEX_PCT) {
	           this.benefitLevelID = benefitLevelID;
	           this.coverageCode = coverageCode;
	           this.coverageDescription = coverageDescription;
	           this.individual = individual;
	           this.MI_CVG_AMT = MI_CVG_AMT;
	           this.MI_TAX_BEN_AMT = MI_TAX_BEN_AMT;
	           this.SPS_CVG_AMT = SPS_CVG_AMT;
	           this.SP_TAX_BEN_AMT = SP_TAX_BEN_AMT;
	           this.DEP_CVG_AMT = DEP_CVG_AMT;
	           this.DP_TAX_BEN_AMT = DP_TAX_BEN_AMT;
	           this.MALE_PCT = MALE_PCT;
	           this.FEMALE_PCT = FEMALE_PCT;
	           this.UNISEX_PCT = UNISEX_PCT;
	    }

		public Integer getBenefitLevelID() {
			return benefitLevelID;
		}

		public void setBenefitLevelID(Integer benefitLevelID) {
			this.benefitLevelID = benefitLevelID;
		}

		public String getCoverageCode() {
			return coverageCode;
		}

		public void setCoverageCode(String coverageCode) {
			this.coverageCode = coverageCode;
		}

		public String getCoverageDescription() {
			return coverageDescription;
		}

		public void setCoverageDescription(String coverageDescription) {
			this.coverageDescription = coverageDescription;
		}

		public String getIndividual() {
			return individual;
		}

		public void setIndividual(String individual) {
			this.individual = individual;
		}

		public Double getMI_CVG_AMT() {
			return MI_CVG_AMT;
		}

		public void setMI_CVG_AMT(Double mI_CVG_AMT) {
			MI_CVG_AMT = mI_CVG_AMT;
		}

		public Double getMI_TAX_BEN_AMT() {
			return MI_TAX_BEN_AMT;
		}

		public void setMI_TAX_BEN_AMT(Double mI_TAX_BEN_AMT) {
			MI_TAX_BEN_AMT = mI_TAX_BEN_AMT;
		}

		public Double getSPS_CVG_AMT() {
			return SPS_CVG_AMT;
		}

		public void setSPS_CVG_AMT(Double sPS_CVG_AMT) {
			SPS_CVG_AMT = sPS_CVG_AMT;
		}

		public Double getSP_TAX_BEN_AMT() {
			return SP_TAX_BEN_AMT;
		}

		public void setSP_TAX_BEN_AMT(Double sP_TAX_BEN_AMT) {
			SP_TAX_BEN_AMT = sP_TAX_BEN_AMT;
		}

		public Double getDEP_CVG_AMT() {
			return DEP_CVG_AMT;
		}

		public void setDEP_CVG_AMT(Double dEP_CVG_AMT) {
			DEP_CVG_AMT = dEP_CVG_AMT;
		}

		public Double getDP_TAX_BEN_AMT() {
			return DP_TAX_BEN_AMT;
		}

		public void setDP_TAX_BEN_AMT(Double dP_TAX_BEN_AMT) {
			DP_TAX_BEN_AMT = dP_TAX_BEN_AMT;
		}

		public Double getMALE_PCT() {
			return MALE_PCT;
		}

		public void setMALE_PCT(Double mALE_PCT) {
			MALE_PCT = mALE_PCT;
		}

		public Double getFEMALE_PCT() {
			return FEMALE_PCT;
		}

		public void setFEMALE_PCT(Double fEMALE_PCT) {
			FEMALE_PCT = fEMALE_PCT;
		}

		public Double getUNISEX_PCT() {
			return UNISEX_PCT;
		}

		public void setUNISEX_PCT(Double uNISEX_PCT) {
			UNISEX_PCT = uNISEX_PCT;
		}

}
