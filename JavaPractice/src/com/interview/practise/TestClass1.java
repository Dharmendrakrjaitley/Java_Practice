package com.interview.practise;
import java.util.Scanner;




public class TestClass1 {

	public enum Manipulation{
		ADD, MULTIPLY, SQUARE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=0;
		System.out.println("Enter size of the array");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter all number to the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		displayArrayElement(size, arr);
		System.out.println();
		System.out.println("Enter what operation want to do?   Type ADD, MULTIPLY or SQUARE");
		String str=sc.next().toUpperCase();
		System.out.println("Your entered choice is: "+ str);
		int result=0;
		Manipulation choice=Manipulation.valueOf(str);
		switch(choice)
		{
		case ADD:
			result=addNumbers(arr);
			System.out.println(result);
			break;
		case MULTIPLY:
			result=multiplyNumbers(arr);
			System.out.println(result);
			break;
			
		case SQUARE:
			int newArray[]=new int[arr.length];
			newArray=squareElement(arr);
			displayArrayElement(arr.length, newArray);
				
			
			
		}
		
		

	}

	private static int[] squareElement(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int) Math.pow(arr[i],2);
		}
		return arr;
	}

	private static int multiplyNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int multiplyResult=1;
		for(int i=0;i<arr.length;i++)
		{
			multiplyResult*=arr[i];
		}
		return multiplyResult;
	}

	private static void displayArrayElement(int size, int[] arr) {
		System.out.println("All elements of the array");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	private static int addNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int sumResult=0;
		for(int i=0;i<arr.length;i++)
		{
			sumResult+=arr[i];
		}
		return sumResult;
	}

}
