package sandeep.Leetcode.com;
import java.util.Scanner;
public class TechMahindraFeet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length   ?  ?   ");
		int len=sc.nextInt();
		System.out.println("Enter Array In All inches  ?    ?  ");
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int feetRes=findFeet(arr);
		System.out.println("Total Feet are : " +feetRes);
	}
	private static int findFeet(int[] arr) 
	{
		int feet=0;
		int L=arr.length;
		for(int i=0;i<L;i++)
		{
			feet=feet+arr[i]/12;
		}
		return feet;
	}
}
/*
Enter Any Array Length   ?  ?   
5
Enter Array In All inches  ?    ?  
18
11
27
12
14
Total Feet are : 5
*/