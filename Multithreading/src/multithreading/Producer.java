package multithreading;

import java.util.concurrent.Callable;

public class Producer implements Callable<Void>{

	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is from Producer in new thread");
		return null;
	}

}
