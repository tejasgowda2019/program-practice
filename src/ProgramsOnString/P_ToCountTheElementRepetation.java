package ProgramsOnString;

import java.util.Scanner;

public class P_ToCountTheElementRepetation {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		char []s1=s.toCharArray();
		char []s2=s.toCharArray();
		int c=0;
		for(int i=0;i<s1.length;i++)
		{
			c=0;
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i]==s2[j])
				{
					c++;
					s2[j]='\0';
				}
			}
			if(c>0)
			{
				System.out.println(s1[i]+"--->"+c);
			}
		}

	}

}
