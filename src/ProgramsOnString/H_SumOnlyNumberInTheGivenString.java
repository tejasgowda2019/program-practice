package ProgramsOnString;

import java.util.Scanner;

public class H_SumOnlyNumberInTheGivenString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int ch=s.charAt(i);
				sum=sum+(ch=ch-48);//(ch-48) or (s.charAt(i)-48);
			}
		}
		System.out.println(sum);
		

	}

}
