import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class RandoArray implements Iterable{

    private final double[] array;

    public RandoArray(int length){
        this.array = new double[length];
        Random random = new Random();
        for(int i = 0 ; i < length; i++){
            array[i] = random.nextDouble() - 0.5;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = -1;
            @Override
            public boolean hasNext() {
                return (index + 1 < array.length);
            }

            @Override
            public Object next() {
                index+= 1;
                return array[index];
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

}
