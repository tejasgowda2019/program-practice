package ProgramsOnArray;

import java.util.Scanner;

public class E_SumOfArrayElementAndCheckIfItFibanois {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int [] arr=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int a=0;
		int b=1;
		int c=0;
		boolean check=false;
		for(int i=0;i<=sum;i++)
		{
			if(sum==a) {
				check=true;
				break;
			}
			else
			{
				c=a+b;
				a=b;
				b=c;
			}
		}
		if(check==true)
		{
			System.out.println(sum+" the sum of the array element is fibonis number");
		}
		else
		{
			System.out.println(sum+" the sum of the array element is not a fibonis number");
		}

	}

}
