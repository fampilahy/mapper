package model.document.chubb.messageByCategory.defaultValues;

public enum EndorsementReasonCodeFromChubb {
	
	INFLATION_ENDORSEMENT(1362,"Inflation Endorsement","99"),
	POST_CONVERSION_POLICY_UPDATE(2689,"Post-Conversion Policy Update","98"),
	NON_FINANCIAL_POLICY_UPDATE(2690,"Non-Financial Policy Update","97"),
	VACIO_ENDOSO_NO_FUNCIONAL(101254,"Vacío - Endoso No Funcional","NF"),
	RECALCULO_DE_PRIMA(101861,"Recálculo de Prima","PR"),
	ABM_DE_ASEGURADOS (1003763,"ABM de Asegurados (Alta, Baja, Modificación)","vP");
	
	private Integer key;
	private String description, msgID;

	private EndorsementReasonCodeFromChubb(Integer key, String description, String msgID) {
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
