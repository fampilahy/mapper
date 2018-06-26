package model.document.chubb.splitInfo.response;

import model.document.chubb.ChubbDocument;

public class Branch extends ChubbDocument {
	
	
	private String branchCode;

    private String branchName;

    public Branch() {
    }

    public Branch(
           String branchCode,
           String branchName) {
           this.branchCode = branchCode;
           this.branchName = branchName;
    }

	public String getBranchCode() {
		return branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
    
    

}
