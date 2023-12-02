package ProgramsOnString;

import java.util.Scanner;

public class U_ConvertingStringInToWordArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String s1="";
		int sp=0;
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				sp++;
			}
		}
		String []arr=new String[sp+1];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				arr[k]=s1;
				s1="";
				k++;
			}
			else if(i==s.length()-1)
			{
				s1=s1+s.charAt(i);
				arr[k]=s1;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
