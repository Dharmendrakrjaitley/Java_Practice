package java8;

import java.util.ArrayList;

@FunctionalInterface
 interface FunInterface{
	abstract void doSomething(int x);
	
	default void printSomething()
	{
		System.out.println("Hello World from default method");
	}
}

public class TestLambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunInterface funIn=(x)->System.out.println("The value of x is : "+x);
		funIn.doSomething(6);
		
		ArrayList<String> arrL=new ArrayList<String>();
		arrL.add("Hello");
		arrL.add("Hi");
		arrL.add("You");
		
		arrL.forEach((s)-> System.out.println(s));

	}

}
