package Program_On_LoopingStatement;

import java.util.Scanner;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
public class Z_NthFibanosisNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		
		
			int count=1;
			int i=0;
			int n=0,n1=1,sum=0;
			while(i<=n)
			{
				if((count)==a)
				{
					System.out.println(n+" is the "+a+" th fibanosis number");
					break;
				}
				else
				{
					count++;
					sum=n+n1;
					n=n1;
					n1=sum;
				}
			}
		
	}

}
