package ProgramsOnPatternPinting;

public class Triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print("* ");

				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		int n1=5;
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if(i+j>=n1+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if(i+j>=5+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");

	}

}
