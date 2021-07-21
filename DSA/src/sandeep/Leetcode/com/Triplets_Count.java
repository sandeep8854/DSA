package sandeep.Leetcode.com;
import java.util.Scanner;
public class Triplets_Count 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=tripletsCount(arr);	
		System.out.println(result);
	}
	private static int tripletsCount(int[] arr)
	{
		int N=arr.length;
		int count=0;
		for(int i=0;i<N-2;i++)
		{
			for(int j=i+1;j<N-1;j++)
			{
				for(int k=j+1;k<N;k++)
				{
					if(arr[i]+arr[j]==arr[k] || arr[j]+arr[k]==arr[i] ||arr[k]+arr[i]==arr[j])
						count++;
				}
			}
		}
		return count;
	}
}


/*
Enter Any Array Length ?  ? 
5
1
2
2
3
4
4
*/