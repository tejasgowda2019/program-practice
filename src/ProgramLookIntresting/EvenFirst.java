package ProgramLookIntresting;

import java.util.Scanner;

public class EvenFirst {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				continue;
			}
			else
			{
				int temp=arr[i];
				for(int j=i;j<arr.length;j++)
				{
					if(arr[j]%2==0)
					{
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
