package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class RatingFactorDetail extends ChubbDocument {

	private String reference;
	private String description;

	public RatingFactorDetail() {
	}

	public RatingFactorDetail(String reference, String description) {
		this.reference = reference;
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
