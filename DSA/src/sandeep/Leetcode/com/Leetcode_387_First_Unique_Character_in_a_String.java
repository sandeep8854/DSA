package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_387_First_Unique_Character_in_a_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?    ? ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any String  ?   ? ");
		String str=sc.next();
		int result=firstUnique(str);
		System.out.println(result);
		}
	}
	private static int firstUnique(String str) 
	{
		int len=str.length();
		int arr[]=new int[26];
		for(int i=0;i<len;i++)
		{
			int index=str.charAt(i)-'a';
			arr[index]++;
		}
		
		//find the index
		for(int i=0;i<len;i++)
		{
			int index=str.charAt(i)-'a';
			if(arr[index]==1)
			{
				return i;
			}	
		}
		return -1;
	}
}
/*
Enter Any Test Cases ?    ? 
5
Enter Any String  ?   ? 
leetcode
0
Enter Any String  ?   ? 
loveleetcode
2
Enter Any String  ?   ? 
aabb
-1
Enter Any String  ?   ? 
sandeep
0
Enter Any String  ?   ? 
prajapati
1
*/