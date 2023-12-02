package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class F_Six {

	public static int LargeSmallSum(int []arr)
	{
		if(arr.length<3)
		{
			return 0;
		}
		int even=arr[0];
		int odd=arr[1];
		int sev=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || i%2==0)
			{
				if(even<arr[i]) {
					even=arr[i];
				}
			}
			else
			{
				if(odd>arr[i]) {
					odd=arr[i];
				}
			}
		}
		int sod=even;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || i%2==0)
			{
				if(sev<arr[i]&&arr[i]!=even) {
					sev=arr[i];
				}
			}
			else
			{
				if(sod>arr[i] &&arr[i]!=odd) {
					sod=arr[i];
				}
			}
		}
		return sev+sod;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(LargeSmallSum(arr));

	}

}

/*
 * You are required to implement the following Function 

def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required 
to return the sum of second largest  element from the even positions and second smallest 
from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even

NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7

Sample Input

arr:1 8 0 2 3 5 6

Sample Output

8
 */
 