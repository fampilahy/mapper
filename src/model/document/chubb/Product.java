package model.document.chubb;

import model.document.chubb.contract.Mandatory;

public class Product extends ChubbDocument {

	    @Mandatory private  String prodCd;
	    @Mandatory private  Integer coverageCd;
	    private  Integer depNum;
	    private  Double premiumOverAmt;
	    private  String premiumOverExp;
	    private  Integer premiumOverRs;
	    
		public String getProdCd() {
			return prodCd;
		}
		public void setProdCd(String prodCd) {
			this.prodCd = prodCd;
		}
		public Integer getCoverageCd() {
			return coverageCd;
		}
		public void setCoverageCd(Integer coverageCd) {
			this.coverageCd = coverageCd;
		}
		public Integer getDepNum() {
			return depNum;
		}
		public void setDepNum(Integer depNum) {
			this.depNum = depNum;
		}
		public Double getPremiumOverAmt() {
			return premiumOverAmt;
		}
		public void setPremiumOverAmt(Double premiumOverAmt) {
			this.premiumOverAmt = premiumOverAmt;
		}
		public String getPremiumOverExp() {
			return premiumOverExp;
		}
		public void setPremiumOverExp(String premiumOverExp) {
			this.premiumOverExp = premiumOverExp;
		}
		public Integer getPremiumOverRs() {
			return premiumOverRs;
		}
		public void setPremiumOverRs(Integer premiumOverRs) {
			this.premiumOverRs = premiumOverRs;
		}
	    
	    public Product(){
	    	
	    }
	
}
