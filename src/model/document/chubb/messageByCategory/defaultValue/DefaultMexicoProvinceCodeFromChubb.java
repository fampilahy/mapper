package model.document.chubb.messageByCategory.defaultValue;

public enum DefaultMexicoProvinceCodeFromChubb {
	// not to implement yet in db for now
	
	TAMAULIPAS (100583,"Tamaulipas","zb"),
	TLAXCALA (100592,"Tlaxcala","zc"),
	VERACRUZ (100638,"Veracruz","zd"),
	YUCATAN (100670,"Yucatán","ze"),
	ZACATECAS (100668,"Zacatecas","zf"),
	SAN_LUIS_POTOSI (100716,"San Luis Potosí","ay"),
	SINALOA (100758,"Sinaloa","ax"),
	SONORA (100764,"Sonora","az"),
	TABASCO (100790,"Tabasco","za"),
	PUEBLA (100839,"Puebla","au"),
	QUERETERO (100870,"Querétaro","av"),
	QUINTANAROO (100883,"Quintanaroo","aw"),
	NAYARIT (100926,"Nayarit","ar"),	
	NUEVO_LEON (100950,"Nuevo León","as"),	
	OAXACA (100955,"Oaxaca","at"),	
	MORELOS (101144,"Morelos","aq"),	
	GUANAJUATO (101159,"Guanajuato","am"),	
	GUERRERO (101171	,"Guerrero","al"),	
	JALISCO (101213,"Jalisco","ao"),	
	Durango (101242,"Durango","aj"),	
	ESTADO_DE_MEXICO (101263,"Estado De México","ak"),	
	COAHUILA (101286,"Coahuila","ag"),	
	CAMPECHE (101398,"Campeche","ad"),	
	CHIAPAS (101440,"Chiapas","af"),	
	CHIHUAHUA (101451,"Chihuahua","ae"),	
	BAJA_CALIFORNIA_NORTE (101537,"Baja California Norte","ab"),	
	BAJA_CALIFORNIA_SUR (101540,"Baja California Sur","ac"),	
	MICHOACAN (101970,"Michoacán","ap"),	
	HIDALGO (102046,"Hidalgo","an"),	
	COLIMA (102234,"Colima","ah"),	
	DISTRITO_FEDERAL (102288,"Distrito Federal","ai"),	
	AGUASCALIENTE (102394,"Aguascaliente","aa"),	
	BENI (1003948,"Beni","ja"),	
	CHUQUISACA (1003949,"Chuquisaca","Ci"),	
	COCHABAMBA (1003950,"Cochabamba","LV"),	
	ORURO (1003951,"Oruro","CG"),	
	PANDO (1003952,"Pando","qm"),
	POTOSI (1003953,"Potosí","HV"),
	TARIJA (1003954,"Tarija","ua");
		
	private Integer key;
	private String description, msgID;

	private DefaultMexicoProvinceCodeFromChubb(Integer key, String description, String msgID) {
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
