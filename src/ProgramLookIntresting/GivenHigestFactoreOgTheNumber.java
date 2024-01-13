package ProgramLookIntresting;

import java.util.Scanner;

public class GivenHigestFactoreOgTheNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int k=ip.nextInt();
		int a=0;
		int ans=0;
		boolean res=false;
		for(int i=n;i>=1;i--)
		{
			if(n%i==0)
			{
				a++;
				ans=i;
				if(a==k)
				{	res=true;
					break;
				}
				
			}
			
		}
		if(res==true)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println(1);
		}

	}

}
