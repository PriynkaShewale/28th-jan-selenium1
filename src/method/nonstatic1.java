package method;

//non static method call in same class 

public class nonstatic1 

{
	
	
	public static void main(String[] args) 
	{
		
		nonstatic1 s1=new nonstatic1();                   //object of class 
		s1.method5(); //method cl using object of same class
		s1.method8();
		s1.method9();
		s1.method10();
		s1.method11();
		
		System.out.println("--------------------------------------");
		
		nonstaticd s2=new nonstaticd();              //object creation of diff class
		s2.method7();
		s2.method12();//method call using object
		s2.method13();
		s2.method14();
		s2.method15();
		
	}
	public void method5()
	{
		System.out.println("non static method in same class is called using object of that class in which main mehod and the method which is going to called is declaired ");
	}
	
	public void method8()
	{
		System.out.println("method is block of code which get execute whenevrer it is called");
	}
	public void method9()
	{
		
		System.out.println("method is to reuse the code");
	}
	public void method10()
	{
		System.out.println("their non static and static methods");
	}
	public void method11()
	{
		System.out.println("we can pass parametrt to method to give input to method at the time of calling");
	}

}
