package test;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable runnable = ()->{
			System.out.println("Runnable");
		};
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable");
			}
		});
		thread.sleep(10000);
		thread.wait();
		thread.notify();
		thread.start();
		
	}

}
