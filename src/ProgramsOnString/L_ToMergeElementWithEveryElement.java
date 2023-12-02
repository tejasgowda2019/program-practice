package ProgramsOnString;

import java.util.Scanner;

public class L_ToMergeElementWithEveryElement {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				System.out.print(s.charAt(i)+""+s.charAt(j)+"  ");
			}
			System.out.println(" ");
		}

	}

}
