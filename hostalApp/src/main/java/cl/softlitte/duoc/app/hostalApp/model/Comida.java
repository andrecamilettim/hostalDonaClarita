package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the COMIDA database table.
 * 
 */
@Entity
@NamedQuery(name="Comida.findAll", query="SELECT c FROM Comida c")
public class Comida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PLATO")
	private long idPlato;

	@Temporal(TemporalType.DATE)
	private Date dia;

	@Column(name="ESTADO_COMIDA")
	private BigDecimal estadoComida;

	private String nombrecomida;

	private BigDecimal precio;

	//bi-directional many-to-one association to FacturadoMenu
	@ManyToOne
	@JoinColumn(name="FACTURADO_MENU_ID_FM")
	private FacturadoMenu facturadoMenu;

	//bi-directional many-to-one association to TipoMenu
	@ManyToOne
	@JoinColumn(name="TIPO_MENU_ID_TIPOMENU")
	private TipoMenu tipoMenu;

	public Comida() {
	}

	public long getIdPlato() {
		return this.idPlato;
	}

	public void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}

	public Date getDia() {
		return this.dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public BigDecimal getEstadoComida() {
		return this.estadoComida;
	}

	public void setEstadoComida(BigDecimal estadoComida) {
		this.estadoComida = estadoComida;
	}

	public String getNombrecomida() {
		return this.nombrecomida;
	}

	public void setNombrecomida(String nombrecomida) {
		this.nombrecomida = nombrecomida;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public FacturadoMenu getFacturadoMenu() {
		return this.facturadoMenu;
	}

	public void setFacturadoMenu(FacturadoMenu facturadoMenu) {
		this.facturadoMenu = facturadoMenu;
	}

	public TipoMenu getTipoMenu() {
		return this.tipoMenu;
	}

	public void setTipoMenu(TipoMenu tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

}