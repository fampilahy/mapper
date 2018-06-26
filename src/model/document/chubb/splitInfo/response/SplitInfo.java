package model.document.chubb.splitInfo.response;

import java.util.Arrays;
import java.util.Calendar;
import model.document.chubb.ChubbDocument;
import model.document.chubb.messageByCategory.Product;
import model.document.chubb.splitInfo.Payment;
import model.document.chubb.splitInfo.PaymentFrequency;

public class SplitInfo extends ChubbDocument {

	private String splitKey;
	private String splitDescription;
	private Integer displayStatusCode;
	private String sponsorCode;
	private String splitType;
	private String sponsorName;
	private String prodPackage;
	private String prodPackageDescription;
	private String prodPackageMarketingDesc;
	private String policyPrefix;
	private Boolean billNow;
	private Boolean reconcileNow;
	private Integer currencyCode;
	private String currencyDescription;
	private Integer lob;
	private String lobDescription;
	private PaymentFrequency[] paymentFrequencies;
	private Payment[] payments;
	private Product[] products;
	private String primaryMediaCode;
	private String primaryMediaDescription;
	private Integer marketingApproachCode;
	private String marketingApproachDescription;
	private Calendar plannedLaunchDate;
	private Boolean solicitationCostRequired;
	private String policyTransactionCode;
	private Calendar policyEffectiveDate;
	private Integer minimumProductNumberRequired;
	private Integer maximumProductNumberRequired;
	private String premiumInfoLink;
	private Integer campaignStatus;
	private Integer approvedCode;
	private Calendar actualLaunchDate;
	private String policyTransactionDescription;
	private String sourceListDescription;

	public SplitInfo() {
	}

	public SplitInfo(String splitKey, String splitDescription, Integer displayStatusCode, String sponsorCode,
			String splitType, String sponsorName, String prodPackage, String prodPackageDescription,
			String prodPackageMarketingDesc, String policyPrefix, Boolean billNow, Boolean reconcileNow,
			Integer currencyCode, String currencyDescription, Integer lob, String lobDescription,
			PaymentFrequency[] paymentFrequencies, Payment[] payments, Product[] products, String primaryMediaCode,
			String primaryMediaDescription, Integer marketingApproachCode, String marketingApproachDescription,
			Calendar plannedLaunchDate, Boolean solicitationCostRequired, String policyTransactionCode,
			Calendar policyEffectiveDate, Integer minimumProductNumberRequired, Integer maximumProductNumberRequired,
			String premiumInfoLink, Integer campaignStatus, Integer approvedCode, Calendar actualLaunchDate,
			String policyTransactionDescription, String sourceListDescription) {
		this.splitKey = splitKey;
		this.splitDescription = splitDescription;
		this.displayStatusCode = displayStatusCode;
		this.sponsorCode = sponsorCode;
		this.splitType = splitType;
		this.sponsorName = sponsorName;
		this.prodPackage = prodPackage;
		this.prodPackageDescription = prodPackageDescription;
		this.prodPackageMarketingDesc = prodPackageMarketingDesc;
		this.policyPrefix = policyPrefix;
		this.billNow = billNow;
		this.reconcileNow = reconcileNow;
		this.currencyCode = currencyCode;
		this.currencyDescription = currencyDescription;
		this.lob = lob;
		this.lobDescription = lobDescription;
		this.paymentFrequencies = paymentFrequencies;
		this.payments = payments;
		this.products = products;
		this.primaryMediaCode = primaryMediaCode;
		this.primaryMediaDescription = primaryMediaDescription;
		this.marketingApproachCode = marketingApproachCode;
		this.marketingApproachDescription = marketingApproachDescription;
		this.plannedLaunchDate = plannedLaunchDate;
		this.solicitationCostRequired = solicitationCostRequired;
		this.policyTransactionCode = policyTransactionCode;
		this.policyEffectiveDate = policyEffectiveDate;
		this.minimumProductNumberRequired = minimumProductNumberRequired;
		this.maximumProductNumberRequired = maximumProductNumberRequired;
		this.premiumInfoLink = premiumInfoLink;
		this.campaignStatus = campaignStatus;
		this.approvedCode = approvedCode;
		this.actualLaunchDate = actualLaunchDate;
		this.policyTransactionDescription = policyTransactionDescription;
		this.sourceListDescription = sourceListDescription;
	}

	public String getSplitKey() {
		return splitKey;
	}

	public void setSplitKey(String splitKey) {
		this.splitKey = splitKey;
	}

	public String getSplitDescription() {
		return splitDescription;
	}

	public void setSplitDescription(String splitDescription) {
		this.splitDescription = splitDescription;
	}

	public Integer getDisplayStatusCode() {
		return displayStatusCode;
	}

	public void setDisplayStatusCode(Integer displayStatusCode) {
		this.displayStatusCode = displayStatusCode;
	}

	public String getSponsorCode() {
		return sponsorCode;
	}

	public void setSponsorCode(String sponsorCode) {
		this.sponsorCode = sponsorCode;
	}

	public String getSplitType() {
		return splitType;
	}

	public void setSplitType(String splitType) {
		this.splitType = splitType;
	}

	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public String getProdPackage() {
		return prodPackage;
	}

	public void setProdPackage(String prodPackage) {
		this.prodPackage = prodPackage;
	}

	public String getProdPackageDescription() {
		return prodPackageDescription;
	}

	public void setProdPackageDescription(String prodPackageDescription) {
		this.prodPackageDescription = prodPackageDescription;
	}

	public String getProdPackageMarketingDesc() {
		return prodPackageMarketingDesc;
	}

	public void setProdPackageMarketingDesc(String prodPackageMarketingDesc) {
		this.prodPackageMarketingDesc = prodPackageMarketingDesc;
	}

	public String getPolicyPrefix() {
		return policyPrefix;
	}

	public void setPolicyPrefix(String policyPrefix) {
		this.policyPrefix = policyPrefix;
	}

	public Boolean getBillNow() {
		return billNow;
	}

	public void setBillNow(Boolean billNow) {
		this.billNow = billNow;
	}

	public Boolean getReconcileNow() {
		return reconcileNow;
	}

	public void setReconcileNow(Boolean reconcileNow) {
		this.reconcileNow = reconcileNow;
	}

	public Integer getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyDescription() {
		return currencyDescription;
	}

	public void setCurrencyDescription(String currencyDescription) {
		this.currencyDescription = currencyDescription;
	}

	public Integer getLob() {
		return lob;
	}

	public void setLob(Integer lob) {
		this.lob = lob;
	}

	public String getLobDescription() {
		return lobDescription;
	}

	public void setLobDescription(String lobDescription) {
		this.lobDescription = lobDescription;
	}

	public PaymentFrequency[] getPaymentFrequencies() {
		return paymentFrequencies;
	}

	public void setPaymentFrequencies(PaymentFrequency[] paymentFrequencies) {
		this.paymentFrequencies = paymentFrequencies;
	}

	public Payment[] getPayments() {
		return payments;
	}

	public void setPayments(Payment[] payments) {
		this.payments = payments;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getPrimaryMediaCode() {
		return primaryMediaCode;
	}

	public void setPrimaryMediaCode(String primaryMediaCode) {
		this.primaryMediaCode = primaryMediaCode;
	}

	public String getPrimaryMediaDescription() {
		return primaryMediaDescription;
	}

	public void setPrimaryMediaDescription(String primaryMediaDescription) {
		this.primaryMediaDescription = primaryMediaDescription;
	}

	public Integer getMarketingApproachCode() {
		return marketingApproachCode;
	}

	public void setMarketingApproachCode(Integer marketingApproachCode) {
		this.marketingApproachCode = marketingApproachCode;
	}

	public String getMarketingApproachDescription() {
		return marketingApproachDescription;
	}

	public void setMarketingApproachDescription(String marketingApproachDescription) {
		this.marketingApproachDescription = marketingApproachDescription;
	}

	public Calendar getPlannedLaunchDate() {
		return plannedLaunchDate;
	}

	public void setPlannedLaunchDate(Calendar plannedLaunchDate) {
		this.plannedLaunchDate = plannedLaunchDate;
	}

	public Boolean getSolicitationCostRequired() {
		return solicitationCostRequired;
	}

	public void setSolicitationCostRequired(Boolean solicitationCostRequired) {
		this.solicitationCostRequired = solicitationCostRequired;
	}

	public String getPolicyTransactionCode() {
		return policyTransactionCode;
	}

	public void setPolicyTransactionCode(String policyTransactionCode) {
		this.policyTransactionCode = policyTransactionCode;
	}

	public Calendar getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}

	public void setPolicyEffectiveDate(Calendar policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}

	public Integer getMinimumProductNumberRequired() {
		return minimumProductNumberRequired;
	}

	public void setMinimumProductNumberRequired(Integer minimumProductNumberRequired) {
		this.minimumProductNumberRequired = minimumProductNumberRequired;
	}

	public Integer getMaximumProductNumberRequired() {
		return maximumProductNumberRequired;
	}

	public void setMaximumProductNumberRequired(Integer maximumProductNumberRequired) {
		this.maximumProductNumberRequired = maximumProductNumberRequired;
	}

	public String getPremiumInfoLink() {
		return premiumInfoLink;
	}

	public void setPremiumInfoLink(String premiumInfoLink) {
		this.premiumInfoLink = premiumInfoLink;
	}

	public Integer getCampaignStatus() {
		return campaignStatus;
	}

	public void setCampaignStatus(Integer campaignStatus) {
		this.campaignStatus = campaignStatus;
	}

	public Integer getApprovedCode() {
		return approvedCode;
	}

	public void setApprovedCode(Integer approvedCode) {
		this.approvedCode = approvedCode;
	}

	public Calendar getActualLaunchDate() {
		return actualLaunchDate;
	}

	public void setActualLaunchDate(Calendar actualLaunchDate) {
		this.actualLaunchDate = actualLaunchDate;
	}

	public String getPolicyTransactionDescription() {
		return policyTransactionDescription;
	}

	public void setPolicyTransactionDescription(String policyTransactionDescription) {
		this.policyTransactionDescription = policyTransactionDescription;
	}

	public String getSourceListDescription() {
		return sourceListDescription;
	}

	public void setSourceListDescription(String sourceListDescription) {
		this.sourceListDescription = sourceListDescription;
	}

	@Override
	public String toString() {
		return "SplitInfo [splitKey=" + splitKey + ", splitDescription=" + splitDescription + ", displayStatusCode="
				+ displayStatusCode + ", sponsorCode=" + sponsorCode + ", splitType=" + splitType + ", sponsorName="
				+ sponsorName + ", prodPackage=" + prodPackage + ", prodPackageDescription=" + prodPackageDescription
				+ ", prodPackageMarketingDesc=" + prodPackageMarketingDesc + ", policyPrefix=" + policyPrefix
				+ ", billNow=" + billNow + ", reconcileNow=" + reconcileNow + ", currencyCode=" + currencyCode
				+ ", currencyDescription=" + currencyDescription + ", lob=" + lob + ", lobDescription=" + lobDescription
				+ ", paymentFrequencies=" + Arrays.toString(paymentFrequencies) + ", payments="
				+ Arrays.toString(payments) + ", products=" + Arrays.toString(products) + ", primaryMediaCode="
				+ primaryMediaCode + ", primaryMediaDescription=" + primaryMediaDescription + ", marketingApproachCode="
				+ marketingApproachCode + ", marketingApproachDescription=" + marketingApproachDescription
				+ ", plannedLaunchDate=" + plannedLaunchDate + ", solicitationCostRequired=" + solicitationCostRequired
				+ ", policyTransactionCode=" + policyTransactionCode + ", policyEffectiveDate=" + policyEffectiveDate
				+ ", minimumProductNumberRequired=" + minimumProductNumberRequired + ", maximumProductNumberRequired="
				+ maximumProductNumberRequired + ", premiumInfoLink=" + premiumInfoLink + ", campaignStatus="
				+ campaignStatus + ", approvedCode=" + approvedCode + ", actualLaunchDate=" + actualLaunchDate
				+ ", policyTransactionDescription=" + policyTransactionDescription + ", sourceListDescription="
				+ sourceListDescription + "]";
	}

	
	
	
}
