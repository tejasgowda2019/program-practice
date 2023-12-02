package ProgramsOnString;

public class O_ToConcateUniqeElementOnly {

	public static void main(String[] args) {
		char []arr= {'a','p','p','l','e'};
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{	
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				s=s+arr[i];
			}
		}
		System.out.println(s);

	}

}
