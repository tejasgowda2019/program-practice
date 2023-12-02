package AccentutrePreviourCodingQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class O_Fifteen {

	public static int sum(int []arr,int n)
	{
		int add=0;
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 ||i%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		add=even.get(even.size()-2)+odd.get(odd.size()-2);
		return add;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(sum(arr,n));
	}

}
/*
 * Problem Statement 

You are required to input the size of the matrix then the elements of matrix,
then you have to divide the main matrix in two sub matrices (even and odd) in such a 
way that element at 0 index will be considered as even and element at 1st index will be 
considered as odd and so on. then you have sort the even and odd matrices in ascending 
order then print the sum of second largest number from both the matrices

Example

enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7
 */