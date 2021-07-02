package sandeep.Leetcode.com;

import java.util.Scanner;

public class Leetcode_349_Intersection_Of_Two_Arrays 
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
			if(res[ii]==0)
				continue;
			System.out.println(res[ii] + " ");
		}
	}

	private static int[] intersection(int[] arr1, int[] arr2)
	{
		
		int n1=arr1.length;
		int n2=arr2.length;
		int res[]=new int[n1];
		int k=0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					res[k++]=arr1[i];
					break;
				}
			}
		}
		return res;
	}
}
















