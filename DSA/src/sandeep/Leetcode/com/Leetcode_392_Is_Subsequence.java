package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_392_Is_Subsequence
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any Test Cases  ?   ?  ");
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
		System.out.println("Enter First String  ?   ?  ");
		String str=sc.next();
		System.out.println("Enter Second  String   ?    ?  ");
		String target=sc.next();
		boolean res=isSubsequence(str,target);
		System.out.println(res);
	    }
	}
	private static boolean isSubsequence(String str1, String str2) 
	{
		int m=str1.length();
		int n=str2.length();
		int j=0;
		if(str1==null||str2==null)
			return false;
		for(int i=0;i<n&&j<m;i++)
		{
			if(str1.charAt(j)==str2.charAt(i))
				j++;
		}
		if(j==m)
			return true;
		return false;
	}
}

/*
Enter Any Test Cases  ?   ?  
5
Enter First String  ?   ?  
""
Enter Second  String   ?    ?  
abc
false
Enter First String  ?   ?  
abc
Enter Second  String   ?    ?  
""
false
Enter First String  ?   ?  
abc
Enter Second  String   ?    ?  
abcde
true
Enter First String  ?   ?  
abc
Enter Second  String   ?    ?  
abcfres
true
Enter First String  ?   ?  
xyz
Enter Second  String   ?    ?  
zyasdz
false
*/