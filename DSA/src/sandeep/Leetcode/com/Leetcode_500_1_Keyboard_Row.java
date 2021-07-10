package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Leetcode_500_1_Keyboard_Row
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
		String res[]=keyboardRow_1(word);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i] + " ");
		}
	}
	private static String[] keyboardRow_1(String[] words) 
	{
		 ArrayList<String> list=new ArrayList<>();
		    HashMap<Character,Integer> map=new HashMap<>();
		    
		    char[] one={'q','w','e','r','t','y','u','i','o','p'};
		    char[] two={'a','s','d','f','g','h','j','k','l'};
		    char[] three={'z','x','c','v','b','n','m'};
		    
		    for(char c:one)
		        map.put(c,1);
		    
		    for(char c:two)
		        map.put(c,2);
		    
		    for(char c:three)
		        map.put(c,3);
		    
		    for(String word:words)
		    {
		        String word_copy=word;
		        word=word.toLowerCase();
		        char[] ch=word.toCharArray();
		        int identifier=map.get(ch[0]);
		        boolean check=true;
		        
		        for(char c:ch)
		        {
		            if(map.get(c)!=identifier)
		            { 
		                check=false;
		                break;
		            }
		        }
		        
		        if(check)
		        {
		            list.add(word_copy);
		        }else
		        {
		            continue;
		        }
		    }
		    String[] res=new String[list.size()];
		    return list.toArray(res);	
	}

}
