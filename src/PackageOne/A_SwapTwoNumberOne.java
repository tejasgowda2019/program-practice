package PackageOne;
/*
 * Swapping of two number with extra variable
 */
public class A_SwapTwoNumberOne 
{
	public static void main(String[] args) {
		int a=10;
		int b=45;
		int c=0;
		System.out.println("value of a and b before swapping ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("----------------------------------");
		 c=b;
		 b=a;
		 a=c;
		System.out.println("value of a and b after swapping ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
