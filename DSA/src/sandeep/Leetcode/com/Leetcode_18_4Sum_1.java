package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Leetcode_18_4Sum_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght ?  ? ");
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Number Which You Want to compare with Quadraplets  ?   ");
		int compare=sc.nextInt();
		
		List<List<Integer>> res=fourSum(arr,compare);	
	}
	private static List<List<Integer>> fourSum(int[] arr, int target)
	{
		Arrays.sort(arr);
		return kSum(arr,target,0,4);
	}
	private static List<List<Integer>> kSum(int[] arr, int target, int start, int k)
	{
		List<List<Integer>> res=new ArrayList<>();
		if(start==arr.length || arr[start]*k>target || target >arr[arr.length]*k)
		{
			
			
		}
		
		
		return null;
	}

}





























