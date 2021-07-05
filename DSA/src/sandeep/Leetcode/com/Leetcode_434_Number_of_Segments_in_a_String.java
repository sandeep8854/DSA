package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_434_Number_of_Segments_in_a_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String  ?   ? ");
		String str1=sc.nextLine();
		int res=numberOfSegment(str1);
		System.out.println(res);
	}
	private static int numberOfSegment(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' '||ch[i] != ' ' && ch[i-1]==' ')
			{
				count++;
			}
		}
		return count;
		/*
		   int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
		 */
	}
}
/*
Enter First String  ?   ? 
sandeep is good boy
4
*/
