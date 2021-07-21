package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght  ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		largest(arr);
	}
	private static void largest(int[] arr)
	{
		int len=arr.length;
		Arrays.sort(arr);
		System.out.println("Second Largest Element " + (arr[len-2]));
		System.out.println("Second Minimum Element " + (arr[1]));	
	}
}
