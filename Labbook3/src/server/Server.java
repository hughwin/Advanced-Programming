package server;

import java.io.DataInput;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    private static int PORT = 1234;
    public Server() {

    }
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while(true){
            try{ ServerSocket listener = new ServerSocket(PORT);
                Socket client = listener.accept();
                System.out.println("Client has arrived");

                OutputStreamWriter os = new OutputStreamWriter(client.getOutputStream());

                os.write('x');
                os.flush();

                client.close();
                listener.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
