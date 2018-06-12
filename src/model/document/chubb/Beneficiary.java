package model.document.chubb;

public class Beneficiary extends ChubbDocument{

	
	private String 	notes;
	private BeneficiaryDetail[]  beneficiaries;
	
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
	
	
	
}
