package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Callable returns a value
//Runnable doesn't return a value
public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newCachedThreadPool();
		Future<Void> futureTask = es.submit(new Producer());
		futureTask.get();
		
		Thread thread = new Thread(new ProducerRunnable());
		thread.start();
	}

}
