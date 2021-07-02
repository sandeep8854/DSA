package sandeep.Leetcode.com;
import java.util.Scanner;
public class LeetCode_342_Power_of_Four 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		boolean res=powerOfFour(num);
		System.out.println(res);	
	}
	private static boolean powerOfFour(int n)
	{
		 if(n<1)
		 {
			 return false;
		 }
		
	        while(n%4==0)
	        {
	            n=n/4;
	        }
	        return n==1;
	}
}
/*
nter Any Number ?  ? 
20
false
*/
/*
Enter Any Number ?  ? 
16
true
*/