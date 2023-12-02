package AccentutrePreviourCodingQuestion;

import java.util.Scanner;

public class G_Seveen {

	public static int ProductSmallestPair(int sum,int []arr,int n)
	{
		if(n<2)
		{
			return -1;
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int p=arr[0]+arr[1];
		if(p<=sum)
		{
			return arr[0]*arr[1];
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int sum=ip.nextInt();
		int n=ip.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		System.out.println(ProductSmallestPair(sum,arr,n));

	}

}

/**
 * Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the 
function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are 
the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element 
of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, 
output is 2

Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21
 */