package sandeep.Leetcode.com;
import java.util.Scanner;
public class PrintFibonacciIndex 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int res[]=
		fiboIndex(arr);
	/*	for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}	
		*/	
	}
	private static void fiboIndex(int[] arr)
	{
		
		int fibZero=0;
		int fibOne=1;
		
		for(int i=0;i<1;i++)
		{
			fibZero=arr[i];
			System.out.print(fibZero +" ");
			break;
		}
		for(int i=1;i<=1;i++)
		{
			fibOne=arr[i];
			System.out.print(fibOne);
			break;
		}
		for(int i=1;i<arr.length;i++)
		{
			int fibTotal=fibZero+fibOne;
			fibTotal=arr[i];
			System.out.print(" "+ fibTotal);
			fibZero=fibOne;
			fibOne=fibTotal;
		}
	}
}
