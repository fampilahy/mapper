package model.document.chubb.splitInfo.response;

import model.document.chubb.Response;

public class ResponseSplitInfo extends Response {

	private SplitInfo splitInfo;

	public ResponseSplitInfo() {
	}

	public ResponseSplitInfo(String errorCode, String errorDescription, Boolean hasError, SplitInfo splitInfo) {
		super(errorCode, errorDescription, hasError);
		this.splitInfo = splitInfo;
	}

	public SplitInfo getSplitInfo() {
		return splitInfo;
	}

	public void setSplitInfo(SplitInfo splitInfo) {
		this.splitInfo = splitInfo;
	}

}
