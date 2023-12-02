package ProgramsOnString;

import java.util.Scanner;

public class I_ConvertLowerCaseToHigherViseversa {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		String newone="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				c-=32;
				newone=newone+c;
			}
			else if(c>='A'&&c<='Z')
			{
				c+=32;
				newone=newone+c;
			}
		}
		System.out.println(newone);

	}

}
