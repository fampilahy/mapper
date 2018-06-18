package model.document.chubb.messageByCategory.defaultValues;

public enum PaymentMethodCodeFromChubb {
	
	TARJETA_DE_CREDITO(882,"Tarjeta de Crédito","10"),
	DEBITO_BANCARIO(883,"Débito bancario","20"),
	FACTURACION_DIRECTA(884,"Facturación directa","30"),
	BORDEREAUX(885,"Bordereaux ","40"),
	GIRO(886,"GIRO","50"),
	METODO_NO_ESTANDAR_DE_PAGO(887,"Método No Estándar de Pago","60"),
	DESCUENTO_DE_NOMINA(888,"Descuento de nómina","70");
	
	private Integer key;
	private String description, msgID;

	private PaymentMethodCodeFromChubb(Integer key, String description, String msgID) {
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
