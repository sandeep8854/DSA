package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_496_Next_Greater_Element_I
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First  Array Length  ?   ? ");
		int len1=sc.nextInt();
		
		int arr1[]=new int[len1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
	
		System.out.println("Enter Second Array Length  ?   ? ");
		int len2=sc.nextInt();
	
		int arr2[]=new int[len2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int res[]=nextgreaterElement(arr1,arr2);
		for(int ii=0;ii<res.length;ii++)
		{
			System.out.println(res[ii] + " ");
		}	
	}
	private static int[] nextgreaterElement(int[] arr1, int[] arr2) 
	{
		int l1=arr1.length;
		int l2=arr2.length;
		
		int arr3[]=new int[l1];
		for(int z=0;z<l1;z++)
		{
			arr3[z]=-1;
		}
		
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(j==l2)
					{
						break;
					}
					for(int k=j+1;k<l2;k++)
					{
						if(arr2[k]>arr1[i])
						{
							arr3[i]=arr2[k];
							break;
						}
					}
					break;
				}
			}
		}
		return arr3;
	}
}

/*
Enter First  Array Length  ?   ? 
2
Enter Time Series   ?    ? 
2
4
Enter Second Array Length  ?   ? 
4
Enter Time Series   ?    ? 
1
2
3
4
3 
-1 

 */
/*
Enter First  Array Length  ?   ? 
3
Enter Time Series   ?    ? 
4
1
2
Enter Second Array Length  ?   ? 
4
Enter Time Series   ?    ? 
1
3
4
2
-1 
3 
-1 

 */
