package producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

	Semaphore producerSemaphore;
	Semaphore consumerSemaphore;
	Store store;
	public Producer(Semaphore pSemaphore,Semaphore cSemaphore,Store s) {
		this.producerSemaphore = pSemaphore;
		this.consumerSemaphore = cSemaphore;
		this.store = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				producerSemaphore.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			store.addItem();
			System.out.println("Total Items: "+store.getItems());
			consumerSemaphore.release();
		}
	}

}
