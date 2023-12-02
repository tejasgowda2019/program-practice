package AccentutrePractice;

import java.util.Scanner;

public class Rat {

	public static int ans(int r,int n,int size,int[] arr)
	{
		if(arr.length==0)
		{
			return -1;
		}
		int ans=0;
		int re=r*n;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(sum>=re)
			{
				break;
			}
			if(re>sum && i==arr.length-1)
			{
				return 0;
			}
			else
			{
				sum=sum+arr[i];
				ans++;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int r=ip.nextInt();
		int n=ip.nextInt();
		int size=ip.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(ans(r,n,size,arr));
	}

}
