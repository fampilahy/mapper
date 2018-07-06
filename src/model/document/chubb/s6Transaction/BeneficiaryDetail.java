package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class BeneficiaryDetail extends ChubbDocument{

	private String name="";
	private String relationship="";
	private Double percentage=0d;
	private String personalID="";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getPersonalID() {
		return personalID;
	}
	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}
	
	public BeneficiaryDetail(){
		
	}
	
	
	
	
}
