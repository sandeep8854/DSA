package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_Base8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?   ?   ");
		int num=sc.nextInt();
		String res=base8(num);
		System.out.println(res);
	}

	private static String base8(int num)
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
			reminder=(num%8)+reminder;
			num=num/8;
		}	
		return sign+reminder;
	}
}
/*
Enter Any Number ?   ?   
100
144
Enter Any Number ?   ?   
-8
-10

*/