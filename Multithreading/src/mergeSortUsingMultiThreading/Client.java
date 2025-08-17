package mergeSortUsingMultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5,9,2,17,1,3));
		Future<List<Integer>> future = executorService.submit(new MergeSort(list, executorService));
		System.out.println(future.get());
	}

}
