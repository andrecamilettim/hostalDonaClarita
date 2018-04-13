package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EMPRESA database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_EMPRESA")
	private long idEmpresa;

	private String direccionempresa;

	private String email;

	private BigDecimal estado;

	@Column(name="NOMBRE_ENCARGADO")
	private String nombreEncargado;

	private String nombreempresa;

	private String password;

	@Column(name="PASSWORD_CONFIRM")
	private String passwordConfirm;

	private String rubro;

	private String rutempresa;

	private BigDecimal telefono;

	private String username;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="empresa")
	private List<Factura> facturas;

	//bi-directional many-to-one association to OrdenCompra
	@OneToMany(mappedBy="empresa")
	private List<OrdenCompra> ordenCompras;

	public Empresa() {
	}

	public long getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getDireccionempresa() {
		return this.direccionempresa;
	}

	public void setDireccionempresa(String direccionempresa) {
		this.direccionempresa = direccionempresa;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public String getNombreEncargado() {
		return this.nombreEncargado;
	}

	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public String getNombreempresa() {
		return this.nombreempresa;
	}

	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
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

	public String getRubro() {
		return this.rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getRutempresa() {
		return this.rutempresa;
	}

	public void setRutempresa(String rutempresa) {
		this.rutempresa = rutempresa;
	}

	public BigDecimal getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
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
		factura.setEmpresa(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setEmpresa(null);

		return factura;
	}

	public List<OrdenCompra> getOrdenCompras() {
		return this.ordenCompras;
	}

	public void setOrdenCompras(List<OrdenCompra> ordenCompras) {
		this.ordenCompras = ordenCompras;
	}

	public OrdenCompra addOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().add(ordenCompra);
		ordenCompra.setEmpresa(this);

		return ordenCompra;
	}

	public OrdenCompra removeOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().remove(ordenCompra);
		ordenCompra.setEmpresa(null);

		return ordenCompra;
	}

}