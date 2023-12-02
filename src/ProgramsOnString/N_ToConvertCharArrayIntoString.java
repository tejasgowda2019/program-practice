package ProgramsOnString;

import java.util.Scanner;

public class N_ToConvertCharArrayIntoString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
//		String s=ip.next();
		String s1="";
		char []arr= {'a','p','p','l','e'};
		for(int i=0;i<arr.length;i++)
		{
			s1=s1+arr[i];
		}
		System.out.println(s1);
		
		//Using inbuilt method to convert char arr int String
		String s2=new String(arr);
		System.out.println(s2);

	}

}
