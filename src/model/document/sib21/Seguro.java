package model.document.sib21;

public class Seguro extends AbstractSIB21Document {
	
	private String numeroPoliza;
	private String aseguradora;
	private String numeroCliente;
	//TODO ask var type String o Date
	private String fechaVigenciaInicial;
	private String fechaVigenciaFinal;
	private String tipoProducto;
	private String paquete;
	private String tipoPlanCobertura;
	private String cuentaCheques;
	private String contratanteCliente;
	private String tipoPagooCobro ;
	//TODO ask var Type Double o Float;
	private Float montoTotalPoliza;
	private Float montoPrimerPago;
	private Integer numeroPagos;
	//TODO ask var Type Double o Float o Integer;
	private Float importeDocumento;
	private String diaPago;
	private String plazoPago;
	private String tarjetaCredito;
	private String statusPoliza;
	private String tipoCanal;
	private String motivoCancelacion;
	private String tipoContratante;
	private String paqueteExtra;
	private String coberturaAdicional;
	private String tipoPoliza;
	private String claveEjecutivo;
	private String numeroSucursal;
	private String claveZona;
	private String tipoSeguro;
	//TODO ask type
	private Float montoSumaAsegurada;
	private Float montoIVAprima;
	private Float montoIVAfronterizo;
	private String tipoRenovacion;
	private String tipoConsulta;
	//TODO ask type
	private Float costoAnual;
	private Float pagado;
	private Float saldo;
	private String usuarioVendedor;
	private String bitacoraUsuario;
	//TODO ask type date or string
	private String bitacoraFechaHora;
	private String bitacoraPantalla;
	private String bitacoraSucursal;
	private String bitacoraOperacion;
	private String bitacoraAplicacion;
	private String bitacoraProducto;
	private String bitacoraInformacionEnviada;
	private String bitacoraProcedimientoEjecutado;
	private String bitacoraRutaAcceso;
	private String bitacoraPerfilUsuario;
	
	public String getNumeroPoliza() {
		return numeroPoliza;
	}
	public void setNumeroPoliza(String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	public String getAseguradora() {
		return aseguradora;
	}
	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getFechaVigenciaInicial() {
		return fechaVigenciaInicial;
	}
	public void setFechaVigenciaInicial(String fechaVigenciaInicial) {
		this.fechaVigenciaInicial = fechaVigenciaInicial;
	}
	public String getFechaVigenciaFinal() {
		return fechaVigenciaFinal;
	}
	public void setFechaVigenciaFinal(String fechaVigenciaFinal) {
		this.fechaVigenciaFinal = fechaVigenciaFinal;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getPaquete() {
		return paquete;
	}
	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}
	public String getTipoPlanCobertura() {
		return tipoPlanCobertura;
	}
	public void setTipoPlanCobertura(String tipoPlanCobertura) {
		this.tipoPlanCobertura = tipoPlanCobertura;
	}
	public String getCuentaCheques() {
		return cuentaCheques;
	}
	public void setCuentaCheques(String cuentaCheques) {
		this.cuentaCheques = cuentaCheques;
	}
	public String getContratanteCliente() {
		return contratanteCliente;
	}
	public void setContratanteCliente(String contratanteCliente) {
		this.contratanteCliente = contratanteCliente;
	}
	public String getTipoPagooCobro() {
		return tipoPagooCobro;
	}
	public void setTipoPagooCobro(String tipoPagooCobro) {
		this.tipoPagooCobro = tipoPagooCobro;
	}
	public Float getMontoTotalPoliza() {
		return montoTotalPoliza;
	}
	public void setMontoTotalPoliza(Float montoTotalPoliza) {
		this.montoTotalPoliza = montoTotalPoliza;
	}
	public Float getMontoPrimerPago() {
		return montoPrimerPago;
	}
	public void setMontoPrimerPago(Float montoPrimerPago) {
		this.montoPrimerPago = montoPrimerPago;
	}
	public Integer getNumeroPagos() {
		return numeroPagos;
	}
	public void setNumeroPagos(Integer numeroPagos) {
		this.numeroPagos = numeroPagos;
	}
	public Float getImporteDocumento() {
		return importeDocumento;
	}
	public void setImporteDocumento(Float importeDocumento) {
		this.importeDocumento = importeDocumento;
	}
	public String getDiaPago() {
		return diaPago;
	}
	public void setDiaPago(String diaPago) {
		this.diaPago = diaPago;
	}
	public String getPlazoPago() {
		return plazoPago;
	}
	public void setPlazoPago(String plazoPago) {
		this.plazoPago = plazoPago;
	}
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public String getStatusPoliza() {
		return statusPoliza;
	}
	public void setStatusPoliza(String statusPoliza) {
		this.statusPoliza = statusPoliza;
	}
	public String getTipoCanal() {
		return tipoCanal;
	}
	public void setTipoCanal(String tipoCanal) {
		this.tipoCanal = tipoCanal;
	}
	public String getMotivoCancelacion() {
		return motivoCancelacion;
	}
	public void setMotivoCancelacion(String motivoCancelacion) {
		this.motivoCancelacion = motivoCancelacion;
	}
	public String getTipoContratante() {
		return tipoContratante;
	}
	public void setTipoContratante(String tipoContratante) {
		this.tipoContratante = tipoContratante;
	}
	public String getPaqueteExtra() {
		return paqueteExtra;
	}
	public void setPaqueteExtra(String paqueteExtra) {
		this.paqueteExtra = paqueteExtra;
	}
	public String getCoberturaAdicional() {
		return coberturaAdicional;
	}
	public void setCoberturaAdicional(String coberturaAdicional) {
		this.coberturaAdicional = coberturaAdicional;
	}
	public String getTipoPoliza() {
		return tipoPoliza;
	}
	public void setTipoPoliza(String tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}
	public String getClaveEjecutivo() {
		return claveEjecutivo;
	}
	public void setClaveEjecutivo(String claveEjecutivo) {
		this.claveEjecutivo = claveEjecutivo;
	}
	public String getNumeroSucursal() {
		return numeroSucursal;
	}
	public void setNumeroSucursal(String numeroSucursal) {
		this.numeroSucursal = numeroSucursal;
	}
	public String getClaveZona() {
		return claveZona;
	}
	public void setClaveZona(String claveZona) {
		this.claveZona = claveZona;
	}
	public String getTipoSeguro() {
		return tipoSeguro;
	}
	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	public Float getMontoSumaAsegurada() {
		return montoSumaAsegurada;
	}
	public void setMontoSumaAsegurada(Float montoSumaAsegurada) {
		this.montoSumaAsegurada = montoSumaAsegurada;
	}
	public Float getMontoIVAprima() {
		return montoIVAprima;
	}
	public void setMontoIVAprima(Float montoIVAprima) {
		this.montoIVAprima = montoIVAprima;
	}
	public Float getMontoIVAfronterizo() {
		return montoIVAfronterizo;
	}
	public void setMontoIVAfronterizo(Float montoIVAfronterizo) {
		this.montoIVAfronterizo = montoIVAfronterizo;
	}
	public String getTipoRenovacion() {
		return tipoRenovacion;
	}
	public void setTipoRenovacion(String tipoRenovacion) {
		this.tipoRenovacion = tipoRenovacion;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public Float getCostoAnual() {
		return costoAnual;
	}
	public void setCostoAnual(Float costoAnual) {
		this.costoAnual = costoAnual;
	}
	public Float getPagado() {
		return pagado;
	}
	public void setPagado(Float pagado) {
		this.pagado = pagado;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	public String getUsuarioVendedor() {
		return usuarioVendedor;
	}
	public void setUsuarioVendedor(String usuarioVendedor) {
		this.usuarioVendedor = usuarioVendedor;
	}
	public String getBitacoraUsuario() {
		return bitacoraUsuario;
	}
	public void setBitacoraUsuario(String bitacoraUsuario) {
		this.bitacoraUsuario = bitacoraUsuario;
	}
	public String getBitacoraFechaHora() {
		return bitacoraFechaHora;
	}
	public void setBitacoraFechaHora(String bitacoraFechaHora) {
		this.bitacoraFechaHora = bitacoraFechaHora;
	}
	public String getBitacoraPantalla() {
		return bitacoraPantalla;
	}
	public void setBitacoraPantalla(String bitacoraPantalla) {
		this.bitacoraPantalla = bitacoraPantalla;
	}
	public String getBitacoraSucursal() {
		return bitacoraSucursal;
	}
	public void setBitacoraSucursal(String bitacoraSucursal) {
		this.bitacoraSucursal = bitacoraSucursal;
	}
	public String getBitacoraOperacion() {
		return bitacoraOperacion;
	}
	public void setBitacoraOperacion(String bitacoraOperacion) {
		this.bitacoraOperacion = bitacoraOperacion;
	}
	public String getBitacoraAplicacion() {
		return bitacoraAplicacion;
	}
	public void setBitacoraAplicacion(String bitacoraAplicacion) {
		this.bitacoraAplicacion = bitacoraAplicacion;
	}
	public String getBitacoraProducto() {
		return bitacoraProducto;
	}
	public void setBitacoraProducto(String bitacoraProducto) {
		this.bitacoraProducto = bitacoraProducto;
	}
	public String getBitacoraInformacionEnviada() {
		return bitacoraInformacionEnviada;
	}
	public void setBitacoraInformacionEnviada(String bitacoraInformacionEnviada) {
		this.bitacoraInformacionEnviada = bitacoraInformacionEnviada;
	}
	public String getBitacoraProcedimientoEjecutado() {
		return bitacoraProcedimientoEjecutado;
	}
	public void setBitacoraProcedimientoEjecutado(String bitacoraProcedimientoEjecutado) {
		this.bitacoraProcedimientoEjecutado = bitacoraProcedimientoEjecutado;
	}
	public String getBitacoraRutaAcceso() {
		return bitacoraRutaAcceso;
	}
	public void setBitacoraRutaAcceso(String bitacoraRutaAcceso) {
		this.bitacoraRutaAcceso = bitacoraRutaAcceso;
	}
	public String getBitacoraPerfilUsuario() {
		return bitacoraPerfilUsuario;
	}
	public void setBitacoraPerfilUsuario(String bitacoraPerfilUsuario) {
		this.bitacoraPerfilUsuario = bitacoraPerfilUsuario;
	}
	
	public Seguro(){
		
	}
	

}
