package Program_On_LoopingStatement;
/*
 * if the given number would get by multiplying by same two number then it is 
 * perfect square number
 * ex--> 5,6,8,48...-(not a perfect square number)
 * 		4,9,16...(perfect square number)2*2=4,,3*3=9,,4*4=16
 */		
import java.util.Scanner;

public class S_PerfectSquareNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(i*i==a)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Perfect Square number");
		}
		else
		{
			System.out.println("Not a perfect Square number");
		}
	}
}
