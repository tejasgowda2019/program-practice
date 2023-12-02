package PackageOne;

import java.util.Scanner;

/*
 * converting given minute into hour
 */
public class E_HourProgram {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		int input=ip.nextInt();
		int hour=input/60;
		int min=input%60;
		System.out.println(hour+" hour:"+min+" minutes");
	}

}
