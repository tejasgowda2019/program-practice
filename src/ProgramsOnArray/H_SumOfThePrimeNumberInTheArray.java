package ProgramsOnArray;

import java.util.Scanner;

public class H_SumOfThePrimeNumberInTheArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=1;j<=arr[i];j++)
			{
				
				if(arr[i]%j==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
