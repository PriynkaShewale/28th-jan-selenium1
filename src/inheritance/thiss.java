package inheritance;

public class thiss extends demo1
{
	int a=10;
	void display()
	{
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args)
	{
		thiss ob=new thiss();
		ob.display();
		
	}

	
	
}
