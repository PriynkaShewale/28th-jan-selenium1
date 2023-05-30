package assignment;

public class thisk
{
	int a=2; static int b=3;
	void display()
	{
		int a=5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		thisk k=new thisk();
		k.display();
		System.out.println(b);
		
	}
	

}
