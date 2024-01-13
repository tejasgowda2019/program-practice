package IbmCodeingQuestion;

import java.util.Scanner;

public class WrapWords {

	public static String swapString(String inputString)
	{
		String ans="";
		String []arr=inputString.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i!=arr.length-1)
			{
				ans=" "+arr[i]+ans;
			}
			else
			{
				ans=arr[i]+ans;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		System.out.println(swapString(s));
	}

}
