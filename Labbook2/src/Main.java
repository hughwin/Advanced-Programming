
public class Main {

	public static void main(String[] args) {
//		Thread t = new Thread();
//		for (int i = 0; i < 10; i++) {
//			RunRunnable r = new RunRunnable(" Thread " + i);
//			t = new Thread(r);
//			t.start();
//		}
//		try {
//			t.join();
//			System.out.println("Threads finished");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		ThreadExtension[] threadExtensions = new ThreadExtension[2];
//		for (int i = 0; i < 2; i++) {
//			threadExtensions[i] = new ThreadExtension();
//			threadExtensions[i].start();
//		}
//
		
		RandArray a = new RandArray(100,100);
		System.out.println(a.findLargest());
		
		
	}

}
