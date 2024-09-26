package practice;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

	public static void main(String[] args) {
		int num=20;
		generateFibonacciSequence(num);

	}

	private static void generateFibonacciSequence(int num) {
		int first=0;
		int second=1;
		List<Integer> ls=new ArrayList<>();
		ls.add(first);
		ls.add(second);
		while(num>0)
		{
			int sum=first+second;
			ls.add(sum);
			first=second;
			second=sum;
			num--;
		}
		
		System.out.println(ls.toString());
		
	}

}
