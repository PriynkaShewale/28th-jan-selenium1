package constructer;

public class userd

{
	int num1;
	int num2;
	userd()
	{
		num1=10;
		num2=13;
		
	}
	
	void add()
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) 
	{
		userd ob2=new userd();
		ob2.add();
		
	}

}
