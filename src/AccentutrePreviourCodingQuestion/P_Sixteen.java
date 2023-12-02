package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class P_Sixteen {


	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int sum=0;int table=0;
		for(int i=1;i<=10;i++)
		{
			table=table+n;
			System.out.print(table+", ");
			sum=sum+table;
		}
		System.out.println();
		System.out.println(sum);

	}

}
/*
 * Instructions: You are required to write the code. You can click on compile and run 
 * anytime to check compilation/execution status. The code should be logically/syntactically 
 * correct.

Problem: Write a program in C to display the table of a number and print the sum of 
all the multiples in it.

Test Cases:

Test Case 1:
Input:
5
Expected Result Value:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
275

Test Case 2:
Input:
12
Expected Result Value:
12, 24, 36, 48, 60, 72, 84, 96, 108, 120
660
 */