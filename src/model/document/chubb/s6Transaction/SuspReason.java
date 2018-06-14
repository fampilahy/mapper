package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class SuspReason extends ChubbDocument {

	private Integer suspReasonKey;
	private Integer suspReasonCd;

	public Integer getSuspReasonKey() {
		return suspReasonKey;
	}

	public void setSuspReasonKey(Integer suspReasonKey) {
		this.suspReasonKey = suspReasonKey;
	}

	public Integer getSuspReasonCd() {
		return suspReasonCd;
	}

	public void setSuspReasonCd(Integer suspReasonCd) {
		this.suspReasonCd = suspReasonCd;
	}

	public SuspReason() {

	}

	public SuspReason(java.lang.Integer suspReasonKey, java.lang.Integer suspReasonCd) {
		this.suspReasonKey = suspReasonKey;
		this.suspReasonCd = suspReasonCd;
	}

}
