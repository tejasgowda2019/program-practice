package ProgramsOnArray;

import java.util.Scanner;

public class B_ReversePrintingOfAnArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
