package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TIPO_MENU database table.
 * 
 */
@Entity
@Table(name="TIPO_MENU")
@NamedQuery(name="TipoMenu.findAll", query="SELECT t FROM TipoMenu t")
public class TipoMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPOMENU")
	private long idTipomenu;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

	@Column(name="NOMBRE_MENU")
	private String nombreMenu;

	//bi-directional many-to-one association to Comida
	@OneToMany(mappedBy="tipoMenu")
	private List<Comida> comidas;

	public TipoMenu() {
	}

	public long getIdTipomenu() {
		return this.idTipomenu;
	}

	public void setIdTipomenu(long idTipomenu) {
		this.idTipomenu = idTipomenu;
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

	public String getNombreMenu() {
		return this.nombreMenu;
	}

	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}

	public List<Comida> getComidas() {
		return this.comidas;
	}

	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}

	public Comida addComida(Comida comida) {
		getComidas().add(comida);
		comida.setTipoMenu(this);

		return comida;
	}

	public Comida removeComida(Comida comida) {
		getComidas().remove(comida);
		comida.setTipoMenu(null);

		return comida;
	}

}