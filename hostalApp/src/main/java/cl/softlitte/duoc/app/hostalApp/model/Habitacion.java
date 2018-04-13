package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the HABITACION database table.
 * 
 */
@Entity
@NamedQuery(name="Habitacion.findAll", query="SELECT h FROM Habitacion h")
public class Habitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_HABITACION")
	private long idHabitacion;

	private String accesorios;

	private String disponibilidad;

	private BigDecimal precio;

	@Column(name="TIPO_CAMA")
	private String tipoCama;

	//bi-directional many-to-one association to FacturadoHab
	@OneToMany(mappedBy="habitacion")
	private List<FacturadoHab> facturadoHabs;

	public Habitacion() {
	}

	public long getIdHabitacion() {
		return this.idHabitacion;
	}

	public void setIdHabitacion(long idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public String getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}

	public String getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipoCama() {
		return this.tipoCama;
	}

	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}

	public List<FacturadoHab> getFacturadoHabs() {
		return this.facturadoHabs;
	}

	public void setFacturadoHabs(List<FacturadoHab> facturadoHabs) {
		this.facturadoHabs = facturadoHabs;
	}

	public FacturadoHab addFacturadoHab(FacturadoHab facturadoHab) {
		getFacturadoHabs().add(facturadoHab);
		facturadoHab.setHabitacion(this);

		return facturadoHab;
	}

	public FacturadoHab removeFacturadoHab(FacturadoHab facturadoHab) {
		getFacturadoHabs().remove(facturadoHab);
		facturadoHab.setHabitacion(null);

		return facturadoHab;
	}

}