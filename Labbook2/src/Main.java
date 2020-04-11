import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        final int NUMBEROFINSTANCES = 5;

        for (int i = 0; i < NUMBEROFINSTANCES; i++) {
            RunnableClass runnableClass = new RunnableClass("Thread: " + i);
            Thread runThread = new Thread(runnableClass);
            runThread.start();
            try {
                runThread.join();
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("All threads started!");

        int nRows = 100;
        int nCols = 50;
        Double[][] randArray = new Double[nRows][nCols];
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                randArray[r][c] = Math.random();
            }
        }

        double[] resultsArray = new double[100];

        for (int i = 0; i < nRows ; i++){
            new Thread(new findLargestRun(randArray[i], resultsArray, i)).start();
        }

        Arrays.stream(resultsArray).forEach(System.out::println);


        }
    }
