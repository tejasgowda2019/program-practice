package ProgramsOnArray;

import java.util.Scanner;

public class K_ReplaceEachArrayElementWithSumOfTheirFactors {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			int sum=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					sum=sum+j;
				}
			}
			arr[i]=sum;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
