package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		ip.nextLine();
		String s=ip.nextLine();
		int l=ip.nextInt();
		String []word=s.split(" ");
		String ans="";
		for(int i=l;i<word.length;i++)
		{
			ans=ans+word[i]+" ";
		}
		for(int i=0;i<l;i++)
		{
			if(i!=l-1)
			{
				ans=ans+word[i]+" ";
			}
			else
			{
				ans=ans+word[i];
			}
		}
		System.out.println(ans);

	}

}
