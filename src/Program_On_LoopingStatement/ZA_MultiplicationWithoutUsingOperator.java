package Program_On_LoopingStatement;

import java.util.Scanner;

public class ZA_MultiplicationWithoutUsingOperator {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=1;
		int a1=a;
		while(c<b)
		{
			for(int i=1;i<=a1;i++)
			{
				a++;
			}
			c++;
		}
		System.out.println(a);
	}
}
