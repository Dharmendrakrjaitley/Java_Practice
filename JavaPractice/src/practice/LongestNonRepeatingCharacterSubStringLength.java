package practice;

import java.util.HashSet;

/*Longest Substring Without Repeating Characters
Given a string 'S' of length 'L', return the length of the longest substring without repeating characters.
Example:

Suppose given input is "abacb", then the length of the longest substring without repeating characters will be 3 ("acb"). 
 */

import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeatingCharacterSubStringLength {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			//String str=sc.nextLine();
			String str="abcbd";
			int length=getLongestSubStringLength(str);
			System.out.println(length);
		}

	}

	private static int getLongestSubStringLength(String str) {
		int maxLength=0;
		int currentLength=0;
		int left=0;
		
		Set<Character> set=new HashSet<Character>();
		
		for(int right=0;right<str.length();right++)
		{
			char currentChar=str.charAt(right);
			if(set.contains(currentChar))
			{
				while(set.contains(currentChar)) {
					set.remove(str.charAt(left));
					left++;
				}
				maxLength=Math.min(maxLength, right-left+1);
			}
			else
			{
				set.add(currentChar);
				maxLength++;
				
			}
		}
		return maxLength;
	}

}
