package Program_On_Condition_Statements;

/*
 * Check the Given character is vowel or not
 */
import java.util.Scanner;

public class D_Vowels {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String c=ip.next();
		if(c.charAt(0)=='a'||c.charAt(0)=='A')
		{
			System.out.println("The given charater is vowels");
		}
		else if(c.charAt(0)=='e'||c.charAt(0)=='E')
		{
			System.out.println("The given charater is vowels");
		}
		else if(c.charAt(0)=='i'||c.charAt(0)=='I')
		{
			System.out.println("The given charater is vowels");
		}
		else if(c.charAt(0)=='O'||c.charAt(0)=='o')
		{
			System.out.println("The given charater is vowels");
		}
		else if(c.charAt(0)=='u'||c.charAt(0)=='U')
		{
			System.out.println("The given charater is vowels");
		}
		else
		{
			System.out.println("The given character not a vowel");
		}

	}

}
