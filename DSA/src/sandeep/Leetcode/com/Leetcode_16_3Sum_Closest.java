package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_16_3Sum_Closest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?    ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target Value  ?    ?  ");
		int target=sc.nextInt();
		
		int res=closet(arr,target);
		System.out.println(res);
	}
	private static int closet(int[] arr, int target)
	{
		int L=arr.length;
		int diff=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<L && diff!=0;i++)
		{
			int lower=i+1;
			int high=L-1;
			
			while(lower<high)
			{
				int sum=arr[i]+arr[lower]+arr[high];
				if(Math.abs(target-sum)<Math.abs(diff))
					diff=target-sum;
				if(sum<target)
					lower++;
				else
					high--;
			}
		}
		return target-diff;
	}
}

/*
Enter Any Array Length  ?    ?   
4
-1
2
1
-4
Enter target Value  ?    ?  
1
2
Enter Any Array Length  ?    ?   
5
1
2
3
4
-5
Enter target Value  ?    ?  
10
9

*/
