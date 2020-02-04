
public class RunRunnable implements Runnable{
	
	private String name;

	public RunRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(name);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
