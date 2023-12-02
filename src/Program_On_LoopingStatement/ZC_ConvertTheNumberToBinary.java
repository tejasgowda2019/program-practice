package Program_On_LoopingStatement;

import java.util.Scanner;

public class ZC_ConvertTheNumberToBinary {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		String s="";
		
		while(n!=0)
		{
			int rem=n%2;
			s=rem+s;
			n=n/2;
		}
		System.out.println(s);

	}

}
