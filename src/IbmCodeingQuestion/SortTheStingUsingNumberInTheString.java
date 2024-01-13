package IbmCodeingQuestion;

/*
 * Given a String whcih contain enmplyee id employee name and employee email id
 * Sort the employess by comparing the employee id 
 * 
 *  example 
 *  number of record :- 
 *  
 *  input :-
 *  104 john    john2@example.com
102 alice   alice@example.com
103 bob     bob@example.com
101 john    john@example.com
105 claire  claire@example.com
	
	output:-
	101 john    john@example.com
102 alice   alice@example.com
104 john    john2@example.com
103 bob     bob@example.com
105 claire  claire@example.com
	
* */

import java.util.Scanner;

public class SortTheStingUsingNumberInTheString {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		ip.nextLine();
		String []arr=new String[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextLine();
		
		}
		for(int i=0;i<arr.length;i++)
		{
			String []arr1=arr[i].split(" ");
			for(int j=0;j<arr.length;j++)
			{
				
				String []arr2=arr[j].split(" ");
				if(Integer.parseInt(arr1[0])<Integer.parseInt(arr2[0]))
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
