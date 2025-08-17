package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
	Value v;
	Lock lock;
	public Subtractor(Value v,Lock lock) {
		this.v = v;
		this.lock = lock;
	}

	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=100;i++) {
			lock.lock();
			v.x-=i;
			lock.unlock();
		}*/
		for(int i=1;i<=100;i++) {
			synchronized (v) {
				v.x-=i;
			}
		}
		return null;
	}
}
