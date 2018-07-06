package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class ProdSpecDataInfo  extends ChubbDocument{

    private Integer categ=0;
    private String value="";
    
	public Integer getCateg() {
		return categ;
	}
	public void setCateg(Integer categ) {
		this.categ = categ;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public ProdSpecDataInfo(){
		
	}
	
}
