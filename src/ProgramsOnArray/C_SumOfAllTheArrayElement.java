package ProgramsOnArray;

import java.util.Scanner;

public class C_SumOfAllTheArrayElement {

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
			sum=sum+arr[i];
		}

		System.out.println(sum);
	}

}
