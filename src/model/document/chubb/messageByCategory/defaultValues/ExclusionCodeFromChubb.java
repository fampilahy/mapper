package model.document.chubb.messageByCategory.defaultValues;

public enum ExclusionCodeFromChubb {

	
	CONDICIONES_DE_ABSCESO(1001228,"EXCLUYENDO CONDICIONES DE ABSCESO Y TODA ENFERMEDAD/CONDICION CAUSADA POR ESTE Y/O RELACIONADO AL MISMO, INCLUYENDO LAS CONSECUENCIAS DEL TRATAMIENTO.","A01"),
	CONDICIONES_DE_ALCOHOLISMO(1001230,"EXCLUYENDO CONDICIONES DE ALCOHOLISMO Y TODA ENFERMEDAD/CONDITION CAUSADA POR ESTE Y/O RELACIONADO AL MISMO, INCLUYENDO LAS CONSECUENCIAS DEL TRATAMIENTO.","A05"),
	COLITIS(1001230,"EXCLUYENDO COLITIS Y TODA ENFERMEDAD/CONDICION CAUSADA POR ESTE Y/O RELACIONADO AL MISMO, INCLUYENDO LAS CONSECUENCIAS DEL TRATAMIENTO.","C16");
	
	private Integer key;
	private String description, msgID;

	private ExclusionCodeFromChubb(Integer key, String description, String msgID) {
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
