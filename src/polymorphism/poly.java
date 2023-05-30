package polymorphism;
//compile time polymorphism
//ex.function overloading
public class poly
{
	public void add()
	{
		System.out.println(2+2);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		poly p1=new poly();
		p1.add();
		p1.add(3,3 );
		p1.add(4,4,4);
		
	}

}
