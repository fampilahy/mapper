package model.document.chubb.splitInfo;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;
import model.document.chubb.splitInfo.response.Collector;

public class Payment extends ChubbDocument {

	private Integer paymentMethodCode;
	private String paymentMethodDescription;
	private Collector[] collectors;
	private Calendar inactiveDate;

	public Payment() {

	}

	public Payment(Integer paymentMethodCode, String paymentMethodDescription, Collector[] collectors,
			Calendar inactiveDate) {
		this.paymentMethodCode = paymentMethodCode;
		this.paymentMethodDescription = paymentMethodDescription;
		this.collectors = collectors;
		this.inactiveDate = inactiveDate;
	}

	public Integer getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(Integer paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public String getPaymentMethodDescription() {
		return paymentMethodDescription;
	}

	public void setPaymentMethodDescription(String paymentMethodDescription) {
		this.paymentMethodDescription = paymentMethodDescription;
	}

	public Collector[] getCollectors() {
		return collectors;
	}

	public void setCollectors(Collector[] collectors) {
		this.collectors = collectors;
	}

	public Calendar getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(Calendar inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

}
