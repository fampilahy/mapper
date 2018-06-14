package model.document.chubb.premiumCalculator;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;

public class Product extends ChubbDocument {

	private String code;
	private boolean isIndividualType;
	private Calendar customerBirthDate;
	private int customerSex;
	private CustomerType customerType;
	private double units;
	private int benefitLevel;
	private RatingFactorDetail[] ratingFactors;

	public Product() {
	}

	public Product(String code, boolean isIndividualType, Calendar customerBirthDate, int customerSex,
			CustomerType customerType, double units, int benefitLevel, RatingFactorDetail[] ratingFactors) {
		this.code = code;
		this.isIndividualType = isIndividualType;
		this.customerBirthDate = customerBirthDate;
		this.customerSex = customerSex;
		this.customerType = customerType;
		this.units = units;
		this.benefitLevel = benefitLevel;
		this.ratingFactors = ratingFactors;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isIndividualType() {
		return isIndividualType;
	}

	public void setIndividualType(boolean isIndividualType) {
		this.isIndividualType = isIndividualType;
	}

	public Calendar getCustomerBirthDate() {
		return customerBirthDate;
	}

	public void setCustomerBirthDate(Calendar customerBirthDate) {
		this.customerBirthDate = customerBirthDate;
	}

	public int getCustomerSex() {
		return customerSex;
	}

	public void setCustomerSex(int customerSex) {
		this.customerSex = customerSex;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public double getUnits() {
		return units;
	}

	public void setUnits(double units) {
		this.units = units;
	}

	public int getBenefitLevel() {
		return benefitLevel;
	}

	public void setBenefitLevel(int benefitLevel) {
		this.benefitLevel = benefitLevel;
	}

	public RatingFactorDetail[] getRatingFactors() {
		return ratingFactors;
	}

	public void setRatingFactors(RatingFactorDetail[] ratingFactors) {
		this.ratingFactors = ratingFactors;
	}

}
