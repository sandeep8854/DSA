package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leetcode_1018_Binary_Prefix_Divisible_By_5
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
		List<Boolean> res=binaryPrefixDivisibleBYfive(arr);
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i)+ " ");
		}
	}
	private static List<Boolean> binaryPrefixDivisibleBYfive(int[] arr) 
	{
		int len=arr.length;
		List<Boolean> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			//ssString result
		}
		
		
		
		
		return null;
	}


}
