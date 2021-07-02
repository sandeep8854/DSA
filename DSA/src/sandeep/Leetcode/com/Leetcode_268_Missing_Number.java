package sandeep.Leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_268_Missing_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?    ?  ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Any Array Lengthv ?  ?");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int ii=0;ii<arr.length;ii++)
		{
			arr[ii]=sc.nextInt();
		}
		int res=missingNum(arr);
		System.out.print(res);
		}
	}

	private static int missingNum(int[] arr)
	{
		 Arrays.sort(arr);
			int L=arr.length;
	        if(arr[L-1]!=L)
	        {
	            return L;
	        }
	        else if(arr[0]!=0)
	        {
	            return 0;
	        }
	        else
	        {
	            for(int i=1;i<L;i++)
	            {
	                int miss=arr[i-1]+1;
	                if(arr[i]!=miss)
	                {
	                    return miss;
	                }
	            }
	        }
			
			return -1;
	}
}
/*
 * if the value of two operand are equal or not 
 * if value are not equal the condition become true;;
*/
/*
Enter Any Test Cases  ?    ?  
5
Enter Any Array Lengthv ?  ?
3
3
0
1
2Enter Any Array Lengthv ?  ?
2
0
1
2Enter Any Array Lengthv ?  ?
1
0
1Enter Any Array Lengthv ?  ?
4
1
2
3
4
0
*/