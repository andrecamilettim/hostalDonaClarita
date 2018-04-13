package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_USUARIO database table.
 * 
 */
@Entity
@Table(name="TIPO_USUARIO")
@NamedQuery(name="TipoUsuario.findAll", query="SELECT t FROM TipoUsuario t")
public class TipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPOUSUARIO")
	private long idTipousuario;

	private String nombretipousuario;

	private String rol;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="tipoUsuario")
	private List<Usuario> usuarios;

	public TipoUsuario() {
	}

	public long getIdTipousuario() {
		return this.idTipousuario;
	}

	public void setIdTipousuario(long idTipousuario) {
		this.idTipousuario = idTipousuario;
	}

	public String getNombretipousuario() {
		return this.nombretipousuario;
	}

	public void setNombretipousuario(String nombretipousuario) {
		this.nombretipousuario = nombretipousuario;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setTipoUsuario(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setTipoUsuario(null);

		return usuario;
	}

}