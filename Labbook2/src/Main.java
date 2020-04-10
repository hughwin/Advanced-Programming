public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int NUMBEROFINSTANCES = 5;

        for (int i = 0 ; i < NUMBEROFINSTANCES; i++){
            RunnableClass runnableClass = new RunnableClass("Thread: " + i);
            Thread runThread = new Thread(runnableClass);
            runThread.start();
            runThread.join();
        }
        System.out.println("All threads started!");



    }
}
