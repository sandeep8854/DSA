package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_415_Add_String 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String  ?   ? ");
		String str1=sc.next();
		System.out.println("Enter Second String  ?   ? ");
		String str2=sc.next();
		String res=addString(str1,str2);
		System.out.println(res);
	}
	private static String addString(String str1, String str2) 
	{
		StringBuilder res=new StringBuilder();
		int carry=0;
		int p1=str1.length()-1;
		int p2=str2.length()-1;
		
		while(p1>=0 || p2>=0)
		{
			int x1=p1>=0?str1.charAt(p1)-'0':0;
			int x2=p2>=0?str2.charAt(p2)-'0':0;
			
			int value=(x1+x2+carry)%10;
			    carry=(x1+x2+carry)/10;
			    
			    res.append(value);
			    p1--;
			    p2--;
		}
		if(carry!=0)
			res.append(carry);
		return res.reverse().toString();
	}
}
/*
Enter First String  ?   ? 
1789
Enter Second String  ?   ? 
15
1804
*/