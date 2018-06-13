package model.document.chubb.premiumcalculator.request;

import model.document.chubb.ChubbDocument;

public class PremiumRequest extends ChubbDocument{
	 private java.util.Calendar effectiveDate;
	    private int paymentFrequency;
	    private String campaignKey;
	    private Product[] products;
	
	    public PremiumRequest(){
	    	
	    }

		public java.util.Calendar getEffectiveDate() {
			return effectiveDate;
		}

		public void setEffectiveDate(java.util.Calendar effectiveDate) {
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
