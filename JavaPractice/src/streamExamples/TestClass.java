package streamExamples;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeOfArray=0;
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		sizeOfArray =sc.nextInt();
		int[] grades=new int[sizeOfArray];
		System.out.println("Enter all the grades");
		
		
		for(int i=0;i<sizeOfArray;i++)
		{
			int tempValue=sc.nextInt();
			if(tempValue>=0 && tempValue<=100)
			{
				grades[i]=tempValue;
			}
			
			
		}
		
		manipulateGrade(grades);
				

	}
	
	public static void manipulateGrade(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=38)
			{
				int nextMultipleOfFive=0;
				for(int j=1;j<=5;j++)
				{
					if((arr[i]+j)%5==0)
					{
						nextMultipleOfFive=arr[i]+j;
						break;
					}
				}
				
				if((nextMultipleOfFive - arr[i])<3)
					arr[i]=nextMultipleOfFive;
				
			}
			
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
