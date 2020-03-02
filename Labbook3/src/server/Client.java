package server;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private static int PORT = 1234;
    private static String server = "127.0.0.1";
    public Client() {
        try {
            Socket socket = new Socket(server, PORT);
            InputStreamReader sr = new InputStreamReader(socket.getInputStream());
            int c = sr.read();
            System.out.println((char)c);
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
