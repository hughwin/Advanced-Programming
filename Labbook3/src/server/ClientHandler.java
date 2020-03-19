package server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClientHandler extends Thread{
    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){

        File file = new File("Labbook3/src/server/quotes.txt");
        Scanner textInput = null;
        try {
            textInput = new Scanner(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        ArrayList<String> quotes = new ArrayList<>();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(socket.getOutputStream(), false);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        while (textInput.hasNextLine()) {
            String line = textInput.nextLine();
            quotes.add(line);

            if (line.equals("END")) {
                break;
            }
        }

        while(true) {
            Random rand = new Random();
            String randomQuote = quotes.get(rand.nextInt(quotes.size()));
            writer.write(randomQuote +"\n");

            writer.flush();

            textInput.close();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }

    }
}
