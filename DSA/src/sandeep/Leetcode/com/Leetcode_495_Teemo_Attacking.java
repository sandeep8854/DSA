package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_495_Teemo_Attacking
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?   ? ");
		int len=sc.nextInt();
		System.out.println("Enter Time Series   ?    ? ");
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Time Duration  ?    ? ");
		int duration=sc.nextInt();
		int count=teemo(arr,duration);
		System.out.println(count);
	}
	private static int teemo(int[] arr, int duration) 
	{
		int len=arr.length;
		int count=0;
		if(len==0)
			return 0;
		for(int i=0;i<len-1;i++)
		{
			count=count+Math.min(arr[i+1]-arr[i], duration);
		}
		return count+duration;
	}
}
/*
Enter Any Array Length  ?   ? 
2
Enter Time Series   ?    ? 
1
2
Enter Time Duration  ?    ? 
2
3
Enter Any Array Length  ?   ? 
2
Enter Time Series   ?    ? 
1
4
Enter Time Duration  ?    ? 
2
4

*/