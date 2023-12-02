package ProgramsOnString;

import java.util.Scanner;

public class X_RevrseTheStringWithoutReversingTheArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			s1=arr[i]+" "+s1;
		}
		System.out.println(s1);
	}

}
