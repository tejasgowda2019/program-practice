package ProgramsOnArray;

import java.util.Scanner;

public class A_SimpleProgramOnArray {

	public static void main(String[] args) {
		int [] arr=new int[5];
		
		System.out.println(arr.length);
		System.out.println(arr[4]);
		
		System.out.println("-------------------------------");
		
		arr[3]=45;
		System.out.println(arr[3]);
		
		System.out.println("----------------------------");
		
		 int [] arr1= {10,20,30,40,50};
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
		 }
		 
		 System.out.println("-------------------------------");
		 
		 Scanner ip=new Scanner(System.in);
		 int n=ip.nextInt();
		 int [] a=new int[n];
		 for(int i=0;i<=a.length-1;i++)
		 {
			 arr[i]=ip.nextInt();
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		

	}

}
