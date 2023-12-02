package ProgramsOnString;

import java.util.Scanner;

public class D_CountOfNumericAlphabetSpecialChar {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		String s1=s.toLowerCase();
		int alpha=0;
		int num=0;
		int special=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				alpha++;
			}
			else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				num++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("The number of aplpha is :"+alpha+" and num is : "+num+" and special is: "+special);

	}

}
