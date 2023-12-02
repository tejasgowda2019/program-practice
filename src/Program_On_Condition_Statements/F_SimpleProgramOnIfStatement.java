package Program_On_Condition_Statements;

import java.util.Scanner;

public class F_SimpleProgramOnIfStatement {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		int a=ip.nextInt();
		if(s.equals("male"))
		{
			if(a>21)
			{
				System.out.println("Game over RIP ");
			}
			else
			{
				System.out.println("Enjoy you life");
			}
		}
		else if(s.equals("female"))
		{
			if(a>21)
			{
				System.out.println("Game Starts ");
			}
			else
			{
				System.out.println("Chance for boys");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
