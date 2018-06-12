package model.document.sib21;

public class SIB21Document extends AbstractSIB21Document {


private Beneficiario beneficiario;
private Seguro seguro;
private Asegurado asegurado;

public SIB21Document(){
	
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

}
