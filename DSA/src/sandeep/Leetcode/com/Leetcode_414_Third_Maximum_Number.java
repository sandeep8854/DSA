package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_414_Third_Maximum_Number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Array First Array  Length  ?   ?  ");
		int len1=sc.nextInt();
		int arr[]=new int[len1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=thirdMaximm(arr);
		System.out.println(res);
	}
	private static int thirdMaximm(int[] arr)
	{
		/*int n=arr.length;
		Arrays.sort(arr);
		if(n<=3)
			return arr[0];
		else
			return arr[1];
			*/
		int n=arr.length;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr.length<3)
				return arr[1];
			else if(arr.length>=3)
				return arr[2];
			else
			{
				if(arr[i]==arr[i+1])
					count++;
			}
			if(count==3)
				return arr[i+1];
		}
		return n-1;
		
	}
}
