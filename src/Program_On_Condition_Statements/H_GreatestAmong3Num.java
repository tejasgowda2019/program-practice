package Program_On_Condition_Statements;
/*
 * Greatest among three number
 */
import java.util.Scanner;

public class H_GreatestAmong3Num {

	public static void main(String[] args) {
		Scanner ip=new Scanner (System.in);
		System.out.println("Enter yout input");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greates ampoung three number");
			}
			else
			{
				System.out.println(c+" id grestest amoung three number");
			}
		}
		else if(b>c)
		{
			System.out.println(b+" is greates amoung three number");
		}
		else
		{
			System.out.println(c+" is greates amount three number ");
		}
			

	}

}
