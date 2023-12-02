package ProgramLookIntresting;

import java.util.Scanner;

public class Subas {

	static boolean bo=true;
	static int b=0;
	public static boolean checkEvenOrOdd(int f)
	{
		if(f%2==0 && b==0)
		{
			bo= true;
		}
		else if(f%2!=0 && b==0)
		{
			bo=false;
		}
		else if(f%2==0 && b==1)
		{
			bo= true;
		}
		else if(f%2!=0 && b==1)
		{
			bo=false;
		}
		return bo;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		long  a=ip.nextLong();
		long a1=a;
		int n=0;	
		String s=ip.next();
		while(a1!=0)
		{
			a1=a1/10;
			n++;
		}
		int []arr=new int[n];
		int j=0;
		int sum=arr[0];
		String s1="";
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[i]=(int) (a%10);
			a=a/10;
		}
		for(int i=0;i<arr.length+1;i++)
		{
			
			if(b==0 && false==checkEvenOrOdd(sum))
			{
				sum=sum+arr[i+1];
			}
			else if(b==0 && true==checkEvenOrOdd(sum))
			{
				s1=s1+sum+s.charAt(b);
				sum=arr[i];
				b--;a++;
			}
			else if(b==1 && true==checkEvenOrOdd(sum))
			{
				sum=sum+arr[i];
			}
			else if(b==1 && false==checkEvenOrOdd(sum))
			{	
				s1=s1+sum+s.charAt(b);
				sum=arr[i];
				a--;
				b--;
			}
		}
		System.out.println(s1);
	}
		

}
