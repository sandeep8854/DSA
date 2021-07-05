package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Leetcode_448_Find_All_Numbers_Disappeared_in_an_Arrays
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Aarray Length  ?    ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		List<Integer> res=numberDisappeared(arr);
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i)+ " ");
		}
	}
	private static List<Integer> numberDisappeared(int[] arr) 
	{
		int len=arr.length;
		if(len==0)
		{
			return new ArrayList<>();
		}
		
		List<Integer> resultList=new ArrayList<>();
		boolean result[]=new boolean[arr.length+1];
		for(int number:arr)
		{
			result[number]=true;
		}
		 
		for(int i=1;i<result.length;i++)
		{
			if(!result[i])
			{
				resultList.add(i);
			}
		}
		return resultList;
	}
}

/*
 Enter Any Aarray Length  ?    ?  
8
4
3
2
7
8
2
3
1
5 6 
 */

