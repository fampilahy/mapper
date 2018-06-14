package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class RatingFactor extends ChubbDocument {

	private String category;
	private String categoryDescription;
	private RatingFactorDetail[] ratingFactorDetails;

	public RatingFactor() {
	}

	public RatingFactor(String category, String categoryDescription, RatingFactorDetail[] ratingFactorDetails) {
		this.category = category;
		this.categoryDescription = categoryDescription;
		this.ratingFactorDetails = ratingFactorDetails;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public RatingFactorDetail[] getRatingFactorDetails() {
		return ratingFactorDetails;
	}

	public void setRatingFactorDetails(RatingFactorDetail[] ratingFactorDetails) {
		this.ratingFactorDetails = ratingFactorDetails;
	}
	
	

}
