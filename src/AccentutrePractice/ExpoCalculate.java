package AccentutrePractice;

import java.util.Scanner;

public class ExpoCalculate {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=0;
		for(int i=a;i<=b;i++)
		{
			int d=i;
			while(d!=0)
			{
				if(d%2==0)
				{
					c++;
				}
					d=d/2;
				
			}
		}
		System.out.println(c);

	}

}
