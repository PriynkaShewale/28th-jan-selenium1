package constructer;

public class multiple
{
	int num1;
	int num2;
	String name;
	int num3;
	int num4;
	multiple()
	{
		num3=10;
	    num4=5;
	}
	multiple(int a,int b)
	{
		num1=a;
		num2=b;
	}
	void add()
	{
		System.out.println(num1+num2);
		
	}
	void mult()
	{
		System.out.println(num3*num4);
	}
	public static void main(String[] args)
	{
		multiple ob4=new multiple(2,2);
		ob4.add();
		multiple ob5=new multiple();
		
		//ob4.mult();
		ob5.mult();
		
	}
	

	
	
}
