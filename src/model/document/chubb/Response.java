package model.document.chubb;

public class Response extends ChubbDocument {

	private String errorCode;
	private String errorDescription;
	private Boolean hasError;

	public Response(String errorCode, String errorDescription, Boolean hasError) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.hasError = hasError;
	}

	public Response() {
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

}
