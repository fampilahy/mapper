package model.document.chubb.messageByCategory.defaultValues;

public enum PaymentFrequencyCodeFromChubb {
	
	WEEKLY_1_INVOICE_EVERY_WEEK(871,"Weekly - 1 Invoice every Week","1"),
	BI_WEEKLY_1_INV_EVERY_2_WEEKS_26_PER_YR(872,"Bi-Weekly - 1 Inv every 2 Weeks,26/Yr.","2"),
	ANUAL(873,"Anual","A"),
	DISPLAY_BI_WEEKLY_1_MONTHLY_INVOICE(874,"Display Bi-Weekly - 1 Monthly Invoice","B"),
	BI_WEEKLY_2_INV_EVERY_MONTH_24_PER_YR(875,"Bi-Weekly - 2 Inv every Month,24/Yr.","C"),
	PAGO_UNICO(876,"Pago Unico","F"),
	MENSUAL(877,"Mensual","M"),
	TRIMESTRAL(879,"Trimestral","Q"),
	SEMESTRAL(880,"Semestral","S"),
	DISPLAY_WEEKLY_1_MONTHLY_INVOICE(881,"Display Weekly - 1 Monthly invoice","W"),
	SINGLE_PAYMENT(1909,"Single Payment","SP"),
	PLANES_PARA_PRIMA_UNICA(1003907,"PLANES PARA  PRIMA UNICA","yr");
	
	private Integer key;
	private String description, msgID;

	private PaymentFrequencyCodeFromChubb(Integer key, String description, String msgID) {
		this.key = key;
		this.description = description;
		this.msgID = msgID;
	}

	public Integer getKey() {
		return key;
	}

	public String getDescription() {
		return description;
	}

	public String getMsgID() {
		return msgID;
	}

}
