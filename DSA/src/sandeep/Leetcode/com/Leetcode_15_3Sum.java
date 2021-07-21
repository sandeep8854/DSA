package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Leetcode_15_3Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?    ?  ");
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Number Which You Want to compare with triplets  ?   ");
		int compare=sc.nextInt();
		List<List<Integer>>res=sumTree(arr,compare);
		if(res.isEmpty())
		{
			System.out.println("In Array Have No sum of Triplets.");
		}
		else {
			System.out.println(res.toString());
		}
	}
	private static List<List<Integer>> sumTree(int[] arr, int compare)
	{
		List<List<Integer>> triplets=new ArrayList<>();
		int L=arr.length;
		int temp=0;
	//	Arrays.sort(arr);
		for(int i=0;i<L-2;i++)
		{
			for(int j=i+1;j<L-1;j++)
			{
				for(int k=j+1;k<L;k++)
				{
					if(arr[i]+arr[j]+arr[k]==temp)
					{
						triplets.add(Arrays.asList(arr[i],arr[j],arr[k]));
					}
				}
			}
		}
		return triplets;
	}
}

/*
Enter Any Array Length  ?    ?  
6
-1
0
1
2
-1
-4
Enter Any Number Which You Want to compare with triplets  ?   
0
[[-1, 0, 1], [-1, 2, -1], [0, 1, -1]]
*/
/*
Enter Any Array Length  ?    ?  
5
1
2
2
3
4
Enter Any Number Which You Want to compare with triplets  ?   
0
In Array Have No sum of Triplets.
*/