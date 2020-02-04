
public class ThreadExtension extends Thread {
	
	public ThreadExtension() {
		
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.print("Hello ");
			Thread.sleep(1000);
			System.out.print("Hugh");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
