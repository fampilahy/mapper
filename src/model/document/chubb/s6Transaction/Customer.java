package model.document.chubb.s6Transaction;

import java.util.Calendar;

import model.document.chubb.ChubbDocument;
import model.document.chubb.contract.Mandatory;

public class Customer extends ChubbDocument {

	@Mandatory
	private String custId;
	@Mandatory
	private CustType custType;
	private String s6AcctId;
	@Mandatory
	private Boolean polHolder;
	@Mandatory
	private Boolean polPayer;
	@Mandatory
	private String lastName;
	@Mandatory
	private String firstName;
	private String middleName;
	private String nickName;
	private String formalName;
	private Integer title;
	private Integer langCd;
	private String personalId;
	private Calendar birthDate;
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
	@Mandatory private CustProd[] custProds;
	@Mandatory private String[] custAdds;
	private Sensitivity[] sensitivities;
	private Integer dependentType;
	private String alternateId;

	public Customer(String custId, CustType custType, String s6AcctId, Boolean polHolder, Boolean polPayer,
			String lastName, String firstName, String middleName, String nickName, String formalName, Integer title,
			Integer langCd, String personalId, Calendar birthDate, Integer sexCd, String emailAddr,
			String emailFulfillment, Integer callPrefCd, Integer nationCd, Integer raceCd, Integer religionCd,
			Integer eduCd, Integer ocupCd, Integer indCd, Integer maritalCd, Integer relationshipCd,
			CustProd[] custProds, String[] custAdds, Sensitivity[] sensitivities, Integer dependentType,
			String alternateId) {
		this.custId = custId;
		this.custType = custType;
		this.s6AcctId = s6AcctId;
		this.polHolder = polHolder;
		this.polPayer = polPayer;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.nickName = nickName;
		this.formalName = formalName;
		this.title = title;
		this.langCd = langCd;
		this.personalId = personalId;
		this.birthDate = birthDate;
		this.sexCd = sexCd;
		this.emailAddr = emailAddr;
		this.emailFulfillment = emailFulfillment;
		this.callPrefCd = callPrefCd;
		this.nationCd = nationCd;
		this.raceCd = raceCd;
		this.religionCd = religionCd;
		this.eduCd = eduCd;
		this.ocupCd = ocupCd;
		this.indCd = indCd;
		this.maritalCd = maritalCd;
		this.relationshipCd = relationshipCd;
		this.custProds = custProds;
		this.custAdds = custAdds;
		this.sensitivities = sensitivities;
		this.dependentType = dependentType;
		this.alternateId = alternateId;
	}

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

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
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

	public Customer() {

	}
}
