import java.rmi.*;
import java.rmi.server.*;

class ProveedorCarrito extends UnicastRemoteObject implements TiendaOnline {
    public ProveedorCarrito() throws RemoteException {
        super();
    }

    public void registrarUsuario(String usuario, String contrasegna) {

    }

    public boolean iniciarSesion(String usuario, String contrasegna) {
     
            return false;
        
	}

    public String comprar(String producto) throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String agregarAlCarrito(String producto) throws RemoteException {
        return "Producto " + producto + " agregado al carrito";
    }

    public String verCarrito() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }

    public String pagar() throws RemoteException {
        return "Operación no disponible en este proveedor";
    }
}
