package Program_On_LoopingStatement;

import java.util.Scanner;

public class H_ProgramOnBreakAndContinue {

//	static void checkPrime(int n)
//	{
//		int count=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//				
//			}
//		}
//		if(count==2)
//		{
//			System.out.println(n +" is  a prime number");
//		}
//		else
//		{
//			System.out.println(n +" is not a prime number");
//		}
//	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
//		checkPrime(sc.nextInt());
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
				{
					break;
				}
				else if(i==2)
				{
					continue;
				}
				else
				{
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
