package model.document.chubb.splitInfo.response;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;

public class Collector extends ChubbDocument {
	
	
	  private String collectorCode;
	    private String collectorName;
	    private CreditCard[] creditCards;
	    private Bank[] banks;
	    private Calendar inactiveDate;

	    public Collector() {
	    }

	    public Collector(
	           String collectorCode,
	           String collectorName,
	           CreditCard[] creditCards,
	           Bank[] banks,
	           Calendar inactiveDate) {
	           this.collectorCode = collectorCode;
	           this.collectorName = collectorName;
	           this.creditCards = creditCards;
	           this.banks = banks;
	           this.inactiveDate = inactiveDate;
	    }

		public String getCollectorCode() {
			return collectorCode;
		}

		public String getCollectorName() {
			return collectorName;
		}

		public CreditCard[] getCreditCards() {
			return creditCards;
		}

		public Bank[] getBanks() {
			return banks;
		}

		public Calendar getInactiveDate() {
			return inactiveDate;
		}

		public void setCollectorCode(String collectorCode) {
			this.collectorCode = collectorCode;
		}

		public void setCollectorName(String collectorName) {
			this.collectorName = collectorName;
		}

		public void setCreditCards(CreditCard[] creditCards) {
			this.creditCards = creditCards;
		}

		public void setBanks(Bank[] banks) {
			this.banks = banks;
		}

		public void setInactiveDate(Calendar inactiveDate) {
			this.inactiveDate = inactiveDate;
		}
	    
	    

}
