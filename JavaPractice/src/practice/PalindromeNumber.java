package practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121121;
		System.out.println(checkForPalindromeNumber(num));

	}

	private static boolean checkForPalindromeNumber(int num) {
		int number=num;
		int temp=0;
		while(number>0)
		{
			int reminder=number%10;
			number/=10;
			temp=temp*10 + reminder;
		}
		return temp==num;
		
	}

}
