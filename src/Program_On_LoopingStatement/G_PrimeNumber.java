package Program_On_LoopingStatement;

import java.util.Scanner;

public class G_PrimeNumber {

	static boolean isPrime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		boolean b=isPrime(a);
		if(b)
		{
			System.out.println("the given number "+a+" is prime number");
		}
		else
		{
			System.out.println("the given number "+a+" is not prime number");
		}
		
		System.out.println("=======================================================");
		int count1=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count1++;
			}
		}
		if(count1==2)
		{
			System.out.println("the given number "+a+" is prime number");
		}
		else
		{
			System.out.println("the given number "+a+" is prime number");
		}
	}

}
