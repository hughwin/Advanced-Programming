import javax.sound.midi.Soundbank;

public class RunnableClass implements Runnable{

    private static final int SLEEPTIME = 1000;
    private final String name;

    public RunnableClass(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(SLEEPTIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing a message after " + SLEEPTIME + " : " + name);
    }
}
