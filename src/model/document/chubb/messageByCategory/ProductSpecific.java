package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class ProductSpecific extends ChubbDocument {

	private String categoryCode;
	private String categoryDescription;
	private String collectingLevel;
	private Boolean allowMultipleValues;
	private ProductSpecificDetail[] productSpecificDetails;

	public ProductSpecific() {
	}

	public ProductSpecific(String categoryCode, String categoryDescription, String collectingLevel,
			Boolean allowMultipleValues, ProductSpecificDetail[] productSpecificDetails) {
		this.categoryCode = categoryCode;
		this.categoryDescription = categoryDescription;
		this.collectingLevel = collectingLevel;
		this.allowMultipleValues = allowMultipleValues;
		this.productSpecificDetails = productSpecificDetails;
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

	public String getCollectingLevel() {
		return collectingLevel;
	}

	public void setCollectingLevel(String collectingLevel) {
		this.collectingLevel = collectingLevel;
	}

	public Boolean getAllowMultipleValues() {
		return allowMultipleValues;
	}

	public void setAllowMultipleValues(Boolean allowMultipleValues) {
		this.allowMultipleValues = allowMultipleValues;
	}

	public ProductSpecificDetail[] getProductSpecificDetails() {
		return productSpecificDetails;
	}

	public void setProductSpecificDetails(ProductSpecificDetail[] productSpecificDetails) {
		this.productSpecificDetails = productSpecificDetails;
	}

}
