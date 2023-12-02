package Program_On_Recusive;

import java.util.Scanner;

public class H_ReverseAnumberUsingRecursion {

	static int rev=0;
	static void reverse(int a)
	{
		if(a!=0)
		{
			rev=(rev*10)+(a%10);
			reverse(a/10);
		}
		else
		{
			System.out.println(rev);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		reverse(a);

	}

}
