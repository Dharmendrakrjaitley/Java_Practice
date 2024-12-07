package com.interview.practise;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str=sc.nextLine();
		char[] charArr=str.toCharArray();
		int size=str.length()-1;
		int i=0;
		while(i<size)
		{
			char temp=charArr[i];
			charArr[i]=charArr[size];
			charArr[size]=temp;
			
			i++;
			size--;
		}
		str=new String(charArr);
		System.out.println("Reversed Word: " + str);
	}

}
