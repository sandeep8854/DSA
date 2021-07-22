package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Series_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ");
		int num=sc.nextInt();
		List<Integer> res=findSeries(num);
		for(int i=0;i<num;i++)
		{
			System.out.print(res.get(i)+ " ");
		}
	}
	private static List<Integer> findSeries(int num)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=num;i++)
		{
			int n=2;
			int temp=n*i;
			int m=3;
			int temp2=m*i;
			if(temp%2==0||temp2%2!=0)
			{
				list.add(temp);
				list.add(temp2);
			}	
		}
		return list;
	}
}
/*
Enter Any Number  ?  
10
2 3 4 6 6 9 8 12 10 15 12 18 14 21 16 24 18 27 20 30 
*/