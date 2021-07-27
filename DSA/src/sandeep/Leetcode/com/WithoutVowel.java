package sandeep.Leetcode.com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WithoutVowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Sentence   ?   ");
		String str=sc.nextLine();
		String res=withoutVowel(str);
		System.out.println(res);
	}
	private static String withoutVowel(String str)
	{
	/*	Character vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> al=Arrays.asList(vowel);
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
		{
			if(al.contains(sb.charAt(i)))
			{
				sb.replace(i, i+1, "");
				i--;
			}
		}
		return sb.toString();
		*/
		return str.replaceAll("[aeiouAEIOU]", "");
	}
}
