package sandeep.Leetcode.com;
import java.util.Scanner;
public class PermutationCombination
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n   ?    ?  ");
		int n=sc.nextInt();
		System.out.println("Enter Value of of r   ?    ? ");
		int r=sc.nextInt();
		System.out.println("nCr is = "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.println("nPr is = "+(fact(n)/(fact(n-r))));
		
	}
	private static int fact(int n) 
	{
		int facto=1;
		for(int i=1;i<=n;i++)
		{
			facto*=i;
		}
		return facto;
	}
}

//"r is at a time" whatever  number happen to be there.
//in more define terms we might say that n is size of population .
//r is size of each group you meight create from that population.
//