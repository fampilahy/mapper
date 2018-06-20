package model.document.sib21;

public class Seguro extends AbstractSIB21Document {

	private Integer montoTotalPoliza;
	private Integer montoPrimerPago;
	private Integer numeroPagos;
	private Integer importeDocumento;
	private Integer montoSumaAsegurada;
	private Integer montoIVAprima;
	private Integer montoIVAfronterizo;
	private Integer costoAnual;
	private Integer pagado;
	private Integer saldo;

	public Seguro() {

	}

	public Integer getMontoTotalPoliza() {
		return montoTotalPoliza;
	}

	public void setMontoTotalPoliza(Integer montoTotalPoliza) {
		this.montoTotalPoliza = montoTotalPoliza;
	}

	public Integer getMontoPrimerPago() {
		return montoPrimerPago;
	}

	public void setMontoPrimerPago(Integer montoPrimerPago) {
		this.montoPrimerPago = montoPrimerPago;
	}

	public Integer getNumeroPagos() {
		return numeroPagos;
	}

	public void setNumeroPagos(Integer numeroPagos) {
		this.numeroPagos = numeroPagos;
	}

	public Integer getImporteDocumento() {
		return importeDocumento;
	}

	public void setImporteDocumento(Integer importeDocumento) {
		this.importeDocumento = importeDocumento;
	}

	public Integer getMontoSumaAsegurada() {
		return montoSumaAsegurada;
	}

	public void setMontoSumaAsegurada(Integer montoSumaAsegurada) {
		this.montoSumaAsegurada = montoSumaAsegurada;
	}

	public Integer getMontoIVAprima() {
		return montoIVAprima;
	}

	public void setMontoIVAprima(Integer montoIVAprima) {
		this.montoIVAprima = montoIVAprima;
	}

	public Integer getMontoIVAfronterizo() {
		return montoIVAfronterizo;
	}

	public void setMontoIVAfronterizo(Integer montoIVAfronterizo) {
		this.montoIVAfronterizo = montoIVAfronterizo;
	}

	public Integer getCostoAnual() {
		return costoAnual;
	}

	public void setCostoAnual(Integer costoAnual) {
		this.costoAnual = costoAnual;
	}

	public Integer getPagado() {
		return pagado;
	}

	public void setPagado(Integer pagado) {
		this.pagado = pagado;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
}
