import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ServidorTienda {
    public static void main(String args[]) {
        try {
            // Crear los proveedores
            ProveedorCompra proveedorCompra = new ProveedorCompra();
            ProveedorCarrito proveedorCarrito = new ProveedorCarrito();
            ProveedorVerCarrito proveedorVerCarrito = new ProveedorVerCarrito();
            ProveedorPagar proveedorPagar = new ProveedorPagar();
	    ProveedorRegistro proveedorRegistro = new ProveedorRegistro();
            // Registrar los proveedores en el registro RMI
            String direccionIP = "localhost"; // Cambiar a la dirección IP del servidor si es necesario
            int puertoRMI = 1099; // Puerto RMI predeterminado
            String rutaCompra = "//" + direccionIP + ":" + puertoRMI + "/Compra";
            String rutaCarrito = "//" + direccionIP + ":" + puertoRMI + "/Carrito";
            String rutaVerCarrito = "//" + direccionIP + ":" + puertoRMI + "/VerCarrito";
            String rutaPagar = "//" + direccionIP + ":" + puertoRMI + "/Pagar";
	    String rutaRegistro = "//" + direccionIP + ":" + puertoRMI + "/Registro";		
	

  Registry registry = LocateRegistry.createRegistry(1099);




            Naming.rebind(rutaCompra, proveedorCompra);
            Naming.rebind(rutaCarrito, proveedorCarrito);
            Naming.rebind(rutaVerCarrito, proveedorVerCarrito);
            Naming.rebind(rutaPagar, proveedorPagar);
            Naming.rebind(rutaRegistro, proveedorRegistro);

            System.out.println("Servidores listos");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
