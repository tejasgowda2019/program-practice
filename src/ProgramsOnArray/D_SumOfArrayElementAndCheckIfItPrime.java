package ProgramsOnArray;

import java.util.Scanner;

public class D_SumOfArrayElementAndCheckIfItPrime {

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
		int count=0;
		for(int i=1;i<=sum;i++)
		{
			if(sum%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(sum+" the sum of the array element is prime number");
		}
		else
		{
			System.out.println(sum+" the sum of the array element is not prime number");
		}

	}

}
