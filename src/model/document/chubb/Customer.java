package model.document.chubb;

import model.document.chubb.contract.Mandatory;

public class Customer extends ChubbDocument {
	
    @Mandatory private String custId;
    @Mandatory private CustType custType;
    private String s6AcctId;
    @Mandatory private Boolean polHolder;
    @Mandatory private Boolean polPayer;
    @Mandatory private String lastName;
    @Mandatory private String firstName;
    private String middleName;
    private String nickName;
    private String formalName;
    private Integer title;
    private Integer langCd;
    private String personalId;
    private java.util.Calendar birthDate;
    private Integer sexCd;
    private String emailAddr;
    private String emailFulfillment;
    private Integer callPrefCd;
    private Integer nationCd;
    private Integer raceCd;
    private Integer religionCd;
    private Integer eduCd;
    private Integer ocupCd;
    private Integer indCd;
    private Integer maritalCd;
    private Integer relationshipCd;
    private CustProd[] custProds;
    private String[] custAdds;
    private Sensitivity[] sensitivities;
    private Integer dependentType;
    private String alternateId;
    
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public CustType getCustType() {
		return custType;
	}
	public void setCustType(CustType custType) {
		this.custType = custType;
	}
	public String getS6AcctId() {
		return s6AcctId;
	}
	public void setS6AcctId(String s6AcctId) {
		this.s6AcctId = s6AcctId;
	}
	public Boolean getPolHolder() {
		return polHolder;
	}
	public void setPolHolder(Boolean polHolder) {
		this.polHolder = polHolder;
	}
	public Boolean getPolPayer() {
		return polPayer;
	}
	public void setPolPayer(Boolean polPayer) {
		this.polPayer = polPayer;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFormalName() {
		return formalName;
	}
	public void setFormalName(String formalName) {
		this.formalName = formalName;
	}
	public Integer getTitle() {
		return title;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	public Integer getLangCd() {
		return langCd;
	}
	public void setLangCd(Integer langCd) {
		this.langCd = langCd;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public java.util.Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(java.util.Calendar birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getSexCd() {
		return sexCd;
	}
	public void setSexCd(Integer sexCd) {
		this.sexCd = sexCd;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getEmailFulfillment() {
		return emailFulfillment;
	}
	public void setEmailFulfillment(String emailFulfillment) {
		this.emailFulfillment = emailFulfillment;
	}
	public Integer getCallPrefCd() {
		return callPrefCd;
	}
	public void setCallPrefCd(Integer callPrefCd) {
		this.callPrefCd = callPrefCd;
	}
	public Integer getNationCd() {
		return nationCd;
	}
	public void setNationCd(Integer nationCd) {
		this.nationCd = nationCd;
	}
	public Integer getRaceCd() {
		return raceCd;
	}
	public void setRaceCd(Integer raceCd) {
		this.raceCd = raceCd;
	}
	public Integer getReligionCd() {
		return religionCd;
	}
	public void setReligionCd(Integer religionCd) {
		this.religionCd = religionCd;
	}
	public Integer getEduCd() {
		return eduCd;
	}
	public void setEduCd(Integer eduCd) {
		this.eduCd = eduCd;
	}
	public Integer getOcupCd() {
		return ocupCd;
	}
	public void setOcupCd(Integer ocupCd) {
		this.ocupCd = ocupCd;
	}
	public Integer getIndCd() {
		return indCd;
	}
	public void setIndCd(Integer indCd) {
		this.indCd = indCd;
	}
	public Integer getMaritalCd() {
		return maritalCd;
	}
	public void setMaritalCd(Integer maritalCd) {
		this.maritalCd = maritalCd;
	}
	public Integer getRelationshipCd() {
		return relationshipCd;
	}
	public void setRelationshipCd(Integer relationshipCd) {
		this.relationshipCd = relationshipCd;
	}
	public CustProd[] getCustProds() {
		return custProds;
	}
	public void setCustProds(CustProd[] custProds) {
		this.custProds = custProds;
	}
	public String[] getCustAdds() {
		return custAdds;
	}
	public void setCustAdds(String[] custAdds) {
		this.custAdds = custAdds;
	}
	public Sensitivity[] getSensitivities() {
		return sensitivities;
	}
	public void setSensitivities(Sensitivity[] sensitivities) {
		this.sensitivities = sensitivities;
	}
	public Integer getDependentType() {
		return dependentType;
	}
	public void setDependentType(Integer dependentType) {
		this.dependentType = dependentType;
	}
	public String getAlternateId() {
		return alternateId;
	}
	public void setAlternateId(String alternateId) {
		this.alternateId = alternateId;
	}
	
}
