package Program_On_Recusive;

public class A_PrintOneTo10UsingeRecursiveFunction {

	static int i=1;
	static void ten(int n)
	{
		if(i<=n)
		{
			System.out.println(i);
			i++;
			ten(n);
		}
	}
	public static void main(String[] args) {
		ten(10);

	}

}
