package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HUESPED database table.
 * 
 */
@Entity
@NamedQuery(name="Huesped.findAll", query="SELECT h FROM Huesped h")
public class Huesped implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_HUESPED")
	private long idHuesped;

	private String email;

	@Column(name="ESTADO_H")
	private BigDecimal estadoH;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	private String nombre;

	private String rut;

	//bi-directional many-to-one association to FacturadoHab
	@ManyToOne
	@JoinColumn(name="FACTURADO_HAB_ID_FH")
	private FacturadoHab facturadoHab;

	//bi-directional many-to-one association to FacturadoMenu
	@ManyToOne
	@JoinColumn(name="FACTURADO_MENU_ID_FM")
	private FacturadoMenu facturadoMenu;

	public Huesped() {
	}

	public long getIdHuesped() {
		return this.idHuesped;
	}

	public void setIdHuesped(long idHuesped) {
		this.idHuesped = idHuesped;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEstadoH() {
		return this.estadoH;
	}

	public void setEstadoH(BigDecimal estadoH) {
		this.estadoH = estadoH;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public FacturadoHab getFacturadoHab() {
		return this.facturadoHab;
	}

	public void setFacturadoHab(FacturadoHab facturadoHab) {
		this.facturadoHab = facturadoHab;
	}

	public FacturadoMenu getFacturadoMenu() {
		return this.facturadoMenu;
	}

	public void setFacturadoMenu(FacturadoMenu facturadoMenu) {
		this.facturadoMenu = facturadoMenu;
	}

}