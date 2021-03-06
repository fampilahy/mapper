package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;
import model.document.chubb.contract.Mandatory;

public class CustProd extends ChubbDocument {

	@Mandatory private String prodCd =null;
	@Mandatory private Integer benLv=null;
	private Double units =null;
	private Beneficiary beneficiary=new Beneficiary();
	private ProdSpecData[] prodsSpecData;
	private int[] ratingsFactor=null;
	private int[]  benefitsRatingFactor;
	private int[] exclsCd;
	
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	public ProdSpecData[] getProdsSpecData() {
		return prodsSpecData;
	}
	public void setProdsSpecData(ProdSpecData[] prodsSpecData) {
		this.prodsSpecData = prodsSpecData;
	}
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public Integer getBenLv() {
		return benLv;
	}
	public void setBenLv(Integer benLv) {
		this.benLv = benLv;
	}
	public Double getUnits() {
		return units;
	}
	public void setUnits(Double units) {
		this.units = units;
	}
	public int[] getRatingsFactor() {
		return ratingsFactor;
	}
	public void setRatingsFactor(int[] ratingsFactor) {
		this.ratingsFactor = ratingsFactor;
	}
	public int[] getBenefitsRatingFactor() {
		return benefitsRatingFactor;
	}
	public void setBenefitsRatingFactor(int[] benefitsRatingFactor) {
		this.benefitsRatingFactor = benefitsRatingFactor;
	}
	public int[] getExclsCd() {
		return exclsCd;
	}
	public void setExclsCd(int[] exclsCd) {
		this.exclsCd = exclsCd;
	}
	
	public CustProd(){
		
	}
	
}
