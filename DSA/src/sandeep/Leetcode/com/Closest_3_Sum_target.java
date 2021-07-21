package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Closest_3_Sum_target 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?     ?    ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Target Number With Whose which you can Find very Closest Number ?  ");
		int target=sc.nextInt();
		
		int closest=sum3Closet(arr,target);
		System.out.println("Closests Number Is :" +closest);
	}
	private static int sum3Closet(int[] arr, int target)
	{
		int closertNumber=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(Math.abs(target-closertNumber)>Math.abs(target-(arr[i]+arr[j]+arr[k])));
					closertNumber=arr[i]+arr[j]+arr[k];
				}
			}
		}
		
		
		
		return closertNumber;
	}

}
