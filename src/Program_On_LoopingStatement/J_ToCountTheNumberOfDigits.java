package Program_On_LoopingStatement;

import java.util.Scanner;

public class J_ToCountTheNumberOfDigits {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int count=0;
		while(a!=0)
		{
			a=a/10;
			count++;
			
		}
		System.out.println(count);
	}

}
