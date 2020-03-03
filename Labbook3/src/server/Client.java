package server;

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

            Scanner sr = new Scanner(socket.getInputStream());
            while(sr.hasNextLine()){
                System.out.println(sr.nextLine());
            }
            sr.close();
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
