package server;

import javax.imageio.IIOException;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable {
    private static int PORT = 1234;
    public Server() {

    }
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while(true){
            ServerSocket listener = null;
            Socket client = null;

            try {
                listener = new ServerSocket(PORT);
                client = listener.accept();
                System.out.println("Client has arrived");

                OutputStreamWriter os = new OutputStreamWriter(client.getOutputStream());


                File file = new File("Labbook3/src/server/quotes.txt");
                Scanner textInput = new Scanner(file);

                while (textInput.hasNextLine()) {
                    String line = textInput.nextLine();
                    if (line.equals("END")) {
                        break;
                    }
                    os.write(line + "\n");
                    os.flush();
                }
                textInput.close();
                client.close();
                listener.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
