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

	
	
}
