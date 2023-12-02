package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class I_Nine {

	public static String MoveHyphen(char []arr,int n)
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='-')
			{
				s=s+arr[i];
			}
			else
			{
				s=arr[i]+s;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s =ip.nextLine();
		char []arr=s.toCharArray();
		System.out.println(MoveHyphen(arr,arr.length));
	}

}
/*
 *Implement the following functions.a

char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). 
Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the 
string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
 * */
