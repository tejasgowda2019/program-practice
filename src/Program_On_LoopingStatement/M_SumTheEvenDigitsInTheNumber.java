package Program_On_LoopingStatement;
/*
 * adding only even digit in the given number
 */
import java.util.Scanner;

public class M_SumTheEvenDigitsInTheNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			if(rem%2==0)
			{
				sum =sum+rem;
			}
			a=a/10;
		}
		System.out.println(sum);

	}

}
