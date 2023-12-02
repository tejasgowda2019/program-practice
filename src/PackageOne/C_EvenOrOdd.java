package PackageOne;
/**
 * Program to check even or odd 
 **/
import java.util.Scanner;

public class C_EvenOrOdd {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=ip.nextInt();
		if(a%2==0)
		{
			System.out.println("The given number is Even");
		}
		else
		{
			System.out.println("The given number is odd");
		}

	}

}
