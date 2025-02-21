package practice;

import javax.naming.directory.InvalidAttributesException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//doSomething();
			doSomethingElese();
		} 
		
		catch (ArrayIndexOutOfBoundsException | InvalidAttributesException e) {
			// TODO: handle exception
			
			System.out.println("Exception occured" + e.getMessage());
		}
		finally
		{
			System.out.println("kfdjfdf");
		}
		
	}
	
	public static void doSomething()
	{
		int[] arr=new int[2];
		arr[4]=6;
	}
	
	public static void doSomethingElese() throws InvalidAttributesException
	{
		int age=8;
		if(age<18)
			throw new InvalidAttributesException(" Age must be equal or greater than 18");
		else
		{
			System.out.println("It's good to go");
		}
	}
	
	
	public static void doSomeElese() 
	{
		int age=8;
		if(age<18)
			throw new ArithmeticException(" Age must be equal or greater than 18");
		else
		{
			System.out.println("It's good to go");
		}
	}

}
