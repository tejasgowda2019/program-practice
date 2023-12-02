package Program_On_LoopingStatement;

import java.util.Scanner;

/*ARMSTRONG:-
 * sum of the power of count of each digit in the number is same as given number
 * then it is an "Armstrong number".
 */
public class V_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int a1=a;
		int a2=a;
		int count=0;
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		int sum=0;
		while(a1!=0)
		{
			int rem=a1%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			a1=a1/10;
		}
		if(a2==sum)
		{
			System.out.println(sum+" : is an armstrong number ");
		}
		else
		{
			System.out.println(sum+" : is not an armstrong number ");
		}

	}

}
