package sandeep.Leetcode.com;
import java.util.Scanner;
public class Leetcode_383_Ransom_Note
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases   ?   ? ");
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		System.out.println("Enter Random Note  String ?   ?   ");
		String randomNote=sc.next();
		System.out.println("Enter Magazine Note String  ?    ?   ");
		String magazineNote=sc.next();
		boolean res=randon(randomNote,magazineNote);
		System.out.println(res);
		}
	}
	private static boolean randon(String randomNote, String magazineNote) 
	{		
		int array[]=new int[26];
		for(char ch:magazineNote.toCharArray())
		{
			array[ch-'a']++;
		}
		for(char ch:randomNote.toCharArray())
		{
			array[ch-'a']--;
			if(array[ch-'a']<0)
			{
				return false;
			}
		}
		return true;
	}
}

/*
a occupies position 0
b occupies position 1
.
.
.
.
etc etc
*/
/*
//  to get position 0 you need to call    'a'-'a'=0;
// to get position 1 , you need to call   'b'-'a'=1;
///to get position 1 , you need to call   'c'-'a'=2;
///to get position 1 , you need to call   'd'-'a'=3;
///to get position 1 , you need to call   'e'-'a'=4;
///to get position 1 , you need to call   'f'-'a'=5;
///to get position 1 , you need to call   'g'-'a'=6;
///to get position 1 , you need to call   'h'-'a'=7;
.
.
.
etc...
*/



/*
Enter Any Test Cases   ?   ? 
3
Enter Random Note  String ?   ?   
a
Enter Magazine Note String  ?    ?   
b
false
Enter Random Note  String ?   ?   
aa
Enter Magazine Note String  ?    ?   
ab
false
Enter Random Note  String ?   ?   
aa
Enter Magazine Note String  ?    ?   
aab
true

 */


