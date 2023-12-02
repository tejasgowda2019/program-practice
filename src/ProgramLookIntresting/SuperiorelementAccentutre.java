package ProgramLookIntresting;

import java.util.Scanner;

public class SuperiorelementAccentutre 
{
	public static int findSupiriorElement(int[] arr)
	{
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(c==0 && arr[i]>arr[j])
				{
					continue;
				}
				else if(arr[i]<arr[j])
				{
					c=-1;
					break;
				}
			}
			if(c==0)
			{
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(findSupiriorElement(arr));
	}
}