package ProgramsOnArray;

import java.util.Scanner;

public class M_MinElementInTheArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int min=arr[0];
		int smin=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min && arr[i]!=min)
			{
				smin=arr[i];
			}
		}
		System.out.println(smin);

	}

}
