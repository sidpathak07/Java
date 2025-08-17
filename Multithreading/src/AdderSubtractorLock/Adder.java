package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
	Value v;
	Lock lock;
	public Adder(Value v,Lock lock) {
		this.v = v;
		this.lock = lock;
	}

	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		//This is using a ReentrantLock. We can also implement without ReentrantLock.
		/*for(int i=1;i<=100;i++) {
			lock.lock();
			v.x+=i;
			lock.unlock();
		}*/
		//each object has its own ReentrantLock which can be used using synchronized.
		for(int i=1;i<=100;i++) {
			synchronized (v) {
				v.x+=i;
			}
		}
		return null;
	}

}
