package AccentutrePractice;

import java.util.Scanner;

/*
 * You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the 
function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0*/
public class Vlidate {

	public static int CheckPassword(char str[], int n) {
		if(str.length<4)
		{
			return 0;
		}
		if(str[0]>='0'&& str[0]<='9')
		{
			return 0;
		}
		int cap=0;int num=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' '||str[i]=='/')
			{
				return 0;
			}
			if(str[i]>='a'&& str[i]<='z')
			{
				cap++;
			}
			if(str[i]>='0'&& str[i]<='9')
			{
				num++;
			}
		}
		if(num>0 && cap>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine().toLowerCase();
		char []str=s.toCharArray();
		System.out.println(CheckPassword(str,str.length));
	}

}
