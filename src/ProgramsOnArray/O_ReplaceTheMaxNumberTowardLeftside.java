package ProgramsOnArray;

import java.util.Scanner;

public class O_ReplaceTheMaxNumberTowardLeftside 
{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int max=arr[0];
		arr[0]=-1;
		for(int i=1;i<arr.length;i++) 
		{
			if(max>arr[i])
			{
				arr[i]=max;
			}
			else
			{	
				max=arr[i];
				arr[i]=-1;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
