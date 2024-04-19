import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class Cliente {
    public static void main(String[] args) {
        try {

	    //Lectura de registro
	    Scanner lectura = new Scanner (System.in);

            // Localizar el registro RMI en el servidor
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Buscar los proveedores en el registro RMI
            TiendaOnline proveedorCompra = (TiendaOnline) registry.lookup("Compra");
            TiendaOnline proveedorCarrito = (TiendaOnline) registry.lookup("Carrito");
            TiendaOnline proveedorVerCarrito = (TiendaOnline) registry.lookup("VerCarrito");
            TiendaOnline proveedorPagar = (TiendaOnline) registry.lookup("Pagar");
	    TiendaOnline proveedorRegistro = (TiendaOnline) registry.lookup("Registro");
            // Realizar operaciones con los proveedores
	    boolean confirma=false;
	    System.out.println("BIENVENID@");
	    System.out.println("1. Registro");
	    System.out.println("2. Login");
	    int op = lectura.nextInt();
	    if(op==1){
	    System.out.println("REGISTRO");	
	    System.out.println("Introduzca su usuario:");
	    String nombre = lectura.next();
	    System.out.println("Introduzca su contrasegna:");
	    String contra = lectura.next();	
	    proveedorRegistro.registrarUsuario(nombre,contra);
		}
		else{
			if(op==2){
	    System.out.println("INICIO DE SESION");	
	    System.out.println("Introduzca su usuario:");
	    String nombre = lectura.next();
	    System.out.println("Introduzca su contrasegna:");
	    String contra = lectura.next();	
	    confirma=proveedorRegistro.iniciarSesion(nombre,contra);
			}else{
			System.out.println("Introduzca un valor válido.");
			}
			}
			if(confirma){
	
            System.out.println("Resultado del proveedor de compra: " + proveedorCompra.comprar("Producto1"));
            System.out.println("Resultado del proveedor de carrito: " + proveedorCarrito.agregarAlCarrito("Producto2"));
            System.out.println("Resultado del proveedor de ver carrito: " + proveedorVerCarrito.verCarrito());
            System.out.println("Resultado del proveedor de pagar: " + proveedorPagar.pagar());
            }else{
            System.out.println("Usuario o contrasegna incorrectos. Por favor, inténtalo de nuevo.");
            	}
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
