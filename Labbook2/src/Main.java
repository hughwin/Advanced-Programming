public class Main {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread runThread = new Thread(runnableClass);
        runThread.start();

        ExtendedThreadClass extendedThreadClass = new ExtendedThreadClass();
        Thread extendedThreadRun = new Thread(extendedThreadClass);
        extendedThreadRun.start();



    }
}
