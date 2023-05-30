package inheritance;

public class sample1 extends sample2
{
	int a=20;
	void display()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		s1.display();
		
	}
}
