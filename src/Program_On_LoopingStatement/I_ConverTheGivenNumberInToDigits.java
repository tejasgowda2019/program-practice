package Program_On_LoopingStatement;

import java.util.Scanner;

public class I_ConverTheGivenNumberInToDigits {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		while(a!=0)
		{
			System.out.println(a%10);
			a=a/10;
		}
	}

}
