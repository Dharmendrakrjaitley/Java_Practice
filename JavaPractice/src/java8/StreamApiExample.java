package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> newLs=ls.stream()
				.filter(n->n%2==0)
				.map(n->n*6)
				.collect(Collectors.toList());
		
		System.out.println(newLs);
		
		// just to print the data
		ls.stream()
		.filter(n->n>5)
		.forEach(n->System.out.println(n));
	
	}

}
