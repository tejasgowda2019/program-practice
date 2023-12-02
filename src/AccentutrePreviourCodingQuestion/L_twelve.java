package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class L_twelve {

	public static int OperationChoices(int c,int a,int b)
	{
		int ans=0;
		switch(c)
		{
		case 1:ans=a+b;
		break;
		case 2:ans=a-b;
		break;
		case 3:ans=a*b;
		break;
		case 4:ans=a/b;
		break;
		default :ans=0;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int c=ip.nextInt();
		int a=ip.nextInt();
		int b=ip.nextInt();
		System.out.println(OperationChoices(c,a,b));
	}

}
/*
 * Problem Statement

You are required to implement the following function.

Int OperationChoices(int c, int n, int a , int b )

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.

( a+ b ) , if c=1
( a – b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4
Assumption : All operations will result in integer output.

Example:

Input
c :1
a:12
b:16
Output:
Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
Sample Input

 c : 2

 a : 16

 b : 20

Sample Output

-4


 */