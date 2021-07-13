package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_Missing_Number
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
		
		int res=missingNumber(arr);
		System.out.println(res);
	}

	private static int missingNumber(int[] arr)
	{
		int N=arr.length+1;
		int sum=N*(N+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
		}
		return sum;
	}
}
/*
Enter Any Array Length  ?   ?  
7
1
2
3
4
6
7
8
5
Enter Any Array Length  ?   ?  
7
2
4
1
8
6
3
7
5

*/