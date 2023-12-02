package Program_On_LoopingStatement;
/*
 * 0=0 0+1=1  1+1=2  1+2=3  2+3=5  3+5=8=............. 
 */
public class W_FibonosisSeries {

	public static void main(String[] args) {
		int n=0;
		int n1=1;
		int n2=0;
		while( n<200)
		{
			System.out.println(n);
			n2=n+n1;
			n=n1;
			n1=n2;
		}
		
		System.out.println("-----------------------------");
//		for(int i=1;i<=10;i++)
//		{
//			for(int j=11;j<=20;j++)
//			{
//				if(j==15)
//				{
//					break;
//				}
//				else
//				{
//					System.out.println(i);
//				}
//			}
//			System.out.println("hello");
//		}

	}

}
