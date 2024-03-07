#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

#define PORT 12345

int main() {
    int serverSocket, clientSocket;
    struct sockaddr_in serverAddr, clientAddr;
    socklen_t addrSize = sizeof(struct sockaddr_in);

    // Crear el socket
    serverSocket = socket(AF_INET, SOCK_STREAM, 0);
    if (serverSocket == -1) {
        perror("Error al crear el socket");
        exit(EXIT_FAILURE);
    }

    // Configurar la estructura del servidor
    memset(&serverAddr, 0, sizeof(serverAddr));
    serverAddr.sin_family = AF_INET;
    serverAddr.sin_addr.s_addr = INADDR_ANY;
    serverAddr.sin_port = htons(PORT);

    // Vincular el socket a la dirección y puerto
    if (bind(serverSocket, (struct sockaddr*)&serverAddr, sizeof(serverAddr)) == -1) {
        perror("Error al vincular el socket");
        close(serverSocket);
        exit(EXIT_FAILURE);
    }

    // Escuchar conexiones entrantes
    if (listen(serverSocket, 5) == -1) {
        perror("Error al escuchar");
        close(serverSocket);
        exit(EXIT_FAILURE);
    }

    printf("Esperando conexiones...\n");

    // Aceptar la conexión del cliente
    clientSocket = accept(serverSocket, (struct sockaddr*)&clientAddr, &addrSize);
    if (clientSocket == -1) {
        perror("Error al aceptar la conexión");
        close(serverSocket);
        exit(EXIT_FAILURE);
    }

    printf("Cliente conectado\n");

    // Procesar datos del cliente
    int num;
    do {
        // Recibir número del cliente
        recv(clientSocket, &num, sizeof(num), 0);

        // Incrementar el número
        num++;

        // Enviar el resultado de vuelta al cliente
        send(clientSocket, &num, sizeof(num), 0);

    } while (num != 0);

    printf("Cliente desconectado\n");

    // Cerrar sockets
    close(clientSocket);
    close(serverSocket);

    return 0;
}

