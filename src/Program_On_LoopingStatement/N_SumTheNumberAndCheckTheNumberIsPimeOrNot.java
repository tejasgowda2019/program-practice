package Program_On_LoopingStatement;

import java.util.Scanner;

public class N_SumTheNumberAndCheckTheNumberIsPimeOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum =sum+rem;
			a=a/10;
		}
		int count=0;
		for(int i=1;i<=sum;i++)
		{
			if(sum%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("The number is prime number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}

	}

}
