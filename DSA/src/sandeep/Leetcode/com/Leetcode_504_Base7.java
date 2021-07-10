package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_504_Base7
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
		if(num<0)
			return "-" +base7(-num);
		 return (num >= 7 ? base7(num / 7) : "") + (char)(48 + num % 7);
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