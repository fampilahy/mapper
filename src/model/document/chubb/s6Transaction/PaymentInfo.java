package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;
import model.document.chubb.contract.Mandatory;
import model.document.chubb.contract.MandatoryOnDemand;

public class PaymentInfo extends ChubbDocument {

	@Mandatory private Integer payMethod;
	@Mandatory private Integer payFreq;
	private Integer taxAppCd;
	private String nameOnBill;
	private Integer taxJurisCd;
	private String employeeNum;
	@MandatoryOnDemand private Integer debitDay;
	@MandatoryOnDemand private String billAccNum;
	@MandatoryOnDemand private String bankCd;
	@MandatoryOnDemand private String branchCd;
	@MandatoryOnDemand private String ccCd;
	private String expDate;
	@MandatoryOnDemand private String collCd;
	private String last5BillAccNum;
	
	public Integer getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}
	public Integer getPayFreq() {
		return payFreq;
	}
	public void setPayFreq(Integer payFreq) {
		this.payFreq = payFreq;
	}
	public Integer getTaxAppCd() {
		return taxAppCd;
	}
	public void setTaxAppCd(Integer taxAppCd) {
		this.taxAppCd = taxAppCd;
	}
	public String getNameOnBill() {	
		return nameOnBill;
	}
	public void setNameOnBill(String nameOnBill) {
		this.nameOnBill = nameOnBill;
	}
	public Integer getTaxJurisCd() {
		return taxJurisCd;
	}
	public void setTaxJurisCd(Integer taxJurisCd) {
		this.taxJurisCd = taxJurisCd;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public Integer getDebitDay() {
		return debitDay;
	}
	public void setDebitDay(Integer debitDay) {
		this.debitDay = debitDay;
	}
	public String getBillAccNum() {
		return billAccNum;
	}
	public void setBillAccNum(String billAccNum) {
		this.billAccNum = billAccNum;
	}
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public String getCcCd() {
		return ccCd;
	}
	public void setCcCd(String ccCd) {
		this.ccCd = ccCd;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCollCd() {
		return collCd;
	}
	public void setCollCd(String collCd) {
		this.collCd = collCd;
	}
	public String getLast5BillAccNum() {
		return last5BillAccNum;
	}
	public void setLast5BillAccNum(String last5BillAccNum) {
		this.last5BillAccNum = last5BillAccNum;
	}

	public PaymentInfo(){
		
	}
}
