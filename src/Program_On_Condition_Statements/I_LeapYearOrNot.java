package Program_On_Condition_Statements;

/*
 * program for leap years
 */
import java.util.Scanner;

public class I_LeapYearOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		if(a%4==0&&a%100!=0)
		{
			System.out.println("The given year: "+a+" is leap year");
		}
		else if(a%400==0)
		{
			System.out.println("if else condtions");
			System.out.println("The given year: "+a+" is leap year");
		}
		else
		{
			System.out.println("The given year: "+a+" is not a leap year");
		}
	}

}
