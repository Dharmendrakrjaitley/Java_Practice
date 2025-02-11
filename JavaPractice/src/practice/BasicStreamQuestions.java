package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamQuestions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> temp=ls.stream().filter(t->t>5).collect(Collectors.toList());
		System.out.println(temp);
	}
}
