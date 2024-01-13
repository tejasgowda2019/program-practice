package ProgramLookIntresting;

import java.util.Scanner;
/*
 * input : 2514795
 * output: 27
 * 
 * explain : odddigits in the input are :5, 1, 7, 9, 5  hence output is: 27;
 * */
public class SumOfTheOddNumberInTheGivenNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int sum=0;
		while(a!=0)
		{
			int b=a%10;
			if(b%2!=0)
			{
				sum=sum+b;
			}
			a=a/10;
		}
		System.out.println(sum);

	}

}
