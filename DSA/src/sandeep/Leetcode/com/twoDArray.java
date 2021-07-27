package sandeep.Leetcode.com;
import java.util.Scanner;
public class twoDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number Of Row ?  ?  ");
		int row=sc.nextInt();
		System.out.println("Enter Any Number of Column ?   ?  ");
		int column=sc.nextInt();
		int arrD[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arrD[i][j]=sc.nextInt();
			}
		}
		twoDArr(arrD,row,column);	
	}
	private static void twoDArr(int[][] arrD, int row, int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arrD[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 Enter Any Number Of Row ?  ?  
6
Enter Any Number of Column ?   ?  
6
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
1 2 3 4 5 6 
7 8 9 10 11 12 
13 14 15 16 17 18 
19 20 21 22 23 24 
25 26 27 28 29 30 
31 32 33 34 35 36 

 */

/*
 Enter Any Number Of Row ?  ?  
3
Enter Any Number of Column ?   ?  
3
1
2
3
4
5
6
7
8
9
1 2 3 
4 5 6 
7 8 9 
*/
