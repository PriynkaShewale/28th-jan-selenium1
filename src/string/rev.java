package string;

public class rev 
{
	public static void main(String[] args)
	{
		String s1="priya";
		String s2="";
		//System.out.println(s1);
		//System.out.println(s1.length());
		for(int i=s1.length()-1;i>=0;i--)
			
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s1);
System.out.println("reversen is   "+s2);		
	}

}
