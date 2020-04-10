public class Phone implements Addressable{

    private final String phoneNumber;

    public Phone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getValue() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
