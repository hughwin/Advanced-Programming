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
        while (true) {
            ServerSocket listener = null;
            Socket client = null;

            try {
                listener = new ServerSocket(PORT);
                try {
                    new ClientHandler(listener.accept()).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Client has arrived");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}