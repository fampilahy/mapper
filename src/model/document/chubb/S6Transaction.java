package model.document.chubb;

import java.util.Calendar;

import model.document.chubb.contract.Mandatory;
import model.document.chubb.contract.MandatoryOnDemand;

public class S6Transaction {

    @Mandatory private String tranType;
    @MandatoryOnDemand private String chgType;
    @Mandatory private Integer lineNum;
    private String polNum;
    @Mandatory private String countryCd;
    @Mandatory private String campaign;
    private Double refAmount;
    @Mandatory private PaymentInfo paymentInfo;
    @Mandatory private Product[] products;
    private String sellerId;
    private Calendar appDate;
    private String appNum;
    private Calendar efftDate;
    private String repPol;
    private CorrespondenceType correspondence;
    private String tranNote;
    private Calendar polExpDate;
    private Integer bill;
    private Integer cancelReason;
    private Integer endorsReason;
    private String providerId;
    @Mandatory private Customer[] customers;
    @Mandatory private Address[] addresses;
    private Reference[] references;
    private SuspReason[] suspensionsReason;
    private Double premiumCheck;
    private String diaryMessage;


	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public String getChgType() {
		return chgType;
	}

	public void setChgType(String chgType) {
		this.chgType = chgType;
	}

	public Integer getLineNum() {
		return lineNum;
	}

	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}

	public String getPolNum() {
		return polNum;
	}

	public void setPolNum(String polNum) {
		this.polNum = polNum;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public Double getRefAmount() {
		return refAmount;
	}

	public void setRefAmount(Double refAmount) {
		this.refAmount = refAmount;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public Calendar getAppDate() {
		return appDate;
	}

	public void setAppDate(Calendar appDate) {
		this.appDate = appDate;
	}

	public String getAppNum() {
		return appNum;
	}

	public void setAppNum(String appNum) {
		this.appNum = appNum;
	}

	public Calendar getEfftDate() {
		return efftDate;
	}

	public void setEfftDate(Calendar efftDate) {
		this.efftDate = efftDate;
	}

	public String getRepPol() {
		return repPol;
	}

	public void setRepPol(String repPol) {
		this.repPol = repPol;
	}

	public CorrespondenceType getCorrespondence() {
		return correspondence;
	}

	public void setCorrespondence(CorrespondenceType correspondence) {
		this.correspondence = correspondence;
	}

	public String getTranNote() {
		return tranNote;
	}

	public void setTranNote(String tranNote) {
		this.tranNote = tranNote;
	}

	public Calendar getPolExpDate() {
		return polExpDate;
	}

	public void setPolExpDate(Calendar polExpDate) {
		this.polExpDate = polExpDate;
	}

	public Integer getBill() {
		return bill;
	}

	public void setBill(Integer bill) {
		this.bill = bill;
	}

	public Integer getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(Integer cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Integer getEndorsReason() {
		return endorsReason;
	}

	public void setEndorsReason(Integer endorsReason) {
		this.endorsReason = endorsReason;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public Reference[] getReferences() {
		return references;
	}

	public void setReferences(Reference[] references) {
		this.references = references;
	}

	public SuspReason[] getSuspensionsReason() {
		return suspensionsReason;
	}

	public void setSuspensionsReason(SuspReason[] suspensionsReason) {
		this.suspensionsReason = suspensionsReason;
	}

	public Double getPremiumCheck() {
		return premiumCheck;
	}

	public void setPremiumCheck(Double premiumCheck) {
		this.premiumCheck = premiumCheck;
	}

	public String getDiaryMessage() {
		return diaryMessage;
	}

	public void setDiaryMessage(String diaryMessage) {
		this.diaryMessage = diaryMessage;
	}

	public S6Transaction(){
		
	}
	
	
	
}
