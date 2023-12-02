package Program_On_Condition_Statements;

import java.util.Scanner;

public class J_KeshaMockRateingSelection {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		boolean j=ip.nextBoolean();
		boolean s=ip.nextBoolean();
		if(j==true &&s==true)
		{
			System.out.println("Student is very good");
		}
		else if((j==true&&s==false)||(j==false&&s==true))
		{
			System.out.println("Student is average");
		}
		else
		{
			System.out.println("Student need to work hard and improve");
		}

	}

}
