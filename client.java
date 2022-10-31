package OctArch;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket s = new Socket("local",3349);

        ObjectOutputStream output = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(s.getInputStream());



        output.close();
        input.close();
        s.close();
    }
}
