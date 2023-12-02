package Program_On_LoopingStatement;

import java.util.Scanner;

public class L_SumOfTheDigitsInTheGivenNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int sum=0;
		int rem=0;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println(sum);

	}

}
