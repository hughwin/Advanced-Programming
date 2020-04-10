import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws BadKeywordException {

		String keyword = "RHINO";

		ArrayList<CipherInterface> ciphers = new ArrayList<>();
		ArrayList<Cipher> ciphersAbstract = new ArrayList<>();

		String message = "THIS IS A MESSAGE TO ENCODE";
		String output;
		
		Mono c = new Mono(keyword);
		Vignere d = new Vignere(keyword);
		
		ciphers.add(c);
		ciphers.add(d);

		ciphersAbstract.add(c);
		ciphersAbstract.add(d);


		
		for (CipherInterface x : ciphers) {
			output = "";

			output += x.encode(message);

			System.out.println(output);
		}



		for (Cipher y : ciphersAbstract){
			output = "";

			output += y.encode(message);

			System.out.println(output);
		}

		Person hugh = new Person("Hugh");
		Business amazon = new Business("Amazon");
		Phone hughPhone = new Phone("999");
		Address amazonAddress = new Address("Seattle, Washington, United States");

		Dictionary<Person, Addressable> phonebook = new Dictionary<>();
		phonebook.add(hugh, hughPhone);
		phonebook.add(amazon, amazonAddress);
		// Dictionary will probably run into trouble if identical keys entered, but
		// is fine for the purposes of this exercise.
		System.out.println(phonebook.toString());


}
}
