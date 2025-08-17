package multiThreadListAddition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		int numberOfProcessors = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<Long>> furtures = new ArrayList<Future<Long>>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		int chunkSize = list.size()/numberOfProcessors;
		int remainder = list.size()%numberOfProcessors;
		int start = 0;
        for (int i = 0; i < numberOfProcessors; i++) {
            int end = start + chunkSize + (i < remainder ? 1 : 0); // distribute remainder evenly
            if (start >= list.size()) break; // stop if no more elements
            furtures.add(executorService.submit(new Adder(list, start, end)));
            start = end;
        }
		Long sumLong = 0l;
		for(Future<Long> fut:furtures) {
			sumLong+=fut.get();
		}
		System.out.println(sumLong);
	}

}
