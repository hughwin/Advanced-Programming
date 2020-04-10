import java.util.ArrayList;

public class Dictionary<E,T> {

    private ArrayList<E> keyArray;
    private ArrayList<T> valueArray;

    public Dictionary(){
        this.keyArray = new ArrayList<>();
        this.valueArray = new ArrayList<>();
    }

    public void add(E key, T value){
        keyArray.add(key);
        valueArray.add(value);
    }

    public void remove(E key, T value){
        keyArray.remove(key);
        valueArray.remove(value);
    }

    public T get(E key){
        return valueArray.get(keyArray.indexOf(key));
    }

    @Override
    public String toString() {
        String toBeReturned = "";
        for (E key : keyArray){
            toBeReturned += key.toString() + " : " + this.get(key).toString() + "\n";
        }
        return toBeReturned;
    }
}
