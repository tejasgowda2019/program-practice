package Program_On_LoopingStatement;

import java.util.Scanner;

public class F_PintingFactoreOfTheNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}


	}

}
