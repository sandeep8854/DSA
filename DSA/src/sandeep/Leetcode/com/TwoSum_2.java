package sandeep.Leetcode.com;
import java.util.Scanner;
public class TwoSum_2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght ?  ? ");
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Target Value  ?   ");
		int target=sc.nextInt();
		
		int res[]=twoSUm(arr,target);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] twoSUm(int[] arr, int target)
	{
		int len=arr.length;
		int lo=0;
		int hi=arr.length-1;
		int result[]=new int[2];
		while(lo<hi)
		{
			if(arr[lo]+arr[hi]==target)
			{
				result[0]=lo+1;
				result[1]=hi+1;
				break;
				
			}
			else if(arr[lo]+arr[hi]>target)
			{
				hi--;
			}
			
			else
			{
				lo++;
				
			}
		}
		return result;
	}
}
