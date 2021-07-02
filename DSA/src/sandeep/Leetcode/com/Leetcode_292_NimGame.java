package sandeep.Leetcode.com;

import java.util.Scanner;

public class Leetcode_292_NimGame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		boolean res=nimGam(num);
		System.out.println(res);	
	}
	private static boolean nimGam(int num)
	{
		return num%4!=0;
	}
}
