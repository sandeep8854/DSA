package sandeep.Leetcode.com;

import java.util.Scanner;

public class Leetcode_504_Base7_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?   ?   ");
		int num=sc.nextInt();
		String res=base7(num);
		System.out.println(res);
	}

	private static String base7(int num)
	{
		if(num==0)
			return "0";
		String reminder="";
		String sign="";
		while(num<0)
		{
			num=-num;
			sign="-";
		}
		while(num>0)
		{
			reminder=(num%7)+reminder;
			num=num/7;
		}
		
		return sign+reminder;
	}
}
/*
 Enter Any Number ?   ?   
100
202
Enter Any Number ?   ?   
-7
-10

*/
