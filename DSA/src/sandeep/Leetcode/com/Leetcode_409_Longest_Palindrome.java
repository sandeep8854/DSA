package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_409_Longest_Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?   ?  ");
		String str=sc.next();
		int res=longestPolindrome(str);
		System.out.println(res);	
	}
	private static int longestPolindrome(String str) 
	{
		int len=str.length();
		int count[]=new int[128];
		for(char ch:str.toCharArray())
		{
			count[ch]++;
		}
		int answer=0;
		for(int value:count)
		{
			answer=answer+value/2*2;
			if(answer%2==0&& value%2==1)
				answer++;
		}
		return answer;
	}
}
/*
Algorithms=:
For each letter, say it occurs v times. We know we have v // 2 * 2 letters that
 can be partnered for sure. For example, if we have 'aaaaa', then 
 we could have 'aaaa' partnered, which is 5 // 2 * 2 = 4 letters partnered.

At the end, if there was any v % 2 == 1, then that letter could have been a unique center.
 Otherwise, every letter was partnered. To perform this check, we will check for v % 2 == 1 and ans % 2 == 0,
  the latter meaning we haven't yet added a unique center to the answer.
*/
