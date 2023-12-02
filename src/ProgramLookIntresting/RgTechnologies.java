package ProgramLookIntresting;

import java.util.Scanner;

public class RgTechnologies {

	public static void main(String[] args) {
		Scanner ip=new Scanner (System.in);
		int a=ip.nextInt();
		if((a&1)==0)
		{
			System.out.println("the given number is even");
		}
		else
		{
			System.out.println("the given number is odd");
		}
		if((a/2)*2==a)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}

	}

}
