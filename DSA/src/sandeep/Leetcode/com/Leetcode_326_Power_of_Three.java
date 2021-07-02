package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_326_Power_of_Three 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		boolean res=powerOfThree(num);
		System.out.println(res);	
	}
	private static boolean powerOfThree(int n)
	{
		 if(n<1)
		 {
			 return false;
		 }
		
	        while(n%3==0)
	        {
	            n=n/3;
	        }
	        return n==1;
	}
}
/*
Enter Any Number ?  ? 
9
true
*/