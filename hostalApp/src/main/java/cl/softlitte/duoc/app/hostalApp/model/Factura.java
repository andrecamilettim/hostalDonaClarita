package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FACTURA database table.
 * 
 */
@Entity
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FACTURA")
	private long idFactura;

	@Column(name="ESTADO_FACTURA")
	private BigDecimal estadoFactura;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_HORA")
	private Date fechaHora;

	private BigDecimal iva;

	@Column(name="NOMBRE_CLIENTE")
	private String nombreCliente;

	@Column(name="NOMBRE_HUESPED")
	private String nombreHuesped;

	@Column(name="NUMERO_HABITACION")
	private BigDecimal numeroHabitacion;

	@Column(name="PRECIO_HABITACION")
	private BigDecimal precioHabitacion;

	private BigDecimal preciototal;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	private Empresa empresa;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Factura() {
	}

	public long getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getEstadoFactura() {
		return this.estadoFactura;
	}

	public void setEstadoFactura(BigDecimal estadoFactura) {
		this.estadoFactura = estadoFactura;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public BigDecimal getIva() {
		return this.iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreHuesped() {
		return this.nombreHuesped;
	}

	public void setNombreHuesped(String nombreHuesped) {
		this.nombreHuesped = nombreHuesped;
	}

	public BigDecimal getNumeroHabitacion() {
		return this.numeroHabitacion;
	}

	public void setNumeroHabitacion(BigDecimal numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public BigDecimal getPrecioHabitacion() {
		return this.precioHabitacion;
	}

	public void setPrecioHabitacion(BigDecimal precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}

	public BigDecimal getPreciototal() {
		return this.preciototal;
	}

	public void setPreciototal(BigDecimal preciototal) {
		this.preciototal = preciototal;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}