package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leetcode_500_Keyboard_Row
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String Array Length  ?   ? ");
		int len=sc.nextInt();
	//	String str=sc.nextLine();
		String word[]=new String[len];
		for(int j=0;j<word.length;j++)
		{
			word[j]=sc.next();
		}
		String res[]=keyboardRow(word);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] + " ");
		}
	}

	private static String[] keyboardRow(String[] words) 
	{
		 int[] rowNum = new int[26];
	        
	        String row1 = "qwertyuiop";
	        String row2 = "asdfghjkl";
	        String row3 = "zxcvbnm";
	        
	        // Create a dictionary which maps each letter to the row it belongs to
	        for(char c: row1.toCharArray())
	        {
	            rowNum[c-'a'] = 1;
	        }
	        
	        for(char c: row2.toCharArray())
	        {
	            rowNum[c-'a'] = 2;
	        }
	        
	        for(char c: row3.toCharArray())
	        {
	            rowNum[c-'a'] = 3;
	        }
	        
	        List<String> res = new ArrayList<>();
	        for(String str : words)
	        {
	            // For each word , compare 2 characters at a time to see if they belong to the same row.
	            // If not, break the loop and check for the next word
	            String word = str.toLowerCase();
	            boolean isDifferentRows = false;
	            for(int i = 0; i< word.length() -1 ; i++)
	            {
	                char c1 = word.charAt(i);
	                char c2 = word.charAt(i+1);
	                if(rowNum[c1 -'a'] != rowNum[c2 -'a'])
	                {
	                    isDifferentRows = true;
	                    break;
	                }
	            }
	            //If all letters belong to the same row add to result;
	            if(!isDifferentRows)
	            {
	                res.add(str);
	            }
	        }
	    //    return res.toArray(new String[res.size()]);
	        return res.toArray(new String[0]);
	}

}
