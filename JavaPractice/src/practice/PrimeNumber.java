package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		boolean prime=isPrimeNumber(num);
		//System.out.println("Number is: " + num);
		if(prime)
		{
			System.out.println(num + " is a Prime number");
		}
		else
		{
			System.out.println(num + " is not a Prime number");
		}

	}
	
	public static boolean isPrimeNumber(int n)
	{
		int i=2;
		while (i<=n/2+1)
		{
			if(n%i==0)
				return false;
			else
			{
				i++;
			}
		}
		return true;
	}

}
