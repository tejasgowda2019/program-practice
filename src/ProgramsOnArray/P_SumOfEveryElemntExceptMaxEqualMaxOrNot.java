package ProgramsOnArray;

import java.util.Scanner;

public class P_SumOfEveryElemntExceptMaxEqualMaxOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max)
			{
				sum=sum+arr[i];
				
			}
		}
		if(sum==max)
		{
			System.out.println("yes max is equal to sum");
		}
		else
		{
			System.out.println("No max is not equal to sum");
		}

	}

}
