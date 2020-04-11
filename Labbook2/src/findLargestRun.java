
public class findLargestRun implements Runnable{

    private final int resultIndex;
    private final double[] resultArray;
    private final Double[] array;

    public findLargestRun(Double[] array, double[] resultArray, int resultIndex){
        this.array = array;
        this.resultArray = resultArray;
        this.resultIndex = resultIndex;
    }

    @Override
    public void run() {
        double highest = 0;
        for(Double d : array){
            if (d > highest){
                highest = d;
            }
        }
        resultArray[resultIndex] = highest;
    }
}
