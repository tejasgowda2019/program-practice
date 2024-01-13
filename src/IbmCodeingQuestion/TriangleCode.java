package IbmCodeingQuestion;

/*
 * in the assembly line, the factory assembles three parts 'a' 'b' 'c'  of a trinalgle toy
 * a valid toy is the one where the two shorter sides added together are greater in 
 * length than the longest side
 * 
 * two forams of valid trianlge
 *  :- if 2 parts are equal length, the form is "isosceles";
 *  :-if all 3 psrts are of equal length the form is "Equilateral";
 * 
 *  if not a valid toy then print "None of these"
 *  
 *  example :-['2 2 1','3 3 3','3 4 5','1 1 3']
 *  output  :-['Isosceles' 'Equilateral' 'None Of The Above' 'None Of The Above']
 * 
 * input :-
size of the array = 4
	36 36 30
	47 8 60
	46 96 90
	86 86 86

output:
	Isosceles
	None Of The Above
	None Of The Above
	Equilateral


 * */

import java.util.Scanner;

public class TriangleCode {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		ip.nextLine();
		String []arr=new String[n];
		String ans="";
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			String []arr1=arr[i].split(" ");
			int a=Integer.parseInt(arr1[0]);
			int b=Integer.parseInt(arr1[1]);
			int c=Integer.parseInt(arr1[2]);
			if((a+b)>c && (b+c)>a && (c+a)>b)
			{
				if(a==b & b==c)
				{
					System.out.println("Equilateral");
				}
				else if(a==b || b==c ||c==a)
				{
					System.out.println("Isosceles");
				}
				else
				{
					System.out.println("None Of The Above");
				}
			}
			else
			{
				System.out.println("None Of The Above");
			}
		}
	}
}


