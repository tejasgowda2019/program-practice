package Program_On_LoopingStatement;

/*
 * if it contain at least one 0 then it is an duck number
 * ex-->1)15784(not a duck number)
 *      2)584804874(Duck number)
 */
import java.util.Scanner;

public class Q_DuckNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int count=0;
		while(a!=0)
		{
			int rem=a%10;
			if(rem==0)
			{
				count++;
				break;
			}
			a=a/10;
		}
		if(count==1)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a duck number");
		}

	}

}
