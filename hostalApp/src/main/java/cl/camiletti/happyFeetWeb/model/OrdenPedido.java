package cl.camiletti.happyFeetWeb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ORDEN_PEDIDO database table.
 * 
 */
@Entity
@Table(name="ORDEN_PEDIDO")
@NamedQuery(name="OrdenPedido.findAll", query="SELECT o FROM OrdenPedido o")
public class OrdenPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PEDIDO")
	private long idPedido;

	@Column(name="CANTIDAD_PEDIDO")
	private BigDecimal cantidadPedido;

	private BigDecimal enviado;

	@Column(name="ESTADO_PEDIDO")
	private BigDecimal estadoPedido;

	@Column(name="NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name="NOMBRE_PROVEEDOR")
	private String nombreProveedor;

	@Column(name="PRECIO_TOTAL")
	private BigDecimal precioTotal;

	@Column(name="PRECIO_UNIDAD")
	private BigDecimal precioUnidad;

	//bi-directional many-to-one association to DetallePedido
	@ManyToOne
	@JoinColumn(name="DETALLE_PEDIDO_ID_REVISION")
	private DetallePedido detallePedido;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	private Proveedor proveedor;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public OrdenPedido() {
	}

	public long getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public BigDecimal getCantidadPedido() {
		return this.cantidadPedido;
	}

	public void setCantidadPedido(BigDecimal cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}

	public BigDecimal getEnviado() {
		return this.enviado;
	}

	public void setEnviado(BigDecimal enviado) {
		this.enviado = enviado;
	}

	public BigDecimal getEstadoPedido() {
		return this.estadoPedido;
	}

	public void setEstadoPedido(BigDecimal estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProveedor() {
		return this.nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public BigDecimal getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public BigDecimal getPrecioUnidad() {
		return this.precioUnidad;
	}

	public void setPrecioUnidad(BigDecimal precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public DetallePedido getDetallePedido() {
		return this.detallePedido;
	}

	public void setDetallePedido(DetallePedido detallePedido) {
		this.detallePedido = detallePedido;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}