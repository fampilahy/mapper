package model.document.sib21;

public class Beneficiario extends AbstractSIB21Document {
	
	private String numeroPoliza;
	private String nombreBeneficiario;
	private String parentesco;
	private Float porcentaje;
	private String bitacoraProcedimientoEjecutado;
	
	public Beneficiario(){
		
	}

	public String getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getNombreBeneficiario() {
		return nombreBeneficiario;
	}

	public void setNombreBeneficiario(String nombreBeneficiario) {
		this.nombreBeneficiario = nombreBeneficiario;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getBitacoraProcedimientoEjecutado() {
		return bitacoraProcedimientoEjecutado;
	}

	public void setBitacoraProcedimientoEjecutado(String bitacoraProcedimientoEjecutado) {
		this.bitacoraProcedimientoEjecutado = bitacoraProcedimientoEjecutado;
	}
	
	
}
