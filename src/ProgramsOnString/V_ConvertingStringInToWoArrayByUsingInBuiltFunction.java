package ProgramsOnString;

import java.util.Scanner;

public class V_ConvertingStringInToWoArrayByUsingInBuiltFunction {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
