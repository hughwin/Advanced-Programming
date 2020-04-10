public class Address implements Addressable{

    private final String address;

    public Address(String address){
        this.address = address;
    }

    @Override
    public String getValue() {
        return address;
    }

    @Override
    public String toString() {
        return  address;
    }
}
