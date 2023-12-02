package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int []arr=new int[5];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				arr[0]++;
			}
			else if(s.charAt(i)=='e')
			{
				arr[1]++;
			}
			else if(s.charAt(i)=='i')
			{
				arr[2]++;
			}
			else if(s.charAt(i)=='o')
			{
				arr[3]++;
			}
			else if(s.charAt(i)=='u')
			{
				arr[4]++;
			}
		}
		char []v= {'a','e','i','o','u'};
		int c=arr[0];
		char ans=v[0];
		for(int i=1;i<v.length;i++)
		{
			if(c<arr[i])
			{
				c=arr[i];
				ans=v[i];
			}
		}
		System.out.println(ans);
	}

}
