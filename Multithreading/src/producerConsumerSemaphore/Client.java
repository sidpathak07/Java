package producerConsumerSemaphore;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Store store = new Store();
		Semaphore producerSemaphore = new Semaphore(5);
		Semaphore consumerSemaphore = new Semaphore(0);
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i=1;i<=8;i++) {
			es.execute(new Producer(producerSemaphore, consumerSemaphore, store));
		}
		for(int i=1;i<=8;i++) {	
			es.execute(new Consumer(producerSemaphore, consumerSemaphore, store));
		}
	}

}
