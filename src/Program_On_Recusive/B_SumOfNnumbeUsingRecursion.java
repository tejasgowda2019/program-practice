package Program_On_Recusive;

import java.util.Scanner;

public class B_SumOfNnumbeUsingRecursion {

	static int sum=0;
	static int count=0;
	static void sum(int n)
	{
		if(count==n)
		{
			System.out.println(sum);
		}
		else
		{
			sum=sum+n;
			sum(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		sum(a);
	}

}
