package cl.softlitte.duoc.app.hostalApp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PRODUCTO database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PRODUCTO")
	private long idProducto;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENCIMIENTO")
	private Date fechaVencimiento;

	private String nombre;

	private BigDecimal precio;

	private BigDecimal stock;

	@Column(name="STOCK_CRITICO")
	private BigDecimal stockCritico;

	//bi-directional many-to-one association to DetallePedido
	@ManyToOne
	@JoinColumn(name="DETALLE_PEDIDO_ID_REVISION")
	private DetallePedido detallePedido;

	public Producto() {
	}

	public long getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getStock() {
		return this.stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public BigDecimal getStockCritico() {
		return this.stockCritico;
	}

	public void setStockCritico(BigDecimal stockCritico) {
		this.stockCritico = stockCritico;
	}

	public DetallePedido getDetallePedido() {
		return this.detallePedido;
	}

	public void setDetallePedido(DetallePedido detallePedido) {
		this.detallePedido = detallePedido;
	}

}