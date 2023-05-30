package method;
//program foe nonstatic and static method in same class and also from diff class

public class mix1
{
	public static void main(String[] args) 
	{
		m1();
		mix2.m2();
		mix1 m1=new mix1();
		m1.m3();
		mix2 m2=new mix2();
		m2.m4();
	}
	public static void m1()
	{
		System.out.println("this is static method1 for same class");
		System.out.println("\n");
	}
	public void m3()
	{
		
		System.out.println("non static method for  same class");
		System.out.println("\n");
	}

}
