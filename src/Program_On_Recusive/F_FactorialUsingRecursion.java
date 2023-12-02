package Program_On_Recusive;

import java.util.Scanner;

public class F_FactorialUsingRecursion {

	static int b=1;
	static int fact=1;
	static void fact(int n)
	{
		if(b<=n)
		{
			fact=fact*b;
			b++;
			fact(n);
		}
		else
		{
			System.out.println(fact);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		fact(a);

	}

}
