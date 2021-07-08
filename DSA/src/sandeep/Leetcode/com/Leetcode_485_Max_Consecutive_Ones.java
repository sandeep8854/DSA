package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_485_Max_Consecutive_Ones
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
		
		int result=maxConsecutiveOne(arr);
		System.out.println(result);
	}
	private static int maxConsecutiveOne(int[] arr)
	{
		int n=arr.length;
		int count=0;
		int result=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
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
6
1
0
1
1
0
1
2
Enter Any Array Length   ?   ? 
6
1
1
0
1
1
1
3

*/