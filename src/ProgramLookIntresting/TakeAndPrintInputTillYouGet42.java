package ProgramLookIntresting;


/*write a program to read the input lines and print out each one to the output 
 * when your program reads "42", stop processing  immediately and 
 * end the program don't print 42 
 * input :  4826
 * 			1
			23
			0.029726
			42
			8715


output: 	4826
			1
			23
			0.029726
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TakeAndPrintInputTillYouGet42 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		while(true)
		{
			String s=ip.next();
			if(!s.equals("42"))
			{
				a.add(s);
			}
			else
			{
				break;
			}
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}
