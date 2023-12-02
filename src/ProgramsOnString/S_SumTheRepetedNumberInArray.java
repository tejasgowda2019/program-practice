package ProgramsOnString;

import java.util.Scanner;

public class S_SumTheRepetedNumberInArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		int []arr1=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=ip.nextInt();
			arr1[i]=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr1[j])
				{
					c++;
					arr1[j]=0;
				}
			}
			if(c>1)
			{
				
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
