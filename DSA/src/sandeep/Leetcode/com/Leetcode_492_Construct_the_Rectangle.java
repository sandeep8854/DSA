package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_492_Construct_the_Rectangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Area  ?    ?  ");
		int num=sc.nextInt();
		int res[]=constructTheRectangle(num);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+ " ");	
		}
	}
	private static int[] constructTheRectangle(int num)
	{
		/*
		 Condition - 1;
		 The area of rectangle web page you designed must equal to the given target area;
		 condition - 2;
		 ==================================================================================
		 The Width W Should Not Larger Than the Length
		 which means L>=W;
        =============================================================================================		 
		 Condition - 3
		 The Difference Between Length L and Width W Should be As Small As Possible
		 =====================================================================================
		  
		 */
		//Area=Length*Width;
		//length>=width;
		int arr[]=new int[2];
		int square=(int)Math.sqrt(num);
		while(num%square!=0)
		{
			square--;
		}
		int task1=square;
		int task2=num/square;
		
		 arr[0]=Math.max(task1, task2);
		 arr[1]=Math.min(task1, task2);
		 
		 return arr;	
	}
}

/*
Enter Any Area  ?    ?  
4
2 2 
Enter Any Area  ?    ?  
37
37 1 

Enter Any Area  ?    ?  
122122
427 286 
 */
