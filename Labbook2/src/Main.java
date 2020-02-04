
public class Main {

	public static void main(String[] args) {
		
		RunRunnable r = new RunRunnable();
		Thread t = new Thread(r);
		t.start();

	}

}
