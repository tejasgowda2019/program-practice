package ProgramLookIntresting;

import java.util.Scanner;

public class KonibrttuTehnology_Adarash {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String a="ay ";
		String op="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			c++;
			if(i!=s.length()-1)
			{
				if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				{
					op=op+c;
				}
				else if(s.charAt(i)==' ')  
				{
					op=op+a;
				}
			}
			else
			{
				op=op+c+a;
			}		
		}
		System.out.println(op);
	}
}
