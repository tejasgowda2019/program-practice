package ProgramsOnString;

import java.util.Scanner;

public class E_ToPrintNumberOfVowels {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s1=ip.nextLine();
		String s=s1.toLowerCase();
		int a=0,e=0,j=0,o=0,u=0;
		int []arr=new int[5];
		System.out.println(arr.length);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				a++;
			}
			else if(s.charAt(i)=='e')
			{
				e++;
			}
			else if(s.charAt(i)=='i')
			{
				j++;
			}
			else if(s.charAt(i)=='o')
			{
				o++;
			}
			else if(s.charAt(i)=='u')
			{
				u++;
			}
		}
		System.out.println("the vowel a:"+a+" e:"+" i:"+j+" o:"+o+" u:"+u);

	}

}
