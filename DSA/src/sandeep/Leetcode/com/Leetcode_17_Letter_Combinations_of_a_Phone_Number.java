package sandeep.Leetcode.com;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Leetcode_17_Letter_Combinations_of_a_Phone_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length[With in 0<=lenght <=4] ?   ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int arr[]= {2,3};
		combinations(arr);	
	}

	private static void combinations(int[] arr)
	{
		String table[]= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		ArrayList<String> list=combinations(arr,table);	
		//print the content of list
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+ " ");
		}
	}

	private static ArrayList<String> combinations(int[] arr,String[] table)
	{
		//store the generated combination latter
		ArrayList<String> list=new ArrayList<>();
		Queue<String> q=new LinkedList<>();
		q.add("");
		while(!q.isEmpty())
		{
		
		String s=q.remove();
		if(s.length()==arr.length)
			list.add(s);
		else
		{
			String val=table[arr[s.length()]];
			for(int i=0;i<val.length();i++)
			{
				q.add(s+val.charAt(i));
			}	
		}
	}
		return list;
	}

//	private static List<String> combinationOfAPhoneNumber(String digit)
//	{
		//Stack is a LIFO Data Structure;
		//Queue is a FIFI Data Structure;
		//Breadth-first search [BFS] is done by Queue
		//Depth First Search [DFS] is done by Stack;
		//Using DFS and BFS (Difference Between DFS And BFS)
		
		//In DFS we will be find each Path Possible in the Tree One By One 
		//It will perform all step for a path first
		//Where BFS[Queue] will build all Path Together One Step At A time
		//So queue Will be work Perfectly for this Question.
	/*	If the given number is "23", 
		then using queue, the letter combinations 
		obtained will be:
		["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"] 
		and using stack, the letter combinations obtained will 
		be:
		["cf","ce","cd","bf","be","bd","af","ae","ad"].
		*/
	
	//	List<String> list=new ArrayList<>();
		
		
		
	//	return null;
	//}
	/*
	 class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        
        if(digits==null||digits.length()==0){
            return result;
        }
                
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
                
        };
        
        letterCombinationsRec(digits,0,"",mapping,result);
        
        return result;
    }
    
    public void letterCombinationsRec(String digits, int index,String current,String[] mapping, List<String> result){
        
        if(index==digits.length()){
            
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index)-'0'];
        
        for(int i=0;i<letters.length();i++){
            
            letterCombinationsRec(digits,index+1,current+letters.charAt(i),mapping,result);
        }
        
    }
}
	 */

}
/*
Enter Any Array Length[With in 0<=lenght <=4] ?   ? 
2
7
9
pw px py pz qw qx qy qz rw rx ry rz sw sx sy sz 
*/
/*
The Java programming language distinguishes between null and empty strings. An empty string is a string
 instance of zero length, whereas a null string has no value at all.

An empty string is represented as "". It is a character sequence of zero characters. 
A null string is represented by null. It can be described as the absence of a string instance.
*/