package OctArch;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(3349);
        Socket socket = server.accept();

        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

        ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

        output.flush();
        output.close();
        input.close();
        server.close();
    }
}
