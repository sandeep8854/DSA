package sandeep.Leetcode.com;
import java.util.HashMap;
import java.util.Scanner;
public class Leetcode_290_Word_Pattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Pattern   ?   ? ");
		String pattern=sc.nextLine();
		System.out.println("Enter Any String  ?  ?  ");
		String str=sc.nextLine();
		boolean res=wordPattern(pattern,str);
		System.out.println(res);
	}
	private static boolean wordPattern(String pattern, String str) 
	{
		String[] word=str.split(" ");
       if(word.length != pattern.length()){
		return false;
	}	
		HashMap<Character,String>map=new HashMap<>();
		HashMap<String, Boolean>use=new HashMap<>();
		
		for(int i=0;i<pattern.length();i++)
		{
			char ch=pattern.charAt(i);
			
			if(map.containsKey(ch)==false)
			{
				if(use.containsKey(word[i])==true)
				{
					return false;
				}else
				{
					use.put(word[i], true);
					map.put(ch, word[i]);
				}
			}
			else
			{
				String mwith=map.get(ch);
				if(mwith.equals(word[i])==false)
		       		return false;
			}	
		}
		return true;
	}
}
/*
Enter Any Pattern   ?   ? 
abba
Enter Any String  ?  ?  
dog cat cat dog
true
*/
/*
String[] words = s.split(" ");
//Return false if the pattern and amount of words are different lengths
if(words.length != pattern.length()){
	return false;
}

HashMap<Character, String> map = new HashMap<Character, String>();
for(int i = 0; i < pattern.length(); i++){
	char c = pattern.charAt(i);
	if(map.containsKey(c)){
		//Return false if the map contains the key but has a differing value already assigned
		if(!map.get(c).equals(words[i])){
			return false;
		}
	}
	//Return false if the value is already in the map, but the key is not
	else if(map.containsValue(words[i])){
		return false;

	}
	//Add the key value pair to the map if the key and value are not already in it
	else{
		map.put(c, words[i]);
		
	}
}
return true;
*/