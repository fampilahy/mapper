package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class Beneficiary extends ChubbDocument {

	private String notes="";
	private BeneficiaryDetail[] beneficiaries={};

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BeneficiaryDetail[] getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(BeneficiaryDetail[] beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public Beneficiary() {

	}

	public Beneficiary(String notes, BeneficiaryDetail[] beneficiaries) {
		this.notes = notes;
		this.beneficiaries = beneficiaries;
	}

}
