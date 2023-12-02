package Program_On_Recusive;

import java.util.Scanner;

public class C_SumOfDigitsUsingRecusrion {

	static int sum=0;
	static void sumOfDigits(int a)
	{
		if(a!=0)
		{
			sum=sum+(a%10);
			sumOfDigits(a/10);
		}
		else
		{
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		sumOfDigits(a);

	}

}
