package sandeep.Leetcode.com;
import java.util.Scanner;
public class Table
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ?  ");
		int num=sc.nextInt();
		power(num);	
	}
	private static void power(int num) 
	{
		
		int temp=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + "^" +i+ "= " +temp*num);
			temp=temp*num;
		}	
	}
}

/*
Enter Any Number  ?  ?  
2
2^1= 2
2^2= 4
2^3= 8
2^4= 16
2^5= 32
2^6= 64
2^7= 128
2^8= 256
2^9= 512
2^10= 1024
*/

