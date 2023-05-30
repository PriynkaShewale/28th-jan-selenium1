package constructer;

public class parameterc 
{
	
	int a;
	int b;
	parameterc(int c,int d)
	{
		a=c;
		b=d;
		
	}
	void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		parameterc ob3=new parameterc(5,5);
		ob3.add();
		
	}
	

}
