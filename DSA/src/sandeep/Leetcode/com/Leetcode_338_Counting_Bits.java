package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_338_Counting_Bits
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		int  res[]=contingBits(num);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] contingBits(int num)
	{
		int result[]=new int[num+1];
		for(int i=0;i<=num;i++)
		{
			result[i]=count(i);
		}
		return result;
	}
	private static int count(int num) 
	{
		int res=0;
		while(num!=0)
		{
			if(num%2==1)
			{
				res++;
			}
			num=num/2;
		}
		return res;
	}
}
/*
Enter Any Number ?  ? 
5
0 1 1 2 1 2 
*/
/*
Enter Any Number ?  ? 
10
0 1 1 2 1 2 2 3 1 2 2 
*/
/*
Enter Any Number ?  ? 
2
0 1 1 
*/