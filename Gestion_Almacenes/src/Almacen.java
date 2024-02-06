import java.util.ArrayList;
import java.util.List;

class Almacen {
	private List<Articulo> articulos;
	private List<Proveedor> proveedores;
	private List<Venta> ventas;

	public Almacen() {
		articulos = new ArrayList<>();
		proveedores = new ArrayList<>();
		ventas = new ArrayList<>();
	}

	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
	}

	public void eliminarArticulo(Articulo articulo) {
		articulos.remove(articulo);
	}

	public void agregarProveedor(Proveedor proveedor) {
		proveedores.add(proveedor);
		System.out.println("Proveedor agregado correctamente: " + proveedor.getNombre());
		System.out.println("Lista de proveedores actualizada:");
		for (Proveedor p : proveedores) {
			System.out.println("- " + p.getNombre());
		}
	}

	public void eliminarProveedor(Proveedor proveedor) {
		proveedores.remove(proveedor);
	}

	public List<Articulo> listarArticulos() {
		return articulos;
	}

	public List<Proveedor> listarProveedores() {
		return proveedores;
	}

	public void venderArticulo(Articulo articulo, int unidades, double precioTotal, boolean pagado) {
		if (articulo.getUnidadesDisponibles() >= unidades) {
			articulo.setUnidadesDisponibles(articulo.getUnidadesDisponibles() - unidades);
			Venta venta = new Venta(articulo, new String(), unidades, precioTotal, pagado);
			ventas.add(venta);
		} else {
			System.out.println("No hay suficientes unidades disponibles para la venta.");
		}
	}

	public int obtenerExistenciasDisponibles(Articulo articulo) {
		return articulo.getUnidadesDisponibles();
	}

	public Proveedor buscarProveedor(String proveedorCodigo) {
		for (Proveedor proveedor : proveedores) {
			if (proveedor.getCodigo().equals(proveedorCodigo)) {
				return proveedor;
			}
		}
		return null;
	}

	public void eliminarArticulo(String codigoBaja) {
		Articulo articuloBaja = buscarArticulo(codigoBaja);
		if (articuloBaja != null) {
			articulos.remove(articuloBaja);
		} else {
			System.out.println("El articulo no existe en el almacen.");
		}
	}

	public void eliminarProveedor(String codigoBajaProveedor) {
		Proveedor proveedorBaja = buscarProveedor(codigoBajaProveedor);
		if (proveedorBaja != null) {
			proveedores.remove(proveedorBaja);
		} else {
			System.out.println("El proveedor no existe en el almacen.");
		}
	}

	public Articulo buscarArticulo(String codigoArticulo) {
		for (Articulo articulo : articulos) {
			if (articulo.getCodigo().equals(codigoArticulo)) {
				return articulo;
			}
		}
		return null;
	}
}
class Proveedor {
	private String codigo;
	private String nombre;
	private String direccion;
	private String fechaAlta;
	private String telefono;
	private String correoElectronico;

	public Proveedor(String codigoProveedor, String nombreProveedor, String direccionProveedor,
			String fechaAltaProveedor, String telefonoProveedor, String correoElectronicoProveedor) {
		this.codigo = codigoProveedor;
		this.nombre = nombreProveedor;
		this.direccion = direccionProveedor;
		this.fechaAlta = fechaAltaProveedor;
		this.telefono = telefonoProveedor;
		this.correoElectronico = correoElectronicoProveedor;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}
}

class Venta {
	private Articulo articulo;
	private String fecha;
	private int unidades;
	private double precioTotal;
	private boolean pagado;

	public Venta(Articulo articulo, String fecha, int unidades, double precioTotal, boolean pagado) {
		this.articulo = articulo;
		this.fecha = fecha;
		this.unidades = unidades;
		this.precioTotal = precioTotal;
		this.pagado = pagado;
	}
}

