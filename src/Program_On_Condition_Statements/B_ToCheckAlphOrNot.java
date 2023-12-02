package Program_On_Condition_Statements;

import java.util.Scanner;

/**
 * 
 * to check given input is aphabatic or not
 *
 */
public class B_ToCheckAlphOrNot {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter your letter");
		String a=ip.next();
		char[] b=a.toCharArray();
		if((b[0]>='A'&& b[0]<='Z')||(b[0]>='a'&& b[0]<='z'))
		{
			System.out.println("The given letter is Alphabatic");
		}
		else
		{
			System.out.println("the given letter is not a alpha");
		}
	}
}