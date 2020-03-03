package server;

import javax.imageio.IIOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
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

                ArrayList<String> quotes = new ArrayList<>();

                PrintWriter writer = new PrintWriter(client.getOutputStream(), true);


                while (textInput.hasNextLine()) {
                    String line = textInput.nextLine();
                    quotes.add(line);

                    if (line.equals("END")) {
                        break;
                    }
                }

                Random rand = new Random();
                String randomQuote = quotes.get(rand.nextInt(quotes.size()));
                writer.write(randomQuote);
                writer.write("\n" + "Something else");
                writer.flush();

                textInput.close();
                client.close();
                listener.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
