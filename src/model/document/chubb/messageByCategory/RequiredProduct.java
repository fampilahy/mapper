package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class RequiredProduct extends ChubbDocument {

	private String id;

	private String description;

	public RequiredProduct() {
	}

	public RequiredProduct(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
