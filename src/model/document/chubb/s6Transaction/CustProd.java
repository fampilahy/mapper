package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;
import model.document.chubb.contract.Mandatory;

public class CustProd extends ChubbDocument {

	@Mandatory private String prodCd ="";
	@Mandatory private Integer benLv=0;
	private Double units =0d;
	private Beneficiary beneficiary=new Beneficiary();
	private ProdSpecData[] prodsSpecData={};
	private int[] ratingsFactor={0};
	private int[]  benefitsRatingFactor={0};
	private int[] exclsCd={0};
	
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
