package producerConsumerSemaphore;


import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
	Semaphore producerSemaphore;
	Semaphore consumerSemaphore;
	Store store;
	public Consumer(Semaphore pSemaphore,Semaphore cSemaphore,Store s) {
		this.producerSemaphore = pSemaphore;
		this.consumerSemaphore = cSemaphore;
		this.store = s;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				consumerSemaphore.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			store.removeItem();
			System.out.println("Total Items: "+store.getItems());
			producerSemaphore.release();
		}
	}
}
