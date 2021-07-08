package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_MaxConsecutive_Zeros
{
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
		int result=maxConsecutiveZeros(arr);
		System.out.println(result);
	}

	private static int maxConsecutiveZeros(int[] arr)
	{
		int n=arr.length;
		int count=0;
		int result=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1)
				count=0;
			else
			{
				count++;
				result=Math.max(result, count);
			}
		}
		
		return result;
	}
}

/*
Enter Any Array Length  ?    ?  
5
0
0
0
0
0
5
*/