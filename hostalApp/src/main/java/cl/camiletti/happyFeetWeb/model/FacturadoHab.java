package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FACTURADO_HAB database table.
 * 
 */
@Entity
@Table(name="FACTURADO_HAB")
@NamedQuery(name="FacturadoHab.findAll", query="SELECT f FROM FacturadoHab f")
public class FacturadoHab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FH")
	private long idFh;

	@Column(name="ESTADO_FH")
	private String estadoFh;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_HORA_INICIO")
	private Date fechaHoraInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_HORA_TERMINO")
	private Date fechaHoraTermino;

	//bi-directional many-to-one association to Habitacion
	@ManyToOne
	private Habitacion habitacion;

	//bi-directional many-to-one association to Huesped
	@OneToMany(mappedBy="facturadoHab")
	private List<Huesped> huespeds;

	//bi-directional many-to-one association to OrdenCompra
	@OneToMany(mappedBy="facturadoHab")
	private List<OrdenCompra> ordenCompras;

	public FacturadoHab() {
	}

	public long getIdFh() {
		return this.idFh;
	}

	public void setIdFh(long idFh) {
		this.idFh = idFh;
	}

	public String getEstadoFh() {
		return this.estadoFh;
	}

	public void setEstadoFh(String estadoFh) {
		this.estadoFh = estadoFh;
	}

	public Date getFechaHoraInicio() {
		return this.fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechaHoraTermino() {
		return this.fechaHoraTermino;
	}

	public void setFechaHoraTermino(Date fechaHoraTermino) {
		this.fechaHoraTermino = fechaHoraTermino;
	}

	public Habitacion getHabitacion() {
		return this.habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public List<Huesped> getHuespeds() {
		return this.huespeds;
	}

	public void setHuespeds(List<Huesped> huespeds) {
		this.huespeds = huespeds;
	}

	public Huesped addHuesped(Huesped huesped) {
		getHuespeds().add(huesped);
		huesped.setFacturadoHab(this);

		return huesped;
	}

	public Huesped removeHuesped(Huesped huesped) {
		getHuespeds().remove(huesped);
		huesped.setFacturadoHab(null);

		return huesped;
	}

	public List<OrdenCompra> getOrdenCompras() {
		return this.ordenCompras;
	}

	public void setOrdenCompras(List<OrdenCompra> ordenCompras) {
		this.ordenCompras = ordenCompras;
	}

	public OrdenCompra addOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().add(ordenCompra);
		ordenCompra.setFacturadoHab(this);

		return ordenCompra;
	}

	public OrdenCompra removeOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().remove(ordenCompra);
		ordenCompra.setFacturadoHab(null);

		return ordenCompra;
	}

}