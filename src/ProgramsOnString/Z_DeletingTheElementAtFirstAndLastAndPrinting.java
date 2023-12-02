package ProgramsOnString;

import java.util.Scanner;

public class Z_DeletingTheElementAtFirstAndLastAndPrinting {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		int f=0;
		int l=s.length();
//		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			String ans="";
			if(i%2==0)
			{
				l--;
			}
			else
			{
				f++;
			}
			for(int j=f;j<=l;j++)
			{
				ans=ans+s.charAt(j);
			}
			System.out.println(ans);
		}
	}

}
