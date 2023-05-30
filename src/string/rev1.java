package string;

public class rev1
{
	public static void main(String[] args)
	{
		
		String s1="madam";
		String s2="";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			count++;
		}
		if(count==1)
		{
			System.out.println("string is palindrom");
		}
		else 
		{
			System.out.println("not plalindrome");
		}
		
	}
	

}
