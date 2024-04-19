import java.rmi.*;
import java.util.Scanner;
public class Cliente2 {
    public static void main(String[] args) {
        try {
            // Conectar con el servidor RMI
            TiendaOnline proveedorCompra = (TiendaOnline) Naming.lookup("rmi://localhost/Compra");
            TiendaOnline proveedorCarrito = (TiendaOnline) Naming.lookup("rmi://localhost/Carrito");
            TiendaOnline proveedorVerCarrito = (TiendaOnline) Naming.lookup("rmi://localhost/VerCarrito");
            TiendaOnline proveedorPagar = (TiendaOnline) Naming.lookup("rmi://localhost/Pagar");
            TiendaOnline proveedorRegistro = (TiendaOnline) Naming.lookup("rmi://localhost/Registro");
            // Realizar operaciones con los proveedores
            Scanner lectura = new Scanner (System.in);
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
	
            System.out.println("Resultado del proveedor de compra: " + proveedorCompra.comprar("Producto3"));
            System.out.println("Resultado del proveedor de carrito: " + proveedorCarrito.agregarAlCarrito("Producto44"));
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
