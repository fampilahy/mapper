package model.document.sib21;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//@JsonIgnoreProperties(ignoreUnknown=true)
public class SIB21Document extends AbstractSIB21Document {

	@JsonIgnore
	private Seguro seguro;
	@JsonIgnore
	private Documento documento;
	@JsonIgnore
	private Beneficiario beneficiario;
	@JsonIgnore
	private Asegurado asegurado;
	private Servicio servicio;

	public SIB21Document() {

	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Asegurado getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}
