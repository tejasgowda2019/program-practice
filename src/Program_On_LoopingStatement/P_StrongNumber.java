package Program_On_LoopingStatement;


/*
 * Sum of the factorial of the each digit in the given number is equal to given number 
 * then it is an Strong number
 * ex->1, 2, 145, 40585
 */
import java.util.Scanner;

public class P_StrongNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int a1=a;
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact =fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		if(a1==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}

	}

}
