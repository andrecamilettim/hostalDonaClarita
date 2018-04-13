package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORDEN_COMPRA database table.
 * 
 */
@Entity
@Table(name="ORDEN_COMPRA")
@NamedQuery(name="OrdenCompra.findAll", query="SELECT o FROM OrdenCompra o")
public class OrdenCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_COMPRA")
	private long idCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

	@Column(name="NOMBRE_CLIENTE")
	private String nombreCliente;

	@Column(name="NOMBRE_HUESPED")
	private String nombreHuesped;

	@Column(name="NUMERO_HABITACION")
	private BigDecimal numeroHabitacion;

	@Column(name="PRECIO_HABITACION")
	private BigDecimal precioHabitacion;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	private Empresa empresa;

	//bi-directional many-to-one association to FacturadoHab
	@ManyToOne
	@JoinColumn(name="FACTURADO_HAB_ID_FH")
	private FacturadoHab facturadoHab;

	public OrdenCompra() {
	}

	public long getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
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

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public FacturadoHab getFacturadoHab() {
		return this.facturadoHab;
	}

	public void setFacturadoHab(FacturadoHab facturadoHab) {
		this.facturadoHab = facturadoHab;
	}

}