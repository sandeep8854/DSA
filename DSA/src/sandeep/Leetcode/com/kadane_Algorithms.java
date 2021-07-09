package sandeep.Leetcode.com;
import java.util.Scanner;
public class kadane_Algorithms 
{
	//The Maximum subArray problem is task of finding the largest possible sum of a contiguous subarray;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?    ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=kadaneAlgo(arr);
		System.out.println("Maximum Contiguous Array Sum Is : " +res);	
	}
	private static int kadaneAlgo(int[] arr)
	{
		int len=arr.length;
		if(len==0)
			return 0;
		int max=arr[0];
		for(int i=0;i<len;i++)
		{
			int sum=0;
			for(int j=i;j<len;j++)
			{
				sum+=arr[j];
				if(max<sum)
					max=sum;
			}
		}
		return max;
	}
}

/*
 Enter Any Array Length  ?    ?  
8
4
3
-2
6
-12
7
-1
6
Maximum Contiguous Array Sum Is : 12
Enter Any Array Length  ?    ?  
8
-2
-3
4
-1
-2
1
5
-3
Maximum Contiguous Array Sum Is : 7

*/
