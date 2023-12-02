package Program_On_LoopingStatement;
/*
 * Sum of last four digits of an employee must be prime to say employee is lucky
 * or better luck next time 
 */
import java.util.Scanner;

public class O_LuckyEmployee {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int n=0;
		int sum=0;
		while(n<4)
		{
			int rem=a%10;
			sum=sum+rem;
			n++;
			a=a/10;
		}
		System.out.println(sum);
		int count=0;
		for(int i=1;i<=sum;i++)
		{
			if(sum%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Lucky employee");
		}
		else
		{
			System.out.println("Better luck next time");
		}
	}

}
