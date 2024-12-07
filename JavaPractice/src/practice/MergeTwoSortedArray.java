package practice;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1=new int[]{1,4,7,9,10,17};
		int[] arr2=new int[] {2,5,7,9,14,19,25,31};
		
		int l1=arr1.length;
		int l2=arr2.length;
		
		int[] arr3=new int[l1+l2];
		
		int i = 0;
		int m=0;
		
		int x=0;
		while(i<l1 && m<l2)
		{
			if(arr1[i]<=arr2[m])
			{
				arr3[x]=arr1[i];
				i++;
			}
			else
			{
				arr3[x]=arr2[m];
				m++;
			}
			x++;
		}
		
		for(int j=i;j<l1;j++)
		{
			arr3[x++]=arr1[j];
		}
		for(int k=m;k<l2;k++)
		{
			arr3[x++]=arr2[k];
		}
		
		for (int element : arr3) {
			System.out.println(element);
		}

	}

}
