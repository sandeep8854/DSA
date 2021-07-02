package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_283_MoveZeroes 
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
		moveZeros(arr);
		
	}
	private static void moveZeros(int[] arr)
	{
		int ind=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[ind]=arr[i];
			}
			ind++;
		}
		for (int i = ind; i < arr.length; i++)
		{
			arr[i] = 0;
		}	
	}
}
		
		
		
		
		
		/*
		int L=arr.length;
		int j=-1;
		int i=0;
		while(i<L)
		{
			if(arr[i]==0 && j==-1)
			{
				j=i;
				System.out.println(j + " ");
			}
			else if(arr[i]!=0 && j==-1)
			{
				arr[j]=arr[i];
				j=0;
			}
			i++;
		}
		
		/*
		 * int pos = 0;
    for (int i: nums) {
        if (i > 0 || i < 0) {
            nums[pos++] = i;
        }
    }
    while (pos < nums.length) {
        nums[pos++] = 0;
		}ss
		 */

















