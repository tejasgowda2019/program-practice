package Program_On_LoopingStatement;

import java.util.Scanner;

public class X_NthPrimeNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int n=1;
		int b=0;
		while(true)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				b++;
			}
			if(a==b)
			{
				System.out.println(n+" is the "+a+"th prime number");
				break;
			}
			n++;
		}
		

	}

}
