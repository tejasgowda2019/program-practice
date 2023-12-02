package ProgramsOnArray;

import java.util.Scanner;

public class F_SumOfArrayElementAndCheckIfItArStromg {

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
		int sum1=sum;
		int c=0;
		while(sum1!=0)
		{
			c++;
			sum1=sum1/10;
		}
		int sum2=sum;
		int realsum=0;
		while(sum2!=0)
		{
			int power=1;
			int a=sum2%10;
			for(int i=1;i<=c;i++)
			{
				power=power*a;
			}
			
			realsum=realsum+power;
			sum2=sum2/10;
		}
		
		if(realsum==sum)
		{
			System.out.println("the sum of the array element is armstrong number "+ sum);
		}
		else
		{System.out.println("the sum of the array element is not armstrong number "+ sum);
			
		}

	}

}
