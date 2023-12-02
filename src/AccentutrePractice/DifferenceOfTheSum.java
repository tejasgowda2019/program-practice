package AccentutrePractice;

import java.util.Scanner;

public class DifferenceOfTheSum {

	public static int differenceofSum(int n,int m)
	{
		int ans=0;int nsum=0;int sum=0;
		for(int i=0;i<=m;i++)
		{
			if(i%n==0)
			{
				nsum=nsum+i;
			}
			else
			{
				sum=sum+i;
			}
		}
		ans=nsum>sum?nsum-sum:sum-nsum;
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int m=ip.nextInt();
		System.out.println(differenceofSum(n,m));

	}

}
