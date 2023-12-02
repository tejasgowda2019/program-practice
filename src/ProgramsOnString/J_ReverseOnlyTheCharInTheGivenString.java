package ProgramsOnString;

import java.util.Scanner;

public class J_ReverseOnlyTheCharInTheGivenString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		s=s.toUpperCase();
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s1=s1+s.charAt(i);
			}
		}
		int k=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s2=s2+s1.charAt(k);
				k--;
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
