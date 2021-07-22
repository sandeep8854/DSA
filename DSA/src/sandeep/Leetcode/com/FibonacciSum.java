package sandeep.Leetcode.com;
import java.util.Scanner;
public class FibonacciSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int num=sc.nextInt();
		int res=sum(num);
		System.out.println("Fibonacci Sum is :" + res);
	}
	private static int sum(int num)
	{
		if(num<=0)
			return 0;
		int fibo[]=new int[num+1];
		fibo[0]=0;
		fibo[1]=1;
		int sum=fibo[0]+fibo[1];
		for(int i=2;i<=num;i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];
			sum=sum+fibo[i];
		}
		return sum;
	}
}
/*
Enter Any Number ?  ? 
3
Fibonacci Sum is :4
*/