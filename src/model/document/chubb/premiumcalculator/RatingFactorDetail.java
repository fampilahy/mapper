package model.document.chubb.premiumcalculator;

import model.document.chubb.ChubbDocument;

public class RatingFactorDetail extends ChubbDocument {

	private int reference;

	public RatingFactorDetail() {
	}

	public RatingFactorDetail(int reference) {
		this.reference = reference;
	}

	public int getReference() {
		return reference;
	}

}
