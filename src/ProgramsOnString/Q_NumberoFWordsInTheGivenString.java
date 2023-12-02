package ProgramsOnString;

import java.util.Scanner;

public class Q_NumberoFWordsInTheGivenString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(c+1+" is the number of words");
	}

}
