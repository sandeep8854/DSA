package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_461_Hamming_Distance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Decimal Number  ?  ?  ");
		int X=sc.nextInt();
		System.out.println("Enter Second Decimal Number  ?   ?  ");
		int Y=sc.nextInt();
		int result=hammingDistance(X,Y);
		System.out.println(result);
	}
	private static int hammingDistance(int x, int y)
	{
		Integer xor=x^y;
	    String astic=Integer.toBinaryString(xor);
	    int count=0;
	    for(int i=0;i<astic.length();i++)
	    {
	    	if(astic.charAt(i)=='1')
	    		count++;
	    }
		return count;
	}
}
