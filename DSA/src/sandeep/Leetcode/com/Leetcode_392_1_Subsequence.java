package sandeep.Leetcode.com;

import java.util.Scanner;

public class Leetcode_392_1_Subsequence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?    ?  ");
		String str=sc.next();
		String res[]=subseqence(str);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] + " ");
		}
	}
	private static String[] subseqence(String str)
	{
		int temp=0;
		int len=str.length();
		String arr[]=new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				arr[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		return arr;
	}
}
/*
Enter Any String  ?    ?  
ABC
A 
AB 
ABC 
B 
BC 
C 
*/
/*
Enter Any String  ?    ?  
ABCDE
A 
AB 
ABC 
ABCD 
ABCDE 
B 
BC 
BCD 
BCDE 
C 
CD 
CDE 
D 
DE 
E 
*/