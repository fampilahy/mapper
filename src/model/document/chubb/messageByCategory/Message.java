package model.document.chubb.messageByCategory;

import model.document.chubb.ChubbDocument;

public class Message extends ChubbDocument {

	private Integer key;
	private String description;
	private String msgID;

	public Message() {
	}

	public Message(Integer key, String description, String msgID) {
		this.key = key;
		this.description = description;
		this.msgID = msgID;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMsgID() {
		return msgID;
	}

	public void setMsgID(String msgID) {
		this.msgID = msgID;
	}

}
