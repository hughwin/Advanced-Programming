
public class RunRunnable implements Runnable{
	
	public RunRunnable() {
		
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.print("Hello");
			Thread.sleep(1000);
			System.out.print(" Hugh");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
