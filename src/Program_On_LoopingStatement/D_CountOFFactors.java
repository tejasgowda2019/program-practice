package Program_On_LoopingStatement;

import java.util.Scanner;

public class D_CountOFFactors {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
