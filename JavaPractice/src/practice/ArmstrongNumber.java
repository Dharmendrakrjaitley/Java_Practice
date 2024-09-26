package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		System.out.println(checkForArmStrongNumber(num));

	}

	private static boolean checkForArmStrongNumber(int num) {
		int number=num;
		int result=0;
		while(number>0)
		{
			int reminder=number%10;
			result+=reminder*reminder*reminder;
			number/=10;
		}
		return num==result;

	}

}
