package ProgramsOnPatternPinting;

public class A_One {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)			//01 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		System.out.println(1);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//02
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		System.out.println(2);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)		//03
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2!=0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println(3);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//04
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println(4);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//05
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println(5);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//06
		{
			char a='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		System.out.println(6);
		System.out.println("---------------------------------------");

		//		char a='A';
		for(char i='A';i<='E';i++)			//07
		{

			for(char j='A';j<='E';j++)
			{
				System.out.print(i+" ");

			}
			System.out.println();
			//			a++;
		}
		System.out.println(7);
		System.out.println("---------------------------------------");


		for(int i=1;i<=5;i++)			//08
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println(8);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//09
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(9);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//10
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(10);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//11
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(11);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//12
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(12);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//13
		{
			for(int j=1;j<=5;j++)
			{
				if(i!=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(13);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//14
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==5+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(14);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//15
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==5+1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println(15);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//16
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==5+1||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(16);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//17
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==5+1||i==j)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println(17);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//18
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(18);
		System.out.println("---------------------------------------");


		for(int i=1;i<=5;i++)			//19
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=5+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(19);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//20
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j||i==1||j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(20);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//21
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==5+1||i==5||j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(20);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//22
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=5+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(22);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//23
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(23);
		System.out.println("---------------------------------------");


		for(int i=1;i<=5;i++)			//24
		{
			char a='A';
			for(int j=1;j<=5;j++)
			{
				if(i+j<=5+1)
				{
					System.out.print(a+" ");
					a++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(24);
		System.out.println("---------------------------------------");


		for(int i=1;i<=5;i++)			//25
		{
			char a='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j||i>j)
				{
					System.out.print(a+" ");
					a++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(25);
		System.out.println("---------------------------------------");

		for(int i=1;i<=5;i++)			//26
		{
			char a='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j||i>j)
				{
					if(i%2==0)
					{
						System.out.print(j+" ");
						a++;
					}
					else
					{
						System.out.print(a+" ");
						a++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(26);
		System.out.println("---------------------------------------");


		for(int i=1;i<=5;i++)			//27
		{
			char a='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j||i>j)
				{
					if(i%2!=0)
					{
						System.out.print(j+" ");
						a++;
					}
					else
					{
						System.out.print(a+" ");
						a++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(27);
		System.out.println("---------------------------------------");

		char a='A';
		for(int i=1;i<=5;i++)			//28
		{

			for(int j=1;j<=5;j++)
			{
				if(i==j||i>j)
				{
					if(i%2!=0)
					{
						System.out.print(a+" ");

					}
					else
					{
						System.out.print(i+" ");

					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			a++;
			System.out.println();
		}
		System.out.println(28);
		System.out.println("---------------------------------------");






	}

}
