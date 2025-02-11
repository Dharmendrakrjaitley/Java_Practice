package practice;

import java.util.*;


class ThreadClass implements Runnable
{
	public void run()
	{
		System.out.println("ThreadClass thread is running");
	}
}

public class BasicQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number:  ");
//		int num=sc.nextInt();
//		int sum=num+10;
//		
//		System.out.println("The entered number is : "+ num);
//		System.out.println("The Sum  is : "+ sum);
//		ThreadClass tc=new ThreadClass();
//		Thread t=new Thread(tc);
//		t.start();
		
		try {
			doSomething();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage() + e.getStackTrace());
		}
	}
	
	public static void doSomething()
	{
		int age=10;
		if(age<18)
		{
			throw new IllegalArgumentException("Age must be greater or equal to 18");
		}
		else
		{
			System.out.println("Age is "+ age);
		}
		
	}

}
