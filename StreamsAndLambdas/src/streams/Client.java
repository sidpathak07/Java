package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4,2,9,1,3,2,1,4,8,2,3));
		
		//get distinct elements of list
		list.stream().distinct().forEach(elem->{
			System.out.println("Element: "+ elem);
		});
		
		//get a list of distinct elements
		List<Integer> list2 = list.stream()
								.distinct()
								.limit(3)
								.collect(Collectors.toList());
		System.out.println(list2);
		
		Optional<Integer> xOptional = list.stream()
				.distinct().findFirst();
		if(xOptional.isPresent()) {
			System.out.println(xOptional.get());
		}
		
		//filters out numbers if they are even
		list2 = list.stream().filter((elem)->{
			return elem%2==0;
		}).collect(Collectors.toList());
		System.out.println(list2);
		
		//multiplies each number by 2
		list2 = list.stream().map(elem->elem*2).collect(Collectors.toList());
		System.out.println(list2);
		
		//accumulates each number. Where 0 is start of accumulator i.e current and element is passed 
		Integer sumInteger = list.stream().reduce(10, (current,elem)->{
			return current+elem;
		});
		System.out.println(sumInteger);
		
		//we can use multiple functions like filter, map and limit in single use which runs parallel
		//and optimizes the result
	}

}
