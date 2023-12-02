package Program_On_LoopingStatement;

import java.util.Scanner;

public class ZB_GreatesCommonDivisior_GCD {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int GCD=0;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				GCD=i;
			}
		}
		System.out.println(GCD);

	}

}
