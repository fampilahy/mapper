package model.document.chubb.messageByCategory.defaultValues;

public enum CancelReasonCodeFromChubb {
	
	FALLECIDO(1365,"Fallecido","52"),
	CANCELACION_FREE_LOOK(1367,"Cancelación Free-Look","59"),
	POLIZA_DUPLICADA(1369,"Poliza duplicada","68"),
	MATERNIDAD(1374,"Maternidad","82"),
	DESPIDO_LABORAL(1377,"Despido Laboral","85"),
	COBERTURA_NO_AUTORIZADA_POR_CLIENTE(1385,"Cobertura no Autorizada por Cliente","A1"),
	CONTRACARGO(1387,"Contracargo","CC"),
	TERMINOS_DE_LA_POLIZA_NO_ACEPTADOS(1393,"Términos de la póliza no aceptados","NT"),
	ORDEN_DEL_SPONSOR(1394,"Orden del Sponsor","SR"),
	MAL_CHEQUE(100060,"Mal cheque","11"),
	PROBLEMAS_CON_FACTURACION(100065,"Problemas con Facturación","74"),
	BLOQUEO_NO_ACEPTAN_CARGOS(100067,"Bloqueo - No aceptan cargos","12"),
	TARJETA_EXTRAVIADA_O_CAMBIADA(100087,"Tarjeta Extraviada / Cambiada","61"),
	NUMERO_DE_CUENTA_INVALIDO(100088,"Número de Cuenta Inválido","71"),
	CLIENTE_NO_RECIBIO_LA_POLIZA(100170,"Cliente no recibio la póliza","ah"),
	MOTIVOS_ECONOMICOS(100203,"Motivos Economicos","D1"),
	FONDOS_INSUFICIENTES(100304,"Fondos insuficientes","14"),
	RAZONES_LEGALES(100327,"Razones legales","al"),
	CLIENTE_PERDIDO_A_COMPETIDOR(100343,"Cliente Perdido a Competidor","58"),
	CAMBIO_DE_JURISDICCION(100372,"Cambio de Jurisdicción","53"),
	NINGUNA_EXPLICACION(100381,"Ninguna Explicación","70"),
	SIN_RETORNO(100382,"Sin Retorno","19"),
	FALTA_DE_PAGO_DE_PRIMA(100385,"Falta de pago de Prima","63"),
	NO_ES_UN_EMPLEADO(100387,"No es un Empleado","C3"),
	FUERA_DE_RANGO_DE_EDAD(100409,"Fuera de Rango de Edad","55"),
	PROBLEMAS_CON_SINIESTROS(100445,"Problemas con siniestros","aj"),
	ERRORES_EN_PROCESAMIENTO(100446,"Errores en procesamiento","17"),
	CAMBIO_DE_PRODUCTO(100452,"Cambio de producto","ae"),
	PRODUCTO_DEMASIADO_CARO(100830,"Producto demasiado caro","60"),
	BENEFICIOS_AGOTADOS(103384,"Beneficios Agotados","ab"),
	QUEJA_CLIENTE_SERVICIO_SPONSOR(103541,"Queja Cliente servicio sponsor","65"),
	QUEJA_DE_SERVICIO_ACE(107116,"Queja de Servicio - ACE","64");
	
	private Integer key;
	private String description, msgID;

	private CancelReasonCodeFromChubb(Integer key, String description, String msgID) {
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
