package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_389_Find_the_Difference
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?   ?  ");
		String str=sc.next();
		System.out.println("Enter Any Target String   ?    ?  ");
		String target=sc.next();
		char res=findTheDifference(str,target);
		System.out.println(res);
	}

	private static char findTheDifference(String str, String target) 
	{
		int result=0;
		int arr[]=new int[26];
		for(char ch:str.toCharArray())
		{
			arr[ch-'a']++;
		}
		for(char ch:target.toCharArray())
		{
			arr[ch-'a']++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				result='a'+i;
			}
		}
		return (char)result;
	}
}
/*
Enter Any String  ?   ?  
abcd
Enter Any Target String   ?    ?  
abcde
e
*/
