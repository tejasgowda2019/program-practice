package ProgramsOnString;

import java.util.Scanner;

public class T_SumOfTheNonRepetedNumber {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
