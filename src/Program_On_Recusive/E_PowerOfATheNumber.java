package Program_On_Recusive;

import java.util.Scanner;

public class E_PowerOfATheNumber {

	static int a=1;
	static int result=1;
	static void power(int base,int expo)
	{
		if(a<=expo)
		{
			result=result*base;
			a++;
			power(base ,expo);
		}
		else
		{
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int base=ip.nextInt();
		int expo=ip.nextInt();
		power(base,expo);

	}

}
