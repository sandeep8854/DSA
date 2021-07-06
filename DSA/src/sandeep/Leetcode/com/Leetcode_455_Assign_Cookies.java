package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_455_Assign_Cookies
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Length ?   ?   ");
		int len=sc.nextInt();
		int arrG[]=new int[len];
		for(int i=0;i<arrG.length;i++)
		{
			arrG[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array Length ?   ?  ");
		int len2=sc.nextInt();
		int arrS[]=new int[len2];
		for(int i=0;i<arrS.length;i++)
		{
			arrS[i]=sc.nextInt();
		}	
		int res=AssignCookies(arrS,arrG);
		System.out.println(res);
	}
	private static int AssignCookies(int[] arrS, int[] arrG) 
	{
		int count=0;
		int i=0;
		int j=0;
		while(i<arrG.length && j<arrS.length)
		{
			if(arrS[j]>=arrG[i])
			{
				count++;
				i++;
				j++;
			}
			else
				j++;
		}
		return count;
	}
}

/*
Enter First Array Length ?   ?   
2
1
2
Enter Second Array Length ?   ?  
3
1
2
3
2
*/