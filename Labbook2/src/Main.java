
public class Main {

	public static void main(String[] args) {
		
//		RunRunnable r = new RunRunnable();
//		Thread t = new Thread(r);
//		t.start();
		
		ThreadExtension[] threadExtensions = new ThreadExtension[2];
		for(int i = 0 ; i < 2 ; i++) {
			threadExtensions[i] = new ThreadExtension();
			threadExtensions[i].start();
		}

	}
	

}
