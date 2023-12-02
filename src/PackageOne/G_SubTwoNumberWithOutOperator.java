package PackageOne;

import java.util.Scanner;

public class G_SubTwoNumberWithOutOperator 
{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=a;
		int d=b;
		for(int i=1;i<=b;i++)
		{
			a--;
		}
		System.out.println(a);
		
		System.out.println("---------------------------------------");
		
		int res=c+~d+1;
		System.out.println(res);
		
		System.out.println("----------------------------------------");
		System.out.println(-(-c+d));
	}
}
