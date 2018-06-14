package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class ProductSpecificDetail extends ChubbDocument {

	private Integer productSpecificDataCode;
	private String productSpecificDataDescription;
	private Boolean isRequired;

	public ProductSpecificDetail() {
	}

	public ProductSpecificDetail(Integer productSpecificDataCode, String productSpecificDataDescription,
			Boolean isRequired) {
		this.productSpecificDataCode = productSpecificDataCode;
		this.productSpecificDataDescription = productSpecificDataDescription;
		this.isRequired = isRequired;
	}

	public Integer getProductSpecificDataCode() {
		return productSpecificDataCode;
	}

	public void setProductSpecificDataCode(Integer productSpecificDataCode) {
		this.productSpecificDataCode = productSpecificDataCode;
	}

	public String getProductSpecificDataDescription() {
		return productSpecificDataDescription;
	}

	public void setProductSpecificDataDescription(String productSpecificDataDescription) {
		this.productSpecificDataDescription = productSpecificDataDescription;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

}
