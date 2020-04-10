public class ExtendedThreadClass extends Thread {

    private static final int SLEEPTIME = 1000;

    public ExtendedThreadClass() {

    }

    public void run() {
        try {
            Thread.sleep(SLEEPTIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing a message after " + SLEEPTIME);
    }
}

