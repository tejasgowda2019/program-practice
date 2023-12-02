package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class K_Eleven {

	public static String  ReplaceCharacter(char []arr,int n,char c1,char c2) {
		String r="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c1 || arr[i]==c2)
			{
				if(arr[i]==c1)
				{
					r=r+c2;
				}
				else
				{
					r=r+c1;
				}
			}
			else
			{
				r=r+arr[i];
			}
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		char c1=ip.next().charAt(0);
		char c2=ip.next().charAt(0);
		char []arr=s.toCharArray();
		System.out.println(ReplaceCharacter(arr,arr.length,c1,c2));
		

	}

}

/*
 *Problem Statement

You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as 
its arguments . Implement the function to modify and return the string ‘ str’ in such a way 
that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences 
of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the
 string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced 
with ‘a’, thus output is paales.
 * */
 