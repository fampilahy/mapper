package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class Reference extends ChubbDocument {

	private Integer refKey=0;
	private String refText="";
	
	public Integer getRefKey() {
		return refKey;
	}
	public void setRefKey(Integer refKey) {
		this.refKey = refKey;
	}
	public String getRefText() {
		return refText;
	}
	public void setRefText(String refText) {
		this.refText = refText;
	}
	public Reference(){
		
	}
	

}
