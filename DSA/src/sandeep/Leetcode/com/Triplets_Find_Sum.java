package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Triplets_Find_Sum 
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
		System.out.println(" Enter Any Any Number Which You Want to compare With Triplets ?   ?   ");
		int sum=sc.nextInt();
		List<Integer> result=tripletsSum(arr,sum);	
		if(result.isEmpty())
		{
			System.out.println("In Array Have No Sum of Triplet..");
		}
		else {
			for(int i=0;i<result.size();i++)
			{
					System.out.print(result.get(i)+ " ");
				}	
			}
		}
	private static List<Integer> tripletsSum(int[] arr,int sum)
	{ 
		List<Integer> list=new ArrayList<>();
		int N=arr.length;
		for(int i=0;i<N-2;i++)
		{
			for(int j=i+1;j<N-1;j++)
			{
				for(int k=j+1;k<N;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
					}
				}
			}
		}
		
		return list;
	}
}

/*
Enter Any Array Length ?  ? 
6
2
2
2
2
2
2
 Enter Any Any Number Which You Want to compare With Triplets ?   ?   
24
In Array Have No Sum of Triplet..
Enter Any Array Length ?  ? 
5
0
-1
2
-3
1
 Enter Any Any Number Which You Want to compare With Triplets ?   ?   
-2
0 -3 1 -1 2 -3 
*/