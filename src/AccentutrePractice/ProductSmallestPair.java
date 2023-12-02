package AccentutrePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductSmallestPair {

	public static int ProductSmallestPairans(int sum, int []arr) {
		int ans=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			a.add(arr[i]);
		}
		Collections.sort(a);
		if(arr.length<2)
		{
			return -1;
		}
		int c=a.get(0)+a.get(1);
		if(c<=sum)
		{
			return a.get(0)*a.get(1);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int sum=ip.nextInt();
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(ProductSmallestPairans(sum,arr));

	}

}
