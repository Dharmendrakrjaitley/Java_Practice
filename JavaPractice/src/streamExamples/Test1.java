package streamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// to get min and max
		Optional<Integer> max=list.stream()
					.max(Comparator.naturalOrder());
		Optional<Integer> min=list.stream().min(Comparator.naturalOrder());
		
		max.ifPresent(m -> System.out.println("Max number of the list: "+ m));
		min.ifPresent(n -> System.out.println("Min number of the list: "+ n));
		
		
		// to get average of the numbers
		OptionalDouble average=list.stream().mapToInt(Integer::intValue).average();
		average.ifPresent(m -> System.out.println("Average of the numbers: "+ m));
		
		//Given a list of strings, create a map where the key is the string and the value is the length of the string.
		
		List<String> stringList=Arrays.asList("Dharmendra", "Rahul", "Mahesh", "Suresh", "Manish", "Sunny");
		
		Map<Object, Integer> map=stringList.stream().collect(Collectors.toMap(s->s, String::length));
		map.forEach((key,value)->System.out.println(key +" " + value));
		
		//Given a list of integers, check if all elements are positive.
		
		boolean allPositive=list.stream().allMatch(n-> n>0);
		
		System.out.println(allPositive);
	}

}
