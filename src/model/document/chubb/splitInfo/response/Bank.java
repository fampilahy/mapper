package model.document.chubb.splitInfo.response;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;

public class Bank extends ChubbDocument{
	
	
	private String bankCode;
    private String bankName;
    private Branch[] branches;
    private Calendar inactiveDate;

    public Bank() {
    }

    public String getBankCode() {
		return bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public Branch[] getBranches() {
		return branches;
	}

	public Calendar getInactiveDate() {
		return inactiveDate;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBranches(Branch[] branches) {
		this.branches = branches;
	}

	public void setInactiveDate(Calendar inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public Bank(
           String bankCode,
           String bankName,
           Branch[] branches,
           Calendar inactiveDate) {
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.branches = branches;
           this.inactiveDate = inactiveDate;
    }

    
    
    
    
}
