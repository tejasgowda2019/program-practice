package Program_On_LoopingStatement;

import java.util.Scanner;

public class E_FactorialOfTheGivenNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
