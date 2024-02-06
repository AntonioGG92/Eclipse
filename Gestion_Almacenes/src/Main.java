import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();

        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Alta Articulo");
            System.out.println("2. Baja Articulo");
            System.out.println("3. Alta Proveedor");
            System.out.println("4. Baja Proveedor");
            System.out.println("5. Listar Articulos");
            System.out.println("6. Listar Proveedores");
            System.out.println("7. Venta articulo");
            System.out.println("8. Existencias disponibles (Stock)");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del articulo:");
                    System.out.print("Codigo: ");
                    String codigo = scanner.next();
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Descripcion: ");
                    String descripcion = scanner.next();
                    System.out.print("Precio de Venta: ");
                    double precioVenta = scanner.nextDouble();
                    System.out.print("IVA: ");
                    double iva = scanner.nextDouble();
                    System.out.print("Proveedor (codigo): ");
                    String proveedorCodigo = scanner.next();
                    Proveedor proveedor = almacen.buscarProveedor(proveedorCodigo);
                    if (proveedor == null) {
                        System.out.println("Proveedor no encontrado. Por favor, registre el proveedor primero.");
                        break;
                    }
                    System.out.print("Unidades Disponibles: ");
                    int unidadesDisponibles = scanner.nextInt();
                    Articulo nuevoArticulo = new Articulo(codigo, nombre, descripcion, precioVenta, iva, proveedor, unidadesDisponibles);
                    almacen.agregarArticulo(nuevoArticulo);
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del articulo a dar de baja:");
                    String codigoBaja = scanner.next();
                    almacen.eliminarArticulo(codigoBaja);
                    break;
                case 3:
                    System.out.println("Ingrese los detalles del proveedor:");
                    System.out.print("Codigo: ");
                    String codigoProveedor = scanner.next();
                    System.out.print("Nombre: ");
                    String nombreProveedor = scanner.next();
                    System.out.print("Direccion: ");
                    String direccionProveedor = scanner.next();
                    System.out.print("Fecha de Alta (Anyo): ");
                    String fechaAltaProveedor = scanner.next();
                    System.out.print("Telefono: ");
                    String telefonoProveedor = scanner.next();
                    System.out.print("Correo Electronico: ");
                    String correoElectronicoProveedor = scanner.next();
                    Proveedor nuevoProveedor = new Proveedor(codigoProveedor, nombreProveedor, direccionProveedor, fechaAltaProveedor, telefonoProveedor, correoElectronicoProveedor);
                    almacen.agregarProveedor(nuevoProveedor);
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del proveedor a dar de baja:");
                    String codigoBajaProveedor = scanner.next();
                    almacen.eliminarProveedor(codigoBajaProveedor);
                    break;
                case 5:
                    System.out.println("Lista de Articulos:");
                    List<Articulo> listaArticulos = almacen.listarArticulos();
                    for (Articulo articulo : listaArticulos) {
                        System.out.println(articulo.getCodigo() + " - " + articulo.getNombre());
                    }
                    break;
                case 6:
                    System.out.println("Lista de Proveedores:");
                    List<Proveedor> listaProveedores = almacen.listarProveedores();
                    for (Proveedor PROVEEDOR : listaProveedores) {
                        System.out.println(PROVEEDOR.getCodigo() + " - " + PROVEEDOR.getNombre());
                    }
                    break;
                case 7:
                    // Lógica para la venta del artículo
                    break;
                case 8:
                    System.out.println("Ingrese el codigo del articulo:");
                    String codigoArticulo = scanner.next();
                    Articulo articuloSeleccionado = almacen.buscarArticulo(codigoArticulo);
                    if (articuloSeleccionado != null) {
                        int existencias = almacen.obtenerExistenciasDisponibles(articuloSeleccionado);
                        System.out.println("Existencias disponibles para " + articuloSeleccionado.getNombre() + ": " + existencias);
                    } else {
                        System.out.println("El articulo no existe en el almacen.");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, seleccione una opcion del menu.");
            }

        } while (opcion != 9);

        scanner.close();
    }
}


