package IbmCodeingQuestion;

import java.util.Scanner;

/*
 * For an array arr of n positive integers, count the unordered pairs (i, j)
 *  (0 <=i< j< n) where arr[i] XOR arr[j]> arr[i] AND arr[j].
 *   XOR denotes the bitwise XOR operation and AND denotes the bitwise AND operation.
 *   
Example

Given n = 4, arr = [4, 3, 5, 2]. All unordered pairs (i, j) are:-

Indices XOR AND XOR> AND 
(0,1)    7   0    True
(0,2)    1   4    False
(0,3)    6   0    True
(1,2)    6   1    True
(1,3)    1   2    False
(2,3)    7   0    True

For the first line:
⚫ arr[0] = 4, arr[1] = 3

• 4 XOR 3=7

• 4 AND 3=0

•7>3
 * */

public class BitWiseXORandAND {

	public static void ans(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int v1=arr[i]^arr[j];
				int v2=arr[i]&arr[j];
				if(v1>v2)
				{
					System.out.println(true);
				}
				else
				{
					System.out.println(false);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int s=ip.nextInt();
		int []arr=new int[s];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		ans(arr);
	}
}
