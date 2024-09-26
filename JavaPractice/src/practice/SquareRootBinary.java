package practice;

//Find square root of a number with the binary approach

public class SquareRootBinary {

	public static void main(String[] args) {
		int num=18;
		int start=1;
		int end=num;
		int result=0;
		while(start<=end)
		{
			int mid=(start + end)/2;
			int square=mid*mid;
			if(square==num)
			{
				result=mid;
			}
			else if(square<=num)
			{
				start=mid+1;
				result=mid;
			}
			else
			{
				end=mid-1;
			}
		}
		
		System.out.println("The square root of "+ num + " is " + result);

	}

}
