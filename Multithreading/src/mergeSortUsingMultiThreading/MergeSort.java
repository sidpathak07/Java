package mergeSortUsingMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class MergeSort implements Callable<List<Integer>> {
	List<Integer> list;
	ExecutorService executorService;
	public MergeSort(List<Integer> list,ExecutorService es) {
		this.list = list;
		this.executorService = es;
	}
	
	public List<Integer> mergeArrays(List<Integer> left,List<Integer> right){
		List<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;

        // Compare elements and merge
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        // Copy remaining elements from left
        while (i < left.size()) {
            result.add(left.get(i++));
        }

        // Copy remaining elements from right
        while (j < right.size()) {
            result.add(right.get(j++));
        }
		return result;
		
	}
	@Override
	public List<Integer> call() throws Exception {
		// TODO Auto-generated method stub
		if(list.size()<=1) {
			return list;
		}
		
		int mid = list.size()/2;
		List<Integer> leftArrIntegers = new ArrayList<Integer>(list.subList(0, mid));
		List<Integer> rightArrIntegers = new ArrayList<Integer>(list.subList(mid, list.size()));
		Future<List<Integer>> leftFuture = executorService.submit(new MergeSort(leftArrIntegers, executorService));
		Future<List<Integer>> righFuture = executorService.submit(new MergeSort(rightArrIntegers, executorService));
		
		return mergeArrays(leftFuture.get(), righFuture.get());
	}

}
