package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_278_First_Bad_Version
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?     ?  ");
		int num=sc.nextInt();
		int res=firstbadversion(num);
		System.out.println(res);
	}
	private static int firstbadversion(int num) 
	{
		if(num==1)
			return 1;
		else if(num==2)
			return 2;
		else
			return num-1;
	}
}
