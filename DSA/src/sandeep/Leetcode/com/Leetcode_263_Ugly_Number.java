package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_263_Ugly_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?    ?   ");
		int num=sc.nextInt();
		boolean res=isUgly(num);
		if(res==true)
			System.out.println("Ugly Number  .");
		else
			System.out.println("Not Ugly Number .");	
	}
	private static boolean isUgly(int num) 
	{
		if(num<1)
            return false;
        if(num==1)
            return true;
        if(num%2==0)
            return isUgly(num/2);
        if(num%3==0)
            return isUgly(num/3);
        if(num%5==0)
            return isUgly(num/5);
        return false;	
	}
}
