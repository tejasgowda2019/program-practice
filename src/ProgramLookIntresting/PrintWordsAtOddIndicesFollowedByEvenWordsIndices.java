package ProgramLookIntresting;

/*
 * Given a String print the words at odd indices followed by the words at even indiecs
 * 
 * example 
 * 
 * input :- INDIA IS MY COUNTRY
 * output :- IS INDIA COUNTRY MY
 * */


import java.util.Scanner;

public class PrintWordsAtOddIndicesFollowedByEvenWordsIndices {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i=i+2)
		{
			if(i!=arr.length && i==0)
			{
				ans=ans+arr[i+1]+" "+arr[i];
			}
		    else if(i!=arr.length)
			{
				ans=ans+" "+arr[i+1]+" "+arr[i];
			}
			else
			{
				ans=ans+" "+arr[i];
			}
		}
		System.out.println(ans);

	}

}
