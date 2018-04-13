package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DETALLE_PEDIDO database table.
 * 
 */
@Entity
@Table(name="DETALLE_PEDIDO")
@NamedQuery(name="DetallePedido.findAll", query="SELECT d FROM DetallePedido d")
public class DetallePedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_REVISION")
	private long idRevision;

	@Column(name="CODIGO_PRODUCTO")
	private String codigoProducto;

	@Column(name="CODIGO_PROVEEDOR")
	private BigDecimal codigoProveedor;

	private String descripcion;

	@Column(name="FECHA_VENCIMIENTO")
	private BigDecimal fechaVencimiento;

	@Column(name="HORA_RESIVIDO")
	private String horaResivido;

	@Column(name="NUMERO_SECUENCIA")
	private String numeroSecuencia;

	private BigDecimal precio;

	//bi-directional many-to-one association to OrdenPedido
	@OneToMany(mappedBy="detallePedido")
	private List<OrdenPedido> ordenPedidos;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="detallePedido")
	private List<Producto> productos;

	public DetallePedido() {
	}

	public long getIdRevision() {
		return this.idRevision;
	}

	public void setIdRevision(long idRevision) {
		this.idRevision = idRevision;
	}

	public String getCodigoProducto() {
		return this.codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public BigDecimal getCodigoProveedor() {
		return this.codigoProveedor;
	}

	public void setCodigoProveedor(BigDecimal codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(BigDecimal fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getHoraResivido() {
		return this.horaResivido;
	}

	public void setHoraResivido(String horaResivido) {
		this.horaResivido = horaResivido;
	}

	public String getNumeroSecuencia() {
		return this.numeroSecuencia;
	}

	public void setNumeroSecuencia(String numeroSecuencia) {
		this.numeroSecuencia = numeroSecuencia;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<OrdenPedido> getOrdenPedidos() {
		return this.ordenPedidos;
	}

	public void setOrdenPedidos(List<OrdenPedido> ordenPedidos) {
		this.ordenPedidos = ordenPedidos;
	}

	public OrdenPedido addOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().add(ordenPedido);
		ordenPedido.setDetallePedido(this);

		return ordenPedido;
	}

	public OrdenPedido removeOrdenPedido(OrdenPedido ordenPedido) {
		getOrdenPedidos().remove(ordenPedido);
		ordenPedido.setDetallePedido(null);

		return ordenPedido;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setDetallePedido(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setDetallePedido(null);

		return producto;
	}

}