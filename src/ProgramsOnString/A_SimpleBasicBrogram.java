package ProgramsOnString;

import java.util.Scanner;

public class A_SimpleBasicBrogram {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		char s=ip.next().charAt(0);
		if((s>='a'&&s<='z')||(s>='A'&& s<='Z'))
		{
			System.out.println("it belong to alphabet");
		}
		else
		{
			System.out.println("Not a alphbet");
		}
		

	}

}
