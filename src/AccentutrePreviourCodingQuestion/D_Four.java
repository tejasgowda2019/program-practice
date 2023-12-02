package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class D_Four {

	public static int findCount(int arr[], int length, int num, int diff)
	{
		if(length==0)
		{
			return 0;
		}
		int d=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			d=0;
			if(arr[i]>num)
			{
				d=arr[i]-num;
			}
			else
			{
				d=num-arr[i];
			}
			if(d<=diff)
			{
				c++;
			}
		}
		if(c==0)
		{
			return -1;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int num=ip.nextInt();
		int diff=ip.nextInt();
		System.out.println(findCount(arr,n,num,diff));
	}

}

/*
 *You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and 
‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an 
absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than
 or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ 
i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14. 
 */
