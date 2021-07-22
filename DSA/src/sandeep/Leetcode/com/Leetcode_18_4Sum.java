package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Leetcode_18_4Sum
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
		
		HashSet<List<Integer>> res=fourSum(arr,compare);
		if(res.isEmpty())
		{
			System.out.println("In Array Have No Sum Of Quadruplets. ");
		}
		else
		{
			for(List<Integer> uniqu:res)
			{
				System.out.print(uniqu);
			}
		}
	}
	private static HashSet<List<Integer>> fourSum(int[] arr, int compare)
	{
		List<List<Integer>> quadruplets=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-3;i++)
		{
			for(int j=i+1;j<arr.length-2;j++)
			{
				for(int k=j+1;k<arr.length-1;k++)
				{
					for(int l=k+1;l<arr.length;l++)
					{
						if(arr[i]+arr[j]+arr[k]+arr[l]==compare)
						{
							quadruplets.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
							
						}
							
					}
				}
			}
		}
		HashSet<List<Integer>> hs=new HashSet<>(quadruplets);
		return hs;	
	}
}

/*
 Enter Any Array Length  ?    ?  
5
2
2
2
2
2
Enter Any Number Which You Want to compare with triplets  ?   
8
[2, 2, 2, 2]
Enter Any Array Length  ?    ?  
6
1
0
-1
0
-2
2
Enter Any Number Which You Want to compare with triplets  ?   
0
[-2, 0, 0, 2][-2, -1, 1, 2][-1, 0, 0, 1]
*/

