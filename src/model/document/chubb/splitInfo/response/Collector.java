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

}
