package ProgramsOnString;
import java.util.Scanner;


public class R_RemoveExtraSpaceInTheString 
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String s1="";
		if(s.charAt(0)!=' ')
		{
			s1=""+s.charAt(0);
		}
		else
		{
			s1="";
		}
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i-1)!=' ') 
			{
				s1=s1+s.charAt(i);
			}
			else if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
			{
				s1=s1+' '+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
