package ProgramsOnString;

import java.util.Scanner;

public class M_ConvertStringInToCharArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		char []arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		//By using in built Method
		char []arr2=s.toCharArray();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
