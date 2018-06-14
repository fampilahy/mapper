package model.document.chubb.messageByCategory.response;

import model.document.chubb.Response;
import model.document.chubb.messageByCategory.S6Message;

public class ResponseMessagesByCategory extends Response {

	private S6Message messagesByCategory;

	public ResponseMessagesByCategory() {
	}

	public ResponseMessagesByCategory(String errorCode, String errorDescription, Boolean hasError,
			S6Message messagesByCategory) {
		super(errorCode, errorDescription, hasError);
		this.messagesByCategory = messagesByCategory;
	}

	public S6Message getMessagesByCategory() {
		return messagesByCategory;
	}

	public void setMessagesByCategory(S6Message messagesByCategory) {
		this.messagesByCategory = messagesByCategory;
	}

}
