class Articulo {

	private String codigo;
	private String nombre;
	private String descripcion;
	private double precioVenta;
	private double iva;
	private Proveedor proveedor;
	private int unidadesDisponibles;


	public Articulo(String codigo, String nombre, String descripcion, double precioVenta, double iva, Proveedor proveedor, int unidadesDisponibles) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.iva = iva;
		this.proveedor = proveedor;
		this.unidadesDisponibles = unidadesDisponibles;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}


	public void actualizarUnidades(int cantidad) {
		this.unidadesDisponibles += cantidad;
	}
}

