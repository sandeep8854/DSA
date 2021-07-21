package sandeep.Leetcode.com;
import java.util.Scanner;
public class Substring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ?  ?");
		String str1=sc.next();
		System.out.println("Enter Second String  ?   ?  ");
		String str2=sc.next();
		 boolean res=findsubstring(str1,str2);
		 if(res==true)
			 System.out.println("Yes ! First String SubSequence of Second String ");
		 else
			 System.out.println("No ! First String is Not SubSequence of Second String ");	
	}

	private static boolean findsubstring(String str1, String str2)
	{
		int L1=str1.length();
		int L2=str2.length();
		
		int j=0;
		for(int i=0;i<L2&& j<L1;i++)
		{
			if(str1.charAt(j)==str2.charAt(i))
				j++;
		}
		return j==L1;
	}
}

/*
Enter First String ?  ?
FIZZ
Enter Second String  ?   ?  
BUZZFIZZ
Yes ! First String SubSequence of Second String 
*/