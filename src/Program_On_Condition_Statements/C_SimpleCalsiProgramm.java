package Program_On_Condition_Statements;
/*
 * Simple calci program
 */
import java.util.Scanner;

public class C_SimpleCalsiProgramm {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.mul");
			System.out.println("4.Div");
			System.out.println("5.Exit");
			int a=ip.nextInt();
			int b=0;
			int c=0;
			if(a>=1&&a<=4)
			{
				System.out.println("Enter yout number s");
				 b=ip.nextInt();
				 c=ip.nextInt();
			}
			if(a==1)
			{
				System.out.println(b+c);
			}
			else if(a==2)
			{
				System.out.println(b-c);
			}
			else if(a==3)
			{
				System.out.println(b*c);
			}
			else if(a==4)
			{
				System.out.println(b+c);
			}
			else if(a==5)
			{
				System.exit(0);
			}
		}

	}

}
