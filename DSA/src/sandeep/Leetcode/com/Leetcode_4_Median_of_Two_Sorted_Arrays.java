package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_4_Median_of_Two_Sorted_Arrays 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter First Array Length ?  ?  ");
		int len =sc.nextInt();
		int arr1[] =new int [len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println ("Enter Second Array Length ?  ?  ");
		int len2 =sc.nextInt();
		int arr[] =new int [len2];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		double res=medianOfTwoSorted(arr1,arr);
		System.out.println(res+"000");
	}
	private static double medianOfTwoSorted(int[] a, int[] b)
	{
		int arr3[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			arr3[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			arr3[a.length+i]=b[i];
		}
		Arrays.sort(arr3);
		int N=arr3.length;
		if(N%2==0)
		{
			int Half=N/2;
			int resHalf=arr3[Half];
			int resAndHalf=arr3[Half-1];
			double answer=(resHalf+resAndHalf)/2;
			return answer;
		}
		else
		{
			double result=Math.round(N/2);
			return result;
		}
	}	
}

/*
 Enter First Array Length ?  ?  
2
1
3
Enter Second Array Length ?  ?  
1
2
1.0
*/				
	/*
	 Enter First Array Length ?  ?  
5
-5
3
6
12
15
Enter Second Array Length ?  ?  
6
-12
-10
-6
-3
4
10
5	
	 */
		
