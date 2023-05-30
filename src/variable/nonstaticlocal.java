package variable;


public class nonstaticlocal

{
	static int e=6;
	int c=3;//nonstatic global varible 
	public static void main(String[] args)
	{
		System.out.println(nonstatic2.g);//static global varible cl from diff class
		System.out.println(e);//static global variable call from same class
		nonstaticlocal ob=new nonstaticlocal();
		ob.add();
		System.out.println(ob.c);//nonstatic global varible cl from same class
		
		nonstatic2 ob2=new nonstatic2();
		System.out.println(ob2.d);//non static global var cl from diff class
		
	}

	void add()//nonstatic local varible call in same class using method
	{
		
		int a=2;
		int b=3;
		System.out.println(a);
		System.out.println(b);
		
	}
}
