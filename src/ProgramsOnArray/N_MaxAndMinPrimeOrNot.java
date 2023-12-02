package ProgramsOnArray;

import java.util.Scanner;

public class N_MaxAndMinPrimeOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int min=arr[0],max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int count=0;
		for(int i=1;i<=max;i++)
		{
			if(max%i==0) {
				count++;
			}
				
		}
		if(count==2)
		{
			System.out.println("the obtained max is prime number "+max);
		}
		else
		{
			System.out.println("the obtained max is not  prime number "+max);
		}
		int  count1=0;
		for(int i=1;i<=min;i++)
		{
			if(min%i==0) {
				count1++;
			}
				
		}
		if(count1==2)
		{
			System.out.println("the obtained min is prime number "+min);
		}
		else
		{
			System.out.println("the obtained min is not prime number "+min);
		}

	}

}
