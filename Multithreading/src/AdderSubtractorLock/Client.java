package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		Lock lock = new ReentrantLock();
		Value v = new Value();
		Adder adder = new Adder(v,lock);
		Subtractor subtractor = new Subtractor(v,lock);
		Future<Void> addFuture = executorService.submit(adder);
		Future<Void> subFuture = executorService.submit(subtractor);
		addFuture.get();
		subFuture.get();
		System.out.println(v.x);
	}

}
