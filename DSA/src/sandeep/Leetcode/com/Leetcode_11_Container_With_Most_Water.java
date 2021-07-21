package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_11_Container_With_Most_Water 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=mostWater(arr);
		System.out.println(res);
	}
	private static int mostWater(int[] arr)
	{
		int maxarea=0;
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			maxarea=Math.max(maxarea, Math.min(arr[left], arr[right])*arr[right-left]);
			if(arr[left]<arr[right])
			{
				left++;
			}
			else
			{
				right--;
			}	
		}
		return maxarea;
	}
}
/*
Enter Any Array Lenght ?  ?  
5
4
3
2
1
4
16
*/