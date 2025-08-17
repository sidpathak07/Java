package producerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
	ConcurrentLinkedDeque<Integer> list;
	public Store() {
		list = new ConcurrentLinkedDeque<Integer>();
	}
	
	public void addItem() {
		list.add(list.size()+1);
		
	}
	
	public void removeItem() {
		list.removeLast();
	}
	
	public int getItems() {
		return list.size();
	}

}
