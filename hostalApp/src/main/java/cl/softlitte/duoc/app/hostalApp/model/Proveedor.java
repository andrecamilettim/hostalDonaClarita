package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PROVEEDOR database table.
 * 
 */
@Entity
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROVEEDOR")
	private long idProveedor;

	private String email;

	@Column(name="ESTADO_P")
	private BigDecimal estadoP;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	private String nombre;

	private String rubro;

	private BigDecimal telefono;

	//bi-directional many-to-one association to OrdenPedido
	@OneToMany(mappedBy="proveedor")
	private List<OrdenPedido> ordenPedidos;

	public Proveedor() {
	}

	public long getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEstadoP() {
		return this.estadoP;
	}

	public void setEstadoP(BigDecimal estadoP) {
		this.estadoP = estadoP;
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

	public String getRubro() {
		return this.rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public BigDecimal getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
	}

	public List<OrdenPedido> getOrdenPedidos() {
		return this.ordenPedidos;
	}

	public void setOrdenPedidos(List<OrdenPedido> ordenPedidos) {
		this.ordenPedidos = ordenPedidos;
	}

	public OrdenPedido addOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().add(ordenPedido);
		ordenPedido.setProveedor(this);

		return ordenPedido;
	}

	public OrdenPedido removeOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().remove(ordenPedido);
		ordenPedido.setProveedor(null);

		return ordenPedido;
	}

}