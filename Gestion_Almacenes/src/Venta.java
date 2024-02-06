class VENTAS {

	private Articulo articulo;
	private String fechaCompra;
	private int unidades;
	private double precioTotal;
	private boolean pagado;


	public VENTAS(Articulo articulo, String fechaCompra, int unidades, double precioTotal, boolean pagado) {
		this.articulo = articulo;
		this.fechaCompra = fechaCompra;
		this.unidades = unidades;
		this.precioTotal = precioTotal;
		this.pagado = pagado;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public double calcularPrecioTotalConIva() {
		double precioConIva = this.precioTotal * (1 + articulo.getIva());
		return precioConIva;
	}

	public void marcarComoPagado() {
		this.pagado = true;
	}
}
