package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_453_Minimum_Moves_to_Equal_Array_Elements
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
		int res=minimumMove(arr);
		System.out.println(res);	
	}
	private static int minimumMove(int[] arr)
	{
		int len=arr.length;
		if(len==1)
			return 1;
		
		int j=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				return 0;
			if(arr[i]==arr[i+1]&&arr[i+2]==1)
				return 1;
			break;
		}
		
		return arr.length;
		//wrong
	}

}
