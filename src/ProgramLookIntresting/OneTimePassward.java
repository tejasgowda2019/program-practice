package ProgramLookIntresting;

import java.util.Scanner;

public class OneTimePassward {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int ans=1;
		while(a!=0)
		{
			int rem=a%10;
			ans=ans*rem;
			a=a/10;
		}
		System.out.println(ans);

	}

}
