package sandeep.Leetcode.com;
import java.util.Scanner;
public class Kadane_Algo 
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
			int res=kadaneAlgo_2(arr);
			System.out.println("Maximum Contiguous Array Sum Is : " +res);	
		}

		private static int kadaneAlgo_2(int[] arr)
		{
			int max=arr[0];
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				if(sum<0)
					sum=0;
				else if(max<sum)
					max=sum;
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
*/