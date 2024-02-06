class PROVEEDORES {

	private String codigo;
	private String nombre;
	private String direccion;
	private String fechaAlta;
	private String telefono;
	private String correoElectronico;

	public PROVEEDORES(String codigo, String nombre, String direccion, String fechaAlta, String telefono, String correoElectronico) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}
