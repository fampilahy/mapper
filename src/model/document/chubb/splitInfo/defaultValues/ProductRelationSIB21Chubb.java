package model.document.chubb.splitInfo.defaultValues;

import model.document.sib21.SIB21Document;
import model.document.sib21.SIB21PacketNumber;
import model.document.sib21.SIB21ProductNumber;

public enum ProductRelationSIB21Chubb {
	
	GASTOS_FUNERARIOS(SIB21ProductNumber.GASTOS_FUNERARIOS_NUMERO_DE_PRODUCTO,"","","MX18001101","",""),
	TARJETA_MAS(SIB21ProductNumber.TARJETA_MAS_NUMERO_DE_PRODUCTO,"","","MX18001201","",""),
	VIDA_PLUS_ORO(SIB21ProductNumber.VIDA_PLUS_NUMERO_DE_PRODUCTO,"01","","MX18003001","",""),
	VIDA_PLUS_PLATA(SIB21ProductNumber.VIDA_PLUS_NUMERO_DE_PRODUCTO,"02","","MX18003101","",""),
	VIDA_PLUS_BRONCE(SIB21ProductNumber.VIDA_PLUS_NUMERO_DE_PRODUCTO,"03","","MX18003201","",""),
	VIDA_PRIME_ORO(SIB21ProductNumber.VIDA_PRIME_NUMERO_DE_PRODUCTO,"01","","MX18007101","",""),
	VIDA_PRIME_PLATA(SIB21ProductNumber.VIDA_PRIME_NUMERO_DE_PRODUCTO,"02","","MX18003901","",""),
	VIDA_PRIME_BRONCE(SIB21ProductNumber.VIDA_PRIME_NUMERO_DE_PRODUCTO,"03","","MX18004001","",""),
	FRAUDE_Y_CLONACION(SIB21ProductNumber.FRAUDE_Y_CLONACION_NUMERO_DE_PRODUCTO,"","","MX18004501","",""),
	FRAUDE_Y_CLONACION_2(SIB21ProductNumber.FRAUDE_Y_CLONACION_2_NUMERO_DE_PRODUCTO,"","","MX18005101","",""),
	SEGURO_HOGAR(SIB21ProductNumber.SEGURO_HOGAR_NUMERO_DE_PRODUCTO,"","","MX18004601","",""),
	SEGURO_ACCIDENTES(SIB21ProductNumber.SEGURO_ACCIDENTES_NUMERO_DE_PRODUCTO,"","","MX18004701","","");
	
	private String sib21ProductNumber = "", sib21PackageNumber = "", chubbDescription = "", chubbSplitKey = "",
			chubbProductNumber = "", chubbPackageNumber = "";

	private ProductRelationSIB21Chubb(String sib21ProductNumber,String sib21PackageNumber, String chubbDescription, String chubbSplitKey, String chubbProductNumber, String chubbPackageNumber ) {
	this.sib21ProductNumber = sib21ProductNumber;
	this.sib21PackageNumber = sib21PackageNumber;
	this.chubbDescription=chubbDescription;
	this.chubbSplitKey=chubbSplitKey;
	this.chubbProductNumber = chubbProductNumber;
	this.chubbPackageNumber = chubbPackageNumber;
	}
	
	public static ProductRelationSIB21Chubb getProductRelationSIB21Chubb(SIB21Document sib21Document){
		if(sib21Document==null||sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_NumPro()==null||sib21Document.getServicio().getTmp_NumPro().equals(""))
			return null;
		ProductRelationSIB21Chubb productRelationSIB21Chubb = null;
		
		switch(sib21Document.getServicio().getTmp_NumPro()){
		
		case SIB21ProductNumber.GASTOS_FUNERARIOS_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=GASTOS_FUNERARIOS; break;
		case SIB21ProductNumber.TARJETA_MAS_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=TARJETA_MAS; break;
		case SIB21ProductNumber.FRAUDE_Y_CLONACION_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=FRAUDE_Y_CLONACION; break;
//		case SIB21ProductNumber.FRAUDE_Y_CLONACION_2_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=FRAUDE_Y_CLONACION_2; break;
		case SIB21ProductNumber.SEGURO_HOGAR_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=SEGURO_HOGAR; break;
		case SIB21ProductNumber.SEGURO_ACCIDENTES_NUMERO_DE_PRODUCTO : productRelationSIB21Chubb=SEGURO_ACCIDENTES; break;
		
		case SIB21ProductNumber.VIDA_PLUS_NUMERO_DE_PRODUCTO : {
			if(sib21Document.getServicio().getTmp_Paquet()==null||sib21Document.getServicio().getTmp_Paquet().equals(""))
				return null;
			switch(sib21Document.getServicio().getTmp_Paquet()){
				case SIB21PacketNumber.ORO : productRelationSIB21Chubb = VIDA_PLUS_ORO ;break;
				case SIB21PacketNumber.PLATA : productRelationSIB21Chubb = VIDA_PLUS_PLATA ;break;
				case SIB21PacketNumber.BRONCE : productRelationSIB21Chubb = VIDA_PLUS_BRONCE ;break;
			}
		}; break;

		case SIB21ProductNumber.VIDA_PRIME_NUMERO_DE_PRODUCTO : {
			if(sib21Document.getServicio().getTmp_Paquet()==null||sib21Document.getServicio().getTmp_Paquet().equals(""))
				return null;
			switch(sib21Document.getServicio().getTmp_Paquet()){
				case SIB21PacketNumber.ORO : productRelationSIB21Chubb = VIDA_PRIME_ORO ;break;
				case SIB21PacketNumber.PLATA : productRelationSIB21Chubb = VIDA_PRIME_PLATA ;break;
				case SIB21PacketNumber.BRONCE : productRelationSIB21Chubb = VIDA_PRIME_BRONCE ;break;
			}
		}; break;
		
		}
		
		return productRelationSIB21Chubb;
	}

	public String getSib21ProductNumber() {
		return sib21ProductNumber;
	}

	public String getSib21PackageNumber() {
		return sib21PackageNumber;
	}

	public String getChubbDescription() {
		return chubbDescription;
	}

	public String getChubbSplitKey() {
		return chubbSplitKey;
	}

	public String getChubbProductNumber() {
		return chubbProductNumber;
	}

	public String getChubbPackageNumber() {
		return chubbPackageNumber;
	}

	public void setSib21ProductNumber(String sib21ProductNumber) {
		this.sib21ProductNumber = sib21ProductNumber;
	}

	public void setSib21PackageNumber(String sib21PackageNumber) {
		this.sib21PackageNumber = sib21PackageNumber;
	}

	public void setChubbDescription(String chubbDescription) {
		this.chubbDescription = chubbDescription;
	}

	public void setChubbSplitKey(String chubbSplitKey) {
		this.chubbSplitKey = chubbSplitKey;
	}

	public void setChubbProductNumber(String chubbProductNumber) {
		this.chubbProductNumber = chubbProductNumber;
	}

	public void setChubbPackageNumber(String chubbPackageNumber) {
		this.chubbPackageNumber = chubbPackageNumber;
	}
}
