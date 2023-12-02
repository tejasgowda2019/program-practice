package Program_On_Condition_Statements;
/*
 * Converting the character lower to upper or upper to lower
 */
import java.util.Scanner;

public class E_ConverTheUpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.next();
		char a=s.charAt(0);
		if(a>='a'&&a<='z')
		{
			a-=32;
			System.out.println(a);
		}
		else if(a>='A'&&a<='Z')
		{
			a+=32;
			System.out.println(a);
		}
		

	}

}
