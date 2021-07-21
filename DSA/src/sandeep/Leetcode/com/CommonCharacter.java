package sandeep.Leetcode.com;
import java.util.Scanner;
public class CommonCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ?  ?");
		String str1=sc.next();
		System.out.println("Enter Second String  ?   ?  ");
		String str2=sc.next();
		char[] resu=findsubstring(str1,str2);
		for(int i=0;i<2;i++)
		{
			System.out.print(resu[i]+"");
		}	
	}
	private static char[] findsubstring(String str1, String str2)
	{
		char ch[]=new char[26];
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		
		int len1=str1.length();
		int len2=str2.length();
		
		for(int i=0;i<len1;i++)
		{
			arr1[str1.charAt(i)-'a' ]++;
		}
		
		for(int i=0;i<len2;i++)
		{
			arr2[str2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(arr1[i]!=0 && arr2[i]!=0)
			{
				for(int j=0;j<Math.min(arr1[i], arr2[i]);j++)
					
					ch[i]=(char) ((char)+i+'a');
				//	System.out.print(((char)(i+'a')));
			}
		}	
		return ch;
		//System.out.println(res);
	}
}
