package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoSum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Target Number  ?    ?  ");
		int target=sc.nextInt();
		int res[]=twoSumNum(arr,target);
		Arrays.sort(res);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+ " ");
		}	
	}
	private static int[] twoSumNum(int[] arr, int target)
	{
		int L=arr.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(target-arr[i]))
			{
				return new int[] {i,map.get(target-arr[i])};
			}
			map.put(arr[i], i);
		}
		return new int[0];
	}
}
/*
 Hashmaps work on hashing principle.

When you call put(key, value), the hashcode() method of the provided key is called
 and accordingly a bucket is reserved in the memory for this hashcode holding the passed value.
If you called again put(key,value) with the same key, then the same hashcode will be generated
 and hence the hashing function of the map will access the same bucket and update it with the new value object.
So that's why, you should be careful when calling put(key, value) inside a loop in order to prevent this confusion.

This is because of the hashmap implementation, hashmap will rewrite/update old value for a given
 key if it is present in the map, if not present will just insert it

you hashmap had this element

doing this

map.put(0, 55);
map.put(0, 88);
will update the value for the key 0 so if you try to get the value for 0 the hashmap implementation will return 88
 */


















