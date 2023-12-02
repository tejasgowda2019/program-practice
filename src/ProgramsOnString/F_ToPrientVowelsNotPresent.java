package ProgramsOnString;

import java.util.Scanner;

public class F_ToPrientVowelsNotPresent {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		s=s.toLowerCase();
		String s1="aeiou";
		String not="";
		for(int i=0;i<s1.length();i++)
		{
			boolean check=false;
			for(int j=0;j<s.length();j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				{
					check=true;
					break;
				}
			}
			if(check==false)
			{
				not=not+s1.charAt(i);
			}
			
		}
		if(not.equals(""))
		{
			System.out.println("all letters are present");
		}
		else
		{
			System.out.println(not);
		}
		

	}

}
