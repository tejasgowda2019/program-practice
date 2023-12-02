package ProgramsOnString;
import java.util.Scanner;
/* to print uniue element only
 * i/p-->hello
 * o/p-->heo
 * 
 * i/p-->tejas gowda
 * o/p-->tejas gowd
 */

public class K_PintUniqeOrNonRepeatedElement {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String s1=s;
		String uniqe="";
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))//&&s.charAt(i)!=' '-->if space is not necessary
				{
					c++;
				}
			}
			if(c==1)
			{
				uniqe=uniqe+s.charAt(i);
			}
		}
		System.out.println(uniqe);

	}

}
