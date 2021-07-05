package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leetcode_412_Fizz_Buzz 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?    ?  ");
		int num=sc.nextInt();
		List<String> res=fizzBuzz(num);
		for(int i=0;i<res.size();i++)
		{
			System.out.print(res.get(i) + " ");
		}
	}
	private static List<String> fizzBuzz(int num)
	{
		List<String > answer=new ArrayList<String>();
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 &&i%5==0)
			{
				answer.add("FizzBuzz");
			}
			else if(i%3==0)
			{
				answer.add("Fizz");
			}
			else if(i%5==0)
				
			{
				answer.add("Buzz");
			}
			else
			{
				answer.add(Integer.toString(i));
			}
		}
		return answer;
	}	
}
/*
Enter Any Number  ?    ?  
5
1 2 Fizz 4 Buzz 
 */
/*
 Enter Any Number  ?    ?  
15
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 
 */


