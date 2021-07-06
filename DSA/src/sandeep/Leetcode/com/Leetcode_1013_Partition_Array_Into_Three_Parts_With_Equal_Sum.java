package sandeep.Leetcode.com;
import java.util.List;
import java.util.Scanner;
public class Leetcode_1013_Partition_Array_Into_Three_Parts_With_Equal_Sum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Aarray Length  ?    ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean res=partitionArrayIntoThreePart(arr);
		System.out.println(res);	
	}
	private static boolean partitionArrayIntoThreePart(int[] arr)
	{
		int sum=0;
		int len=arr.length;
		if(len<3)
			return false;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		if(sum%3!=0)
			return false;
		 int one_third = sum/3;
	        int count = 0;
	        int current_sum = 0;
	        for(int i=0;i<arr.length;i++)
	        {
	            current_sum += arr[i];
	            if(current_sum == one_third)
	            {
	                if(count == 2)
	                    return true;
	                count++;
	                current_sum = 0;
	            }
	        }
	        return false;
	}
}
