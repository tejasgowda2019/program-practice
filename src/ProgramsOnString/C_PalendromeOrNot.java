package ProgramsOnString;

import java.util.Scanner;

public class C_PalendromeOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		if(s1.equals(s))
		{
			System.out.println("the string is palendrome ");
		}
		else
		{
			System.out.println("the string is not palendrome ");
		}

	}

}
