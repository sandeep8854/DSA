package sandeep.Leetcode.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Leetcode_349_1_Intersection_Of_Two_Arrays2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Array First Array  Length  ?   ?  ");
		int len1=sc.nextInt();
		int arr1[]=new int[len1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter  Array Second Array Length  ?   ?  ");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextInt();
		}
		int res[]=intersection(arr1,arr2);
		for(int ii=0;ii<res.length;ii++)
		{
			System.out.print(res[ii] + " ");
		}
		
	}

	private static int[] intersection(int[] arr1, int[] arr2)
	{
		Set<Integer> set=new HashSet<>();
		for(int i:arr1)
		{
			set.add(i);
		}
		
		List<Integer> result=new ArrayList<>();
		for(int i:arr2)
		{
			if(set.contains(i))
			{
				result.add(i);
			//	set.remove(i);
			}
		}
		
		int res[]=new int[result.size()];
		for(int i=0;i<result.size();i++)
		{
			res[i]=result.get(i);
		}
		return res;
	}
}
/*
Enter  Array First Array  Length  ?   ?  
3
4
9
5
Enter  Array Second Array Length  ?   ?  
5
9
4
9
8
4
9 4 
*/





















