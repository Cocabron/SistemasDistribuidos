import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try {
            // Crear el socket del cliente
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);

            // Configurar flujos de entrada/salida
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            int num;

            do {
                // Leer número desde el usuario
                System.out.print("Ingrese un número (o 0 para salir): ");
                num = Integer.parseInt(input.readLine());

                // Enviar el número al servidor
                out.println(num);

                // Recibir la respuesta del servidor
                String result = in.readLine();
                System.out.println("Respuesta del servidor: " + result);

            } while (num != 0);

            // Cerrar flujos y socket
            input.close();
            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
