package Program_On_Recusive;

import java.util.Scanner;

public class G_GreatestCommonDevisor_GDC {

	static int i=1;
	static int gdc=0;
	static void Gcd(int a,int b)
	{	
		if(i<=a&&i<=b)
		{
			if(a%i==0&&b%i==0)
			{
				gdc=i;
				i++;
				Gcd(a,b);
			}
			else
			{
				i++;
				Gcd(a,b);
			}		
		}
		else 
		{
			System.out.println(gdc);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		Gcd(a,b);

	}

}
