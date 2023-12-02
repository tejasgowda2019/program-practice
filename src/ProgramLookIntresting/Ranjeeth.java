package ProgramLookIntresting;

import java.util.Scanner;

public class Ranjeeth {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(i*i>a)
			{
				break;
			}
			else if(i*i<=a)
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
