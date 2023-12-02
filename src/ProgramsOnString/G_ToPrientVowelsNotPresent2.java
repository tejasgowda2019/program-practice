package ProgramsOnString;

import java.util.Scanner;

public class G_ToPrientVowelsNotPresent2 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		String not="";
		int a=0,e=0,i=0,o=0,u=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='a')
			{
				a++;
			}
			else if(s.charAt(j)=='e')
			{
				e++;
			}
			else if(s.charAt(j)=='i')
			{
				i++;
			}
			else if(s.charAt(j)=='o')
			{
				o++;
			}
			else if(s.charAt(j)=='u')
			{
				u++;
			}
		}
		if(a==0)
		{
			not=not+'a';
		}
		if(e==0)
		{
			not=not+'e';
		}
		if(i==0)
		{
			not=not+'i';
		}
		if(o==0)
		{
			not=not+'o';
		}
		if(u==0)
		{
			not=not+'u';
		}
		if(a>0&&e>0&&i>0&&o>0&&u>0)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println(not);
		}

	}

}
