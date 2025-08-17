package lambdas;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We have seen we need to implement Runnable with a class to overrride run(), but we can use anonymous class and lambda function
		//to do this if we just want that function to be invoked once.
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable without implementation");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		Runnable runnable2 = ()->{
			System.out.println("Runnable 2");
		};
		
		TestInterface testInterface = (x)->{
			System.out.println("X: "+x);
		};
		
		testInterface.test(10);
		
		//only one line syntax. No need to use brackets.
		TestInterface testInterface1 = (x)->System.out.println("One liner X: "+x);
		testInterface1.test(19);
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}

}
