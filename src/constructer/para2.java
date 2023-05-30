package constructer;

public class para2
{
	int a;
	int b;
	para2(int c,  int d)
	{
		a=c;
		b=d;
		
	}
	void mult()
	{
		System.out.println(a*b);
		
	}
	public static void main(String[] args)
	{
		para2 ob3=new para2(2,5);
		ob3.mult();
		
	}

}
