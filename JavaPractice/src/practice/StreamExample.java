package practice;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
		int sum=numbers.stream()
				.filter(x->x%2==0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sum);
		

	}

}
