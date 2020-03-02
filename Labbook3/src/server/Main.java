package server;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new Server());
        t.start();
        Client c = new Client();
    }
}
