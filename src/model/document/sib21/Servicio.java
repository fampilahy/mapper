package model.document.sib21;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Servicio extends AbstractSIB21Document {

	private Float tmp_NumCon;
	private String tmp_NumCom;
	private String tmp_NumPro;
	private String tmp_NumPol;
	private String tmp_Asegur;
	private String tmp_DesPro;
	private String tmp_Nombre;
	private String tmp_ApePat;
	private String tmp_ApeMat;
	private String tmp_FecNac;
	private Integer tmp_Edad;
	private String tmp_RFC;
	private String tmp_Email;
	private String tmp_Telefo;
	private String tmp_CalNum;
	private String tmp_Coloni;
	private String tmp_Locali;
	private String tmp_Entida;
	private Integer tmp_PriAnu;
	private Integer tmp_NumPag;
	private Integer tmp_PriPag;
	private Integer tmp_PagSub;
	private String tmp_FecIni;
	private String tmp_FecFin;
	private String tmp_Paquet;
	private String tmp_TipPla;
	private String tmp_TipRen;
	private String tmp_Nombr1;
	private String tmp_Paren1;
	private String tmp_Porce1;
	private String tmp_Nombr2;
	private String tmp_Paren2;
	private String tmp_Porce2;
	private String tmp_Nombr3;
	private String tmp_Paren3;
	private String tmp_Porce3;
	private String tmp_Nombr4;
	private String tmp_Paren4;
	private String tmp_Porce4;
	private String tmp_RieCal;
	private String tmp_RieCol;
	private String tmp_RieLoc;
	private String tmp_RieEnt;
	private String tmp_RieCop;
	private String tmp_RieTel;
	private String tmp_GirDes;
	private String tmp_CodPos;
	private String tmp_EmaAdi;
	private Float tmp_CelAdi;
	private String tmp_Parent;
	private String tmp_FecMod;
	private String tmp_MotCan;
	private String tmp_FecCan;
	private String bitacoraProcedimientoEjecutado;

	public String getTmp_NumCom() {
		return tmp_NumCom;
	}

	public Float getTmp_NumCon() {
		return tmp_NumCon;
	}

	public String getTmp_FecMod() {
		return tmp_FecMod;
	}

	public String getTmp_MotCan() {
		return tmp_MotCan;
	}

	public String getTmp_FecCan() {
		return tmp_FecCan;
	}

	public void setTmp_FecMod(String tmp_FecMod) {
		this.tmp_FecMod = tmp_FecMod;
	}

	public void setTmp_MotCan(String tmp_MotCan) {
		this.tmp_MotCan = tmp_MotCan;
	}

	public void setTmp_FecCan(String tmp_FecCan) {
		this.tmp_FecCan = tmp_FecCan;
	}

	public String getTmp_NumPro() {
		return tmp_NumPro;
	}

	public String getTmp_NumPol() {
		return tmp_NumPol;
	}

	public String getTmp_Asegur() {
		return tmp_Asegur;
	}

	public String getTmp_DesPro() {
		return tmp_DesPro;
	}

	public String getTmp_Nombre() {
		return tmp_Nombre;
	}

	public String getTmp_ApePat() {
		return tmp_ApePat;
	}

	public String getTmp_ApeMat() {
		return tmp_ApeMat;
	}

	public String getTmp_FecNac() {
		return tmp_FecNac;
	}

	public Integer getTmp_Edad() {
		return tmp_Edad;
	}

	public String getTmp_RFC() {
		return tmp_RFC;
	}

	public String getTmp_Email() {
		return tmp_Email;
	}

	public String getTmp_Telefo() {
		return tmp_Telefo;
	}

	public String getTmp_CalNum() {
		return tmp_CalNum;
	}

	public String getTmp_Coloni() {
		return tmp_Coloni;
	}

	public String getTmp_Locali() {
		return tmp_Locali;
	}

	public String getTmp_Entida() {
		return tmp_Entida;
	}

	public Integer getTmp_PriAnu() {
		return tmp_PriAnu;
	}

	public Integer getTmp_NumPag() {
		return tmp_NumPag;
	}

	public Integer getTmp_PriPag() {
		return tmp_PriPag;
	}

	public Integer getTmp_PagSub() {
		return tmp_PagSub;
	}

	public String getTmp_FecIni() {
		return tmp_FecIni;
	}

	public String getTmp_FecFin() {
		return tmp_FecFin;
	}

	public String getTmp_Paquet() {
		return tmp_Paquet;
	}

	public String getTmp_TipPla() {
		return tmp_TipPla;
	}

	public String getTmp_TipRen() {
		return tmp_TipRen;
	}

	public String getTmp_Nombr1() {
		return tmp_Nombr1;
	}

	public String getTmp_Paren1() {
		return tmp_Paren1;
	}

	public String getTmp_Porce1() {
		return tmp_Porce1;
	}

	public String getTmp_Nombr2() {
		return tmp_Nombr2;
	}

	public String getTmp_Paren2() {
		return tmp_Paren2;
	}

	public String getTmp_Porce2() {
		return tmp_Porce2;
	}

	public String getTmp_Nombr3() {
		return tmp_Nombr3;
	}

	public String getTmp_Paren3() {
		return tmp_Paren3;
	}

	public String getTmp_Porce3() {
		return tmp_Porce3;
	}

	public String getTmp_Nombr4() {
		return tmp_Nombr4;
	}

	public String getTmp_Paren4() {
		return tmp_Paren4;
	}

	public String getTmp_Porce4() {
		return tmp_Porce4;
	}

	public String getTmp_RieCal() {
		return tmp_RieCal;
	}

	public String getTmp_RieCol() {
		return tmp_RieCol;
	}

	public String getTmp_RieLoc() {
		return tmp_RieLoc;
	}

	public String getTmp_RieEnt() {
		return tmp_RieEnt;
	}

	public String getTmp_RieCop() {
		return tmp_RieCop;
	}

	public String getTmp_RieTel() {
		return tmp_RieTel;
	}

	public String getTmp_GirDes() {
		return tmp_GirDes;
	}

	public String getTmp_CodPos() {
		return tmp_CodPos;
	}

	public String getTmp_EmaAdi() {
		return tmp_EmaAdi;
	}

	public Float getTmp_CelAdi() {
		return tmp_CelAdi;
	}

	public String getTmp_Parent() {
		return tmp_Parent;
	}

	public String getBitacoraProcedimientoEjecutado() {
		return bitacoraProcedimientoEjecutado;
	}

	public void setTmp_NumCom(String tmp_NumCom) {
		this.tmp_NumCom = tmp_NumCom;
	}

	public void setTmp_NumCon(Float tmp_NumCon) {
		this.tmp_NumCon = tmp_NumCon;
	}

	public void setTmp_NumPro(String tmp_NumPro) {
		this.tmp_NumPro = tmp_NumPro;
	}

	public void setTmp_NumPol(String tmp_NumPol) {
		this.tmp_NumPol = tmp_NumPol;
	}

	public void setTmp_Asegur(String tmp_Asegur) {
		this.tmp_Asegur = tmp_Asegur;
	}

	public void setTmp_DesPro(String tmp_DesPro) {
		this.tmp_DesPro = tmp_DesPro;
	}

	public void setTmp_Nombre(String tmp_Nombre) {
		this.tmp_Nombre = tmp_Nombre;
	}

	public void setTmp_ApePat(String tmp_ApePat) {
		this.tmp_ApePat = tmp_ApePat;
	}

	public void setTmp_ApeMat(String tmp_ApeMat) {
		this.tmp_ApeMat = tmp_ApeMat;
	}

	public void setTmp_FecNac(String tmp_FecNac) {
		this.tmp_FecNac = tmp_FecNac;
	}

	public void setTmp_Edad(Integer tmp_Edad) {
		this.tmp_Edad = tmp_Edad;
	}

	public void setTmp_RFC(String tmp_RFC) {
		this.tmp_RFC = tmp_RFC;
	}

	public void setTmp_Email(String tmp_Email) {
		this.tmp_Email = tmp_Email;
	}

	public void setTmp_Telefo(String tmp_Telefo) {
		this.tmp_Telefo = tmp_Telefo;
	}

	public void setTmp_CalNum(String tmp_CalNum) {
		this.tmp_CalNum = tmp_CalNum;
	}

	public void setTmp_Coloni(String tmp_Coloni) {
		this.tmp_Coloni = tmp_Coloni;
	}

	public void setTmp_Locali(String tmp_Locali) {
		this.tmp_Locali = tmp_Locali;
	}

	public void setTmp_Entida(String tmp_Entida) {
		this.tmp_Entida = tmp_Entida;
	}

	public void setTmp_PriAnu(Integer tmp_PriAnu) {
		this.tmp_PriAnu = tmp_PriAnu;
	}

	public void setTmp_NumPag(Integer tmp_NumPag) {
		this.tmp_NumPag = tmp_NumPag;
	}

	public void setTmp_PriPag(Integer tmp_PriPag) {
		this.tmp_PriPag = tmp_PriPag;
	}

	public void setTmp_PagSub(Integer tmp_PagSub) {
		this.tmp_PagSub = tmp_PagSub;
	}

	public void setTmp_FecIni(String tmp_FecIni) {
		this.tmp_FecIni = tmp_FecIni;
	}

	public void setTmp_FecFin(String tmp_FecFin) {
		this.tmp_FecFin = tmp_FecFin;
	}

	public void setTmp_Paquet(String tmp_Paquet) {
		this.tmp_Paquet = tmp_Paquet;
	}

	public void setTmp_TipPla(String tmp_TipPla) {
		this.tmp_TipPla = tmp_TipPla;
	}

	public void setTmp_TipRen(String tmp_TipRen) {
		this.tmp_TipRen = tmp_TipRen;
	}

	public void setTmp_Nombr1(String tmp_Nombr1) {
		this.tmp_Nombr1 = tmp_Nombr1;
	}

	public void setTmp_Paren1(String tmp_Paren1) {
		this.tmp_Paren1 = tmp_Paren1;
	}

	public void setTmp_Porce1(String tmp_Porce1) {
		this.tmp_Porce1 = tmp_Porce1;
	}

	public void setTmp_Nombr2(String tmp_Nombr2) {
		this.tmp_Nombr2 = tmp_Nombr2;
	}

	public void setTmp_Paren2(String tmp_Paren2) {
		this.tmp_Paren2 = tmp_Paren2;
	}

	public void setTmp_Porce2(String tmp_Porce2) {
		this.tmp_Porce2 = tmp_Porce2;
	}

	public void setTmp_Nombr3(String tmp_Nombr3) {
		this.tmp_Nombr3 = tmp_Nombr3;
	}

	public void setTmp_Paren3(String tmp_Paren3) {
		this.tmp_Paren3 = tmp_Paren3;
	}

	public void setTmp_Porce3(String tmp_Porce3) {
		this.tmp_Porce3 = tmp_Porce3;
	}

	public void setTmp_Nombr4(String tmp_Nombr4) {
		this.tmp_Nombr4 = tmp_Nombr4;
	}

	public void setTmp_Paren4(String tmp_Paren4) {
		this.tmp_Paren4 = tmp_Paren4;
	}

	public void setTmp_Porce4(String tmp_Porce4) {
		this.tmp_Porce4 = tmp_Porce4;
	}

	public void setTmp_RieCal(String tmp_RieCal) {
		this.tmp_RieCal = tmp_RieCal;
	}

	public void setTmp_RieCol(String tmp_RieCol) {
		this.tmp_RieCol = tmp_RieCol;
	}

	public void setTmp_RieLoc(String tmp_RieLoc) {
		this.tmp_RieLoc = tmp_RieLoc;
	}

	public void setTmp_RieEnt(String tmp_RieEnt) {
		this.tmp_RieEnt = tmp_RieEnt;
	}

	public void setTmp_RieCop(String tmp_RieCop) {
		this.tmp_RieCop = tmp_RieCop;
	}

	public void setTmp_RieTel(String tmp_RieTel) {
		this.tmp_RieTel = tmp_RieTel;
	}

	public void setTmp_GirDes(String tmp_GirDes) {
		this.tmp_GirDes = tmp_GirDes;
	}

	public void setTmp_CodPos(String tmp_CodPos) {
		this.tmp_CodPos = tmp_CodPos;
	}

	public void setTmp_EmaAdi(String tmp_EmaAdi) {
		this.tmp_EmaAdi = tmp_EmaAdi;
	}

	public void setTmp_CelAdi(Float tmp_CelAdi) {
		this.tmp_CelAdi = tmp_CelAdi;
	}

	public void setTmp_Parent(String tmp_Parent) {
		this.tmp_Parent = tmp_Parent;
	}

	public void setBitacoraProcedimientoEjecutado(String bitacoraProcedimientoEjecutado) {
		this.bitacoraProcedimientoEjecutado = bitacoraProcedimientoEjecutado;
	}

	public Servicio() {

	}

	@Override
	public String toString() {
		return "Servicio [tmp_NumCon=" + tmp_NumCon + ", tmp_NumCom=" + tmp_NumCom + ", tmp_NumPro=" + tmp_NumPro
				+ ", tmp_NumPol=" + tmp_NumPol + ", tmp_Asegur=" + tmp_Asegur + ", tmp_DesPro=" + tmp_DesPro
				+ ", tmp_Nombre=" + tmp_Nombre + ", tmp_ApePat=" + tmp_ApePat + ", tmp_ApeMat=" + tmp_ApeMat
				+ ", tmp_FecNac=" + tmp_FecNac + ", tmp_Edad=" + tmp_Edad + ", tmp_RFC=" + tmp_RFC + ", tmp_Email="
				+ tmp_Email + ", tmp_Telefo=" + tmp_Telefo + ", tmp_CalNum=" + tmp_CalNum + ", tmp_Coloni=" + tmp_Coloni
				+ ", tmp_Locali=" + tmp_Locali + ", tmp_Entida=" + tmp_Entida + ", tmp_PriAnu=" + tmp_PriAnu
				+ ", tmp_NumPag=" + tmp_NumPag + ", tmp_PriPag=" + tmp_PriPag + ", tmp_PagSub=" + tmp_PagSub
				+ ", tmp_FecIni=" + tmp_FecIni + ", tmp_FecFin=" + tmp_FecFin + ", tmp_Paquet=" + tmp_Paquet
				+ ", tmp_TipPla=" + tmp_TipPla + ", tmp_TipRen=" + tmp_TipRen + ", tmp_Nombr1=" + tmp_Nombr1
				+ ", tmp_Paren1=" + tmp_Paren1 + ", tmp_Porce1=" + tmp_Porce1 + ", tmp_Nombr2=" + tmp_Nombr2
				+ ", tmp_Paren2=" + tmp_Paren2 + ", tmp_Porce2=" + tmp_Porce2 + ", tmp_Nombr3=" + tmp_Nombr3
				+ ", tmp_Paren3=" + tmp_Paren3 + ", tmp_Porce3=" + tmp_Porce3 + ", tmp_Nombr4=" + tmp_Nombr4
				+ ", tmp_Paren4=" + tmp_Paren4 + ", tmp_Porce4=" + tmp_Porce4 + ", tmp_RieCal=" + tmp_RieCal
				+ ", tmp_RieCol=" + tmp_RieCol + ", tmp_RieLoc=" + tmp_RieLoc + ", tmp_RieEnt=" + tmp_RieEnt
				+ ", tmp_RieCop=" + tmp_RieCop + ", tmp_RieTel=" + tmp_RieTel + ", tmp_GirDes=" + tmp_GirDes
				+ ", tmp_CodPos=" + tmp_CodPos + ", tmp_EmaAdi=" + tmp_EmaAdi + ", tmp_CelAdi=" + tmp_CelAdi
				+ ", tmp_Parent=" + tmp_Parent + ", tmp_FecMod=" + tmp_FecMod + ", tmp_MotCan=" + tmp_MotCan
				+ ", tmp_FecCan=" + tmp_FecCan + ", bitacoraProcedimientoEjecutado=" + bitacoraProcedimientoEjecutado
				+ "]";
	}

}
