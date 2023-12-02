package Program_On_Condition_Statements;

import java.util.Scanner;

public class A_GreatestAmoungTwoNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner (System.in);
		System.out.println("Enter your two numbers");
		int a=ip.nextInt();
		int b=ip.nextInt();
		if(a>b)
		{
			System.out.println("a is greatest");
		}
		else if(b>a)
		{
			System.out.println("b is grestest ");
		}
		else
		{
			System.out.println(" the enter number are equals");
		}

	}

}
