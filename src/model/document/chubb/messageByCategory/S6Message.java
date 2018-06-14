package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class S6Message extends ChubbDocument {

	private String categoryCode;
	private Message[] messages;
	private Integer languageCode;

	public S6Message() {
	}

	public S6Message(String categoryCode, Message[] messages, Integer languageCode) {
		this.categoryCode = categoryCode;
		this.messages = messages;
		this.languageCode = languageCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Message[] getMessages() {
		return messages;
	}

	public void setMessages(Message[] messages) {
		this.messages = messages;
	}

	public Integer getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(Integer languageCode) {
		this.languageCode = languageCode;
	}

}
