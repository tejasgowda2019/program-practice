package Program_On_LoopingStatement;

/*
 * if the number last digit is 0 or 5 pint 0/5 itself or else check the last digit is even or odd
 * and print it
 */
import java.util.Scanner;

public class K_CompanyQuestion {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int rem=a%10;
		if(rem==0||rem==5)
		{
			System.out.println(rem);
		}
		else if(rem%2==0)
		{
			System.out.println(rem +" is the last digit and it is an even number");
		}
		else
		{
			System.out.println(rem +" is the last digit and it is an odd number");
		}

	}

}
