package Program_On_LoopingStatement;
/*
 * To find the power of the given base and its Exponential
 */
import java.util.Scanner;

public class R_ExponwntialOrPowerOfTheNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int base=ip.nextInt();
		int power=ip.nextInt();
		int expo=1;
		for(int i=1;i<=power;i++)
		{
			expo=expo*base;
		}
		System.out.println(expo);

	}

}
