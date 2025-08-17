package multiThreadListAddition;

import java.util.List;
import java.util.concurrent.Callable;

public class Adder implements Callable<Long>{
	List<Integer> list;
	int startIndex;
	int endIndex;
	public Adder(List<Integer> list,int startIndex,int endIndex) {
		this.list = list;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		Long sumLong = 0l;
		for(int i=startIndex;i<endIndex;i++) {
			sumLong+=list.get(i);
		}
		return sumLong;
	}

}
