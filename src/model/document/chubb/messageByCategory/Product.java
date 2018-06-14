package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class Product extends ChubbDocument{
	
	private String productId;
    private String productDescription;
    private Boolean required;
    private Boolean individualRated;
    private Boolean allowBeneficiaries;
    private Integer allowedInsured;
    private Integer allowedCoverage;
    private Integer miMinAge;
    private Integer miMaxAge;
    private Integer spMinAge;
    private Integer spMaxAge;
    private Integer dpMinAge;
    private Integer dpMaxAge;
    private Boolean unitRated;
    private Long minUnit;
    private Long maxUnit;
    private BenefitLevel[] benefitLevels;
    private ProductSpecific[] productSpecifics;
    private RatingFactor[] ratingFactors;
    private Integer currencyCode;
    private String currencyDescription;
    private RequiredProduct[] requiredProducts;
    private Boolean isSinglePremium;
    private ProductScheduledBenefit[] scheduledBenefits;
    private ProductCoverage[] coverages;
    private ProductPremium[] premiums;
    private Boolean validateAge;

    public Product() {
    }

    public Product(
           String productId,
           String productDescription,
           Boolean required,
           Boolean individualRated,
           Boolean allowBeneficiaries,
           Integer allowedInsured,
           Integer allowedCoverage,
           Integer miMinAge,
           Integer miMaxAge,
           Integer spMinAge,
           Integer spMaxAge,
           Integer dpMinAge,
           Integer dpMaxAge,
           Boolean unitRated,
           Long minUnit,
           Long maxUnit,
           BenefitLevel[] benefitLevels,
           ProductSpecific[] productSpecifics,
           RatingFactor[] ratingFactors,
           Integer currencyCode,
           String currencyDescription,
           RequiredProduct[] requiredProducts,
           Boolean isSinglePremium,
           ProductScheduledBenefit[] scheduledBenefits,
           ProductCoverage[] coverages,
           ProductPremium[] premiums,
           Boolean validateAge) {
           this.productId = productId;
           this.productDescription = productDescription;
           this.required = required;
           this.individualRated = individualRated;
           this.allowBeneficiaries = allowBeneficiaries;
           this.allowedInsured = allowedInsured;
           this.allowedCoverage = allowedCoverage;
           this.miMinAge = miMinAge;
           this.miMaxAge = miMaxAge;
           this.spMinAge = spMinAge;
           this.spMaxAge = spMaxAge;
           this.dpMinAge = dpMinAge;
           this.dpMaxAge = dpMaxAge;
           this.unitRated = unitRated;
           this.minUnit = minUnit;
           this.maxUnit = maxUnit;
           this.benefitLevels = benefitLevels;
           this.productSpecifics = productSpecifics;
           this.ratingFactors = ratingFactors;
           this.currencyCode = currencyCode;
           this.currencyDescription = currencyDescription;
           this.requiredProducts = requiredProducts;
           this.isSinglePremium = isSinglePremium;
           this.scheduledBenefits = scheduledBenefits;
           this.coverages = coverages;
           this.premiums = premiums;
           this.validateAge = validateAge;
    }

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Boolean getIndividualRated() {
		return individualRated;
	}

	public void setIndividualRated(Boolean individualRated) {
		this.individualRated = individualRated;
	}

	public Boolean getAllowBeneficiaries() {
		return allowBeneficiaries;
	}

	public void setAllowBeneficiaries(Boolean allowBeneficiaries) {
		this.allowBeneficiaries = allowBeneficiaries;
	}

	public Integer getAllowedInsured() {
		return allowedInsured;
	}

	public void setAllowedInsured(Integer allowedInsured) {
		this.allowedInsured = allowedInsured;
	}

	public Integer getAllowedCoverage() {
		return allowedCoverage;
	}

	public void setAllowedCoverage(Integer allowedCoverage) {
		this.allowedCoverage = allowedCoverage;
	}

	public Integer getMiMinAge() {
		return miMinAge;
	}

	public void setMiMinAge(Integer miMinAge) {
		this.miMinAge = miMinAge;
	}

	public Integer getMiMaxAge() {
		return miMaxAge;
	}

	public void setMiMaxAge(Integer miMaxAge) {
		this.miMaxAge = miMaxAge;
	}

	public Integer getSpMinAge() {
		return spMinAge;
	}

	public void setSpMinAge(Integer spMinAge) {
		this.spMinAge = spMinAge;
	}

	public Integer getSpMaxAge() {
		return spMaxAge;
	}

	public void setSpMaxAge(Integer spMaxAge) {
		this.spMaxAge = spMaxAge;
	}

	public Integer getDpMinAge() {
		return dpMinAge;
	}

	public void setDpMinAge(Integer dpMinAge) {
		this.dpMinAge = dpMinAge;
	}

	public Integer getDpMaxAge() {
		return dpMaxAge;
	}

	public void setDpMaxAge(Integer dpMaxAge) {
		this.dpMaxAge = dpMaxAge;
	}

	public Boolean getUnitRated() {
		return unitRated;
	}

	public void setUnitRated(Boolean unitRated) {
		this.unitRated = unitRated;
	}

	public Long getMinUnit() {
		return minUnit;
	}

	public void setMinUnit(Long minUnit) {
		this.minUnit = minUnit;
	}

	public Long getMaxUnit() {
		return maxUnit;
	}

	public void setMaxUnit(Long maxUnit) {
		this.maxUnit = maxUnit;
	}

	public BenefitLevel[] getBenefitLevels() {
		return benefitLevels;
	}

	public void setBenefitLevels(BenefitLevel[] benefitLevels) {
		this.benefitLevels = benefitLevels;
	}

	public ProductSpecific[] getProductSpecifics() {
		return productSpecifics;
	}

	public void setProductSpecifics(ProductSpecific[] productSpecifics) {
		this.productSpecifics = productSpecifics;
	}

	public RatingFactor[] getRatingFactors() {
		return ratingFactors;
	}

	public void setRatingFactors(RatingFactor[] ratingFactors) {
		this.ratingFactors = ratingFactors;
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

	public RequiredProduct[] getRequiredProducts() {
		return requiredProducts;
	}

	public void setRequiredProducts(RequiredProduct[] requiredProducts) {
		this.requiredProducts = requiredProducts;
	}

	public Boolean getIsSinglePremium() {
		return isSinglePremium;
	}

	public void setIsSinglePremium(Boolean isSinglePremium) {
		this.isSinglePremium = isSinglePremium;
	}

	public ProductScheduledBenefit[] getScheduledBenefits() {
		return scheduledBenefits;
	}

	public void setScheduledBenefits(ProductScheduledBenefit[] scheduledBenefits) {
		this.scheduledBenefits = scheduledBenefits;
	}

	public ProductCoverage[] getCoverages() {
		return coverages;
	}

	public void setCoverages(ProductCoverage[] coverages) {
		this.coverages = coverages;
	}

	public ProductPremium[] getPremiums() {
		return premiums;
	}

	public void setPremiums(ProductPremium[] premiums) {
		this.premiums = premiums;
	}

	public Boolean getValidateAge() {
		return validateAge;
	}

	public void setValidateAge(Boolean validateAge) {
		this.validateAge = validateAge;
	}
	
    
    
}
