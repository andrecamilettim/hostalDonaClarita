package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USUARIO")
	private long idUsuario;

	private String email;

	@Column(name="ESTADO_USUARIO")
	private BigDecimal estadoUsuario;

	@Column(name="FECHA_NACIMIENTO")
	private String fechaNacimiento;

	private String nombre;

	private String password;

	@Column(name="PASSWORD_CONFIRM")
	private String passwordConfirm;

	private String rut;

	private String username;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="usuario")
	private List<Factura> facturas;

	//bi-directional many-to-one association to OrdenPedido
	@OneToMany(mappedBy="usuario")
	private List<OrdenPedido> ordenPedidos;

	//bi-directional many-to-one association to TipoUsuario
	@ManyToOne
	@JoinColumn(name="TIPO_USUARIO_ID_TIPOUSUARIO")
	private TipoUsuario tipoUsuario;

	public Usuario() {
	}

	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEstadoUsuario() {
		return this.estadoUsuario;
	}

	public void setEstadoUsuario(BigDecimal estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return this.passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setUsuario(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setUsuario(null);

		return factura;
	}

	public List<OrdenPedido> getOrdenPedidos() {
		return this.ordenPedidos;
	}

	public void setOrdenPedidos(List<OrdenPedido> ordenPedidos) {
		this.ordenPedidos = ordenPedidos;
	}

	public OrdenPedido addOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().add(ordenPedido);
		ordenPedido.setUsuario(this);

		return ordenPedido;
	}

	public OrdenPedido removeOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().remove(ordenPedido);
		ordenPedido.setUsuario(null);

		return ordenPedido;
	}

	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}