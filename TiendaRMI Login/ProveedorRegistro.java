import java.rmi.*;
import java.rmi.server.*;
import java.util.HashMap;
import java.util.Scanner;

class ProveedorRegistro extends UnicastRemoteObject implements TiendaOnline {
	
    private HashMap<String, String> usuarios; 
   
    public ProveedorRegistro() throws RemoteException {
	super();
    usuarios = new HashMap<>();  
    }


	


    // Método para registrar un nuevo usuario
    public void registrarUsuario(String usuario, String contrasegna) {
        usuarios.put(usuario, contrasegna);
        System.out.println("Usuario registrado exitosamente.");
    }

    // Método para verificar el inicio de sesión
    public boolean iniciarSesion(String usuario, String contrasegna) {
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasegna)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario + "!");
            return true;
        } else {
            System.out.println("Usuario o contrasegna incorrectos. Por favor, inténtalo de nuevo.");
            return false;
        }
    }


   

    public String comprar(String producto) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String agregarAlCarrito(String producto) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String verCarrito() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String pagar() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }
}
