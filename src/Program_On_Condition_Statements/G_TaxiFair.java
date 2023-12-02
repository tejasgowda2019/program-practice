package Program_On_Condition_Statements;
/*
 * Taxi fair (t ->travel in km)
 * if t<=2  p=10;
 * if t<=5  for 2km 10rs only and after 20km  for every 1km=5
 * if t<=10 for 2km 10rs only and after 20km  for every 1km=5 and after 5 for every 1km= 10
 * if above 10km for 2km 10rs only and after 20km  for every 1km=5 and after 5 for every 1km= 10
 * then after 10km again for 1km p=15
 */
import java.util.Scanner;

public class G_TaxiFair {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int p;//
		if(a<=2)
		{
			p=10;
			System.out.println("Your price is: "+p);
		}
		else if(a<=5)
		{
			p=10+((a-2)*5);
			System.out.println("Your price is: "+p);
		}
		else if(a<=10)
		{
			p=10+(3*5)+((a-5)*10);
			System.out.println("Your price is: "+p);
		}
		else
		{
			p=10+(3*5)+(5*10)+((a-10)*15);
			System.out.println("Your price is: "+p);
		}
	}

}
