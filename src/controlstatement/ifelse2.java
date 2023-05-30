package controlstatement;

public class ifelse2 {
	public static void main(String[] args)
	{
		int marks=76;
		if(marks>=65)
		{
			System.out.println("distinction");
		}
		else if(marks>=60 & marks<=64)
		{
			System.out.println("frist class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("second class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
