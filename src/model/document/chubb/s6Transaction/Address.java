package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;
import model.document.chubb.contract.Mandatory;

public class Address extends ChubbDocument {

	@Mandatory private String addrId=null;
	@Mandatory private Integer addrType=null;
	private String s6AddrId;
	@Mandatory private String line1=null;
	private String line2;
	private String line3;
	private String line4;
	private String postalCd;
	private String city=null;
	private Integer provinceCd=null;
	private String countryCd=null;
	private String phone;
	private String fax;
	private String companyCd;
	private String cell;
	
	public Address withAddrId(String addrId){
		this.addrId = addrId;
		return this;
	}
	
	public Address withAddrType(Integer addrType){
		this.addrType = addrType;
		return this;
	}
	
	public Address withLine1(String line1){
		this.line1 = line1;
		return this;
	}
	
	public Address withCity(String city){
		this.city = city;
		return this;
	}
	
	public Address withProvinceCd(Integer provinceCd){
		this.provinceCd = provinceCd;
		return this;
	}
	
	public Address withCountryCd(String countryCd){
		this.countryCd = countryCd;
		return this;
	}
	
	public Address() {
	}

	public String getAddrId() {
		return addrId;
	}

	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	public Integer getAddrType() {
		return addrType;
	}

	public void setAddrType(Integer addrType) {
		this.addrType = addrType;
	}

	public String getS6AddrId() {
		return s6AddrId;
	}

	public void setS6AddrId(String s6AddrId) {
		this.s6AddrId = s6AddrId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getLine4() {
		return line4;
	}

	public void setLine4(String line4) {
		this.line4 = line4;
	}

	public String getPostalCd() {
		return postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getProvinceCd() {
		return provinceCd;
	}

	public void setProvinceCd(Integer provinceCd) {
		this.provinceCd = provinceCd;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCompanyCd() {
		return companyCd;
	}

	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

}
