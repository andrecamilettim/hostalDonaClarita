package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FACTURADO_MENU database table.
 * 
 */
@Entity
@Table(name="FACTURADO_MENU")
@NamedQuery(name="FacturadoMenu.findAll", query="SELECT f FROM FacturadoMenu f")
public class FacturadoMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FM")
	private long idFm;

	@Column(name="ESTADO_MENU")
	private String estadoMenu;

	@Column(name="FECHA_HORA_INICIO")
	private String fechaHoraInicio;

	@Column(name="FECHA_HORA_TERMINO")
	private String fechaHoraTermino;

	@Column(name="TOTAL_PAGAR")
	private BigDecimal totalPagar;

	//bi-directional many-to-one association to Comida
	@OneToMany(mappedBy="facturadoMenu")
	private List<Comida> comidas;

	//bi-directional many-to-one association to Huesped
	@OneToMany(mappedBy="facturadoMenu")
	private List<Huesped> huespeds;

	public FacturadoMenu() {
	}

	public long getIdFm() {
		return this.idFm;
	}

	public void setIdFm(long idFm) {
		this.idFm = idFm;
	}

	public String getEstadoMenu() {
		return this.estadoMenu;
	}

	public void setEstadoMenu(String estadoMenu) {
		this.estadoMenu = estadoMenu;
	}

	public String getFechaHoraInicio() {
		return this.fechaHoraInicio;
	}

	public void setFechaHoraInicio(String fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public String getFechaHoraTermino() {
		return this.fechaHoraTermino;
	}

	public void setFechaHoraTermino(String fechaHoraTermino) {
		this.fechaHoraTermino = fechaHoraTermino;
	}

	public BigDecimal getTotalPagar() {
		return this.totalPagar;
	}

	public void setTotalPagar(BigDecimal totalPagar) {
		this.totalPagar = totalPagar;
	}

	public List<Comida> getComidas() {
		return this.comidas;
	}

	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}

	public Comida addComida(Comida comida) {
		getComidas().add(comida);
		comida.setFacturadoMenu(this);

		return comida;
	}

	public Comida removeComida(Comida comida) {
		getComidas().remove(comida);
		comida.setFacturadoMenu(null);

		return comida;
	}

	public List<Huesped> getHuespeds() {
		return this.huespeds;
	}

	public void setHuespeds(List<Huesped> huespeds) {
		this.huespeds = huespeds;
	}

	public Huesped addHuesped(Huesped huesped) {
		getHuespeds().add(huesped);
		huesped.setFacturadoMenu(this);

		return huesped;
	}

	public Huesped removeHuesped(Huesped huesped) {
		getHuespeds().remove(huesped);
		huesped.setFacturadoMenu(null);

		return huesped;
	}

}