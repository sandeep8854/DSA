package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_162_Find_Peak_Element
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter Any Array Length ?  ?  ");
		int len =sc.nextInt();
		int arr[] =new int [len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res = findPeekEle(arr);
		System.out.println(res);
	}
	private static int findPeekEle(int[] arr)
	{
		 int left= 0;
		 int right = arr.length - 1;
	        while (left < right) 
	        {
	            int mid = (left + right) / 2;
	            if (arr[mid] > arr[mid + 1])
	                right = mid;
	            else
	                left = mid + 1;
	        }
	        return left;			
	}
}
/*
 
  public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }
    Enter Any Array Length ?  ?  
4
1
2
3
1
2
Enter Any Array Length ?  ?  
7
1
2
1
3
5
6
4
5

*/