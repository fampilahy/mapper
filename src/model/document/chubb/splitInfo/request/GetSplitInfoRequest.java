package model.document.chubb.splitInfo.request;

import model.document.chubb.ChubbDocument;

public class GetSplitInfoRequest extends ChubbDocument {

	private Integer languageCode;
	private Boolean loadBankInfo;
	private String splitKey;
	
	public GetSplitInfoRequest() {
	}

	public Integer getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(Integer languageCode) {
		this.languageCode = languageCode;
	}

	public Boolean getLoadBankInfo() {
		return loadBankInfo;
	}

	public void setLoadBankInfo(Boolean loadBankInfo) {
		this.loadBankInfo = loadBankInfo;
	}

	public String getSplitKey() {
		return splitKey;
	}

	public void setSplitKey(String splitKey) {
		this.splitKey = splitKey;
	}

}
