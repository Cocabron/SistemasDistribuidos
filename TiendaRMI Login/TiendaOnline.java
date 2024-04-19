import java.rmi.*;
import java.rmi.server.*;

interface TiendaOnline extends Remote {
    String comprar(String producto) throws RemoteException;
    String agregarAlCarrito(String producto) throws RemoteException;
    String verCarrito() throws RemoteException;
    String pagar() throws RemoteException;
    void registrarUsuario(String usuario, String contrasegna) throws RemoteException;
    boolean iniciarSesion(String usuario, String contrasegna) throws RemoteException;
}
