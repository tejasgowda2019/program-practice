package ProgramsOnArray;

import java.util.Scanner;

public class Q_ReverseStoringArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int [n];
		int []arr1=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			n--;
			arr1[i]=arr[n];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr :"+arr[i]);
			System.out.println("arr1 :"+arr1[i]);
		}

	}

}
