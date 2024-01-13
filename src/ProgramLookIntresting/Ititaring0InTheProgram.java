package ProgramLookIntresting;

import java.util.Scanner;


/*
 * Input 5 the you have to convert  into the factirial and the you have to caluculate the 0 
 the end only;
 
 5=1*2*3*4*5 =120
 one zero at the end or Trailling hence output is zero
 * */

public class Ititaring0InTheProgram {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		int c=0;
		while(fact%10==0)
		{
			c++;
			fact=fact/10;
		}
		System.out.println(c);

	}

}
