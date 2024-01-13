package IbmCodeingQuestion;

/*
 * Determine the number of valid words in a given string s. A valid word contains at 

least 3 characters with only alphanumeric characters (i.e., the numbers 0-9, 
letters A-Z in either case), at least one vowel ('a', 'e', 'i', 'o', 'u'), and at least one consonant.


Example

Suppose s = "This is an example string 234".

Is Valid

Word

This :-Yes

At least 3 characters, contains a vowel and a consonant

26 27 > int mai

is :- no Less than 3 characters

an :- No  Less than 3 characters

example: -Yes At least 3 characters, contains a vowel and a consonant

string:- Yes At least 3 characters, contains a vowel and a consonant

234 :no 


input : bob wins the game
out put : 4

input: this is form16 subbmis$ion date
output : 3

explation "this", "is", "form16" follow the condition is has only two letter 
and subbmis$ion has an special character "$"; 
 * */

import java.util.Scanner;

public class NumberOfVlidWords {
	public static int check(String []s)
	{	
		int ans=0;
		String s1="";
		for(int j=0;j<s.length;j++)
		{
			int v=0;
			int n=0;
			int c=0;
			int sp=0;
			s1=s[j].toLowerCase();
			if(s1.length()<3)
			{
				continue;
			}
			else
			{
				for(int i=0;i<s1.length();i++)
				{	
					if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
					{
						v++;
					}
					else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
					{
						c++;
					}
					else if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
						n++;
					}
					else
					{
						sp++;
					}
				}
			}
			if(v>0 && c>0 && sp==0)
			{
				ans++;		
			}
			else
			{
				continue;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		System.out.println(check(arr));
	}
}
