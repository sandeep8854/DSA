package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_367_Valid_Perfect_Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ??  ");
		int num=sc.nextInt();
		boolean res=perfectSquare(num);
		System.out.println(res);
	}
	//last digit must be 1,4,5,6,9,0 is perfect square;
	//last digit [2,3,7,8] not perfect square;
	//

	private static boolean perfectSquare(int num)
	{
		if(num==1)
			return true;
		    int x=num%10;
	        if (x==2 || x==3 || x==7 || x==8) 
	        {
	            return false;
	        }
	        for(int i=0;i<=num/2;i++)
	        {
	            if(i*i==num)
	            {
	                return true;
	            }  
	        }
	        return false;
	}
}

/*
Enter Any Number  ??  
16
true
*/