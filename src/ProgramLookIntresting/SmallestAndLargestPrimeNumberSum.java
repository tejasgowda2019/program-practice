package ProgramLookIntresting;

/*
 * input : -97
 * 			50
 * 
 * output : -50
 * 
 * Importent note: during loop -ve value is not considered so use Math Object 
 * If you confuesed by statement check the code once;
 * */
import java.util.Scanner;

public class SmallestAndLargestPrimeNumberSum {

	public static int  primeSmall(int a,int b)
	{
		int ans=0;
		boolean c=false;
		for(int i=a;i<=b;i++)
		{
			if(i<0)
			{
				i=Math.abs(i);
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					c=true;
					ans=-i;
					break;
				}
				if(c==true)
				{
					break;
				}
			}
			else
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					c=true;
					ans=i;
					break;
				}
				if(c==true)
				{
					break;
				}
			}
		}
		return ans;
	}
	public static int  primeLarge(int a,int b)
	{
		int ans=0;
		boolean c=false;
		for(int i=b;i>=a;i--)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				c=true;
				ans=i;
				break;
			}
			if(c==true)
			{
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		
		int smallest=primeSmall(a,b);
		int largest=primeLarge(a,b);
		System.out.println(smallest+largest);

	}

}
