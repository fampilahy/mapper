package model.document.chubb.premiumCalculator.request;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;
import model.document.chubb.premiumCalculator.Product;

public class PremiumRequest extends ChubbDocument {

	private Calendar effectiveDate;
	private int paymentFrequency;
	private String campaignKey;
	private Product[] products;

	public PremiumRequest() {

	}

	public Calendar getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Calendar effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public int getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(int paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public String getCampaignKey() {
		return campaignKey;
	}

	public void setCampaignKey(String campaignKey) {
		this.campaignKey = campaignKey;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

}
