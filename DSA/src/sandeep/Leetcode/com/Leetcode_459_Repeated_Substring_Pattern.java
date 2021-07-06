package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_459_Repeated_Substring_Pattern
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?  ");
		String str=sc.next();
		boolean res=repeatingSubString(str);
		System.out.println(res);
	}
	private static boolean repeatingSubString(String str)
	{
		int len=str.length();
		for(int i=len/2;i>=1;i++)
		{
			if(len%i==0)
			{
				int times=len/i;
				String temp=str.substring(0, i);
				StringBuilder compare=new StringBuilder();
				for(int j=0;j<times;j++)
				{
					compare.append(temp);
				}
				if(compare.toString().equals(str))
					return true;	
			}
		}
		return false;
	}
}
	/*	int len=str.length();
		if(len==0)
			return false;
		char ch[]=str.toCharArray();
		boolean res[]=new boolean[str.length()+1];
		for(int i=0;i<ch.length;i++)
		{
			res[i]=true;
		}
		
		for(int j=1;j<res.length;)
		{
			if(res[j]==false)
			{
				j++;
			}
			else {
				return true;
			}
		}
		return false;
		*/
