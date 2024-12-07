package practice;

import java.util.Scanner;

public class CaptaliseFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		
		sc.close();
		String result=doCapital(str);
		System.out.println(result);
		

	}
	public static String doCapital(String str)
	{
		String result="";
		String[] strArray=str.split(" ");
		//for(String s:strArray)
		
		for(int i=0;i<strArray.length;i++)
		{
			if(strArray[i].equals("and") || strArray[i].equals("for") || strArray[i].equals("of"))
				continue;
			else
			{
				char firstChar=strArray[i].charAt(0);
				firstChar=Character.toUpperCase(firstChar);
				String temp=Character.toString(firstChar);
				result=result.concat(temp);
			}
			
		}
		return result;
	}

}
