import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws BadKeywordException {

		String keyword = "RHINO";

		ArrayList<CipherInterface> ciphers = new ArrayList<CipherInterface>();
		ArrayList<Cipher> ciphersAbstract = new ArrayList<Cipher>();

		String message = "THIS IS A MESSAGE TO ENCODE";
		String output = "";
		
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

}
}