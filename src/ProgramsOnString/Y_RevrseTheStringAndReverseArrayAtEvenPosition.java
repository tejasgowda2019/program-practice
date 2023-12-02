package ProgramsOnString;

import java.util.Scanner;

public class Y_RevrseTheStringAndReverseArrayAtEvenPosition 
{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i++)
		{
			if(i==0||i%2==0)
			{
				ans=arr[i]+" "+ans;
			}
			else
			{
//				System.out.println(arr[i]);
				String change=arr[i];
				String add="";
				for(int j=0;j<change.length();j++)
				{
					add=change.charAt(j)+add;
				}
				ans=add+" "+ans;
			}
		}
		System.out.println(ans);
	}
}
