package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static int PORT = 1234;
    private static String server = "127.0.0.1";
    public Client() {
        Socket socket = null;
        try {
            socket = new Socket(server, PORT);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            reader.close();
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
