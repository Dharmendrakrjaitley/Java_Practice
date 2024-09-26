package practice;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=23;
		System.out.println(checkForPrimeNumber(num));

	}

	private static boolean checkForPrimeNumber(int num) {
		if(num==1 || num==2)
			return true;
		for(int i=2;i<num/2+1;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
		
	}

}
