package model.document.chubb;

public class PaymentFrequency extends ChubbDocument {

	private Integer paymentFrequencyCode;
	private String paymentFrequencyName;

	public PaymentFrequency() {
	}

	public PaymentFrequency(Integer paymentFrequencyCode, String paymentFrequencyName) {
		this.paymentFrequencyCode = paymentFrequencyCode;
		this.paymentFrequencyName = paymentFrequencyName;
	}

	public Integer getPaymentFrequencyCode() {
		return paymentFrequencyCode;
	}

	public void setPaymentFrequencyCode(Integer paymentFrequencyCode) {
		this.paymentFrequencyCode = paymentFrequencyCode;
	}

	public String getPaymentFrequencyName() {
		return paymentFrequencyName;
	}

	public void setPaymentFrequencyName(String paymentFrequencyName) {
		this.paymentFrequencyName = paymentFrequencyName;
	}

}
