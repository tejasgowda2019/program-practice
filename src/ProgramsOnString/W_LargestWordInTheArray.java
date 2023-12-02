package ProgramsOnString;
import java.util.Scanner;

public class W_LargestWordInTheArray 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String []arr=s.split(" ");
		int maxlength=arr[0].length();
		String ans=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(maxlength<arr[i].length())
			{
				maxlength=arr[i].length();
				ans=arr[i];
			}
		}
		System.out.println(ans);
	}
}
