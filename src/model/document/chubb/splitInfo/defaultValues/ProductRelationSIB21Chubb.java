package model.document.chubb.splitInfo.defaultValues;

public enum ProductRelationSIB21Chubb {
	
	ORO(1,"VIDA PLUS ORO","VPOBRF"),
	PLATA(2,"a definir","ADEFINIER"),
	BRONZE(3,"a definir","ADEFINIER");
	
	private Integer sib21ProductCode;
	private String sib21Description, chubbProductCode;

	private ProductRelationSIB21Chubb(Integer sib21ProductCode, String sib21Description, String chubbProductCode) {
		this.sib21ProductCode = sib21ProductCode;
		this.sib21Description = sib21Description;
		this.chubbProductCode = chubbProductCode;
	}

	public Integer getSib21ProductCode() {
		return sib21ProductCode;
	}

	public String getSib21Description() {
		return sib21Description;
	}

	public String getChubbProductCode() {
		return chubbProductCode;
	}

	public void setSib21ProductCode(Integer sib21ProductCode) {
		this.sib21ProductCode = sib21ProductCode;
	}

	public void setSib21Description(String sib21Description) {
		this.sib21Description = sib21Description;
	}

	public void setChubbProductCode(String chubbProductCode) {
		this.chubbProductCode = chubbProductCode;
	}

}
