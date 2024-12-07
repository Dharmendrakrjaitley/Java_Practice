package practice;

// Find square root of a number
public class SquareRoot {

	public static void main(String[] args) {
		int n=35;
		int result=0;
		for(int i=2;i<n;i++)
		{
			if(i*i<=n)
			{
				result=i;
			}
		}
		
		System.out.println("The square root of "+ n + " is " + result);

	}

}
