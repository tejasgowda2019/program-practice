package ProgramsOnString;

import java.util.Scanner;

public class B_ReverseAString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		String s1="";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1+"  iterating from behind");
		for(int i=0;i<s.length();i++)
		{
			s2=s.charAt(i)+s2;
		}
		System.out.println(s2+" iterating from front");
	}

}
