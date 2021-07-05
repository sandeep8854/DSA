package sandeep.Leetcode.com;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_169_Majarity_Element 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=majarity(arr);
		System.out.println(res);
	}
	private static int majarity(int[] arr)
	{
		int n=arr.length/2;
		Arrays.sort(arr);
		return arr[n];
	}
}
/*
Enter Any Array Length  ?   ?  
7
2
2
1
1
1
2
2
2
*/

/*
Enter Any Array Length  ?   ?  
3
3
2
3
3
*/