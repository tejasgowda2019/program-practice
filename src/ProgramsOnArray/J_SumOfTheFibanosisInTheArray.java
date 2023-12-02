package ProgramsOnArray;

import java.util.Scanner;

public class J_SumOfTheFibanosisInTheArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int realsum=0;
		for(int i=0;i<arr.length;i++)
		{
			int n1=0;
			int n2=1;
			int sum=0;
			while(n1<=arr[i])
			{
				
				if(arr[i]==n1)
				{
					realsum=realsum+arr[i];
					break;
				}
				sum=n1+n2;
				n1=n2;
				n2=sum;
				
			}
		}
		System.out.println(realsum);

	}

}
