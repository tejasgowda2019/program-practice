package Program_On_LoopingStatement;

import java.util.Scanner;

public class U_PalendromeOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int copy=a;
		int pal=0;
		while(a!=0)
		{
			int rem=a%10;
			pal=(pal*10)+rem;
			a=a/10;
		}
		if(copy==pal)
		{
			System.out.println("The given number : "+pal+" is palendrome");
		}
		else
		{
			{
				System.out.println("The given number : "+pal+" is not palendrome");
			}
		}
	}

}
