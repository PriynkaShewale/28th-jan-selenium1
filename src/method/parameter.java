package method;
//method using parameter

public class parameter
{
        public static void main(String[] args)
            {
        		add(10,20);          //static parameterised method in same class
        		sub(30,20);
        		parameter2.add1(5, 10);    //static parameterised mathod in diff class
        		parameter2.su1b(40,10 );
        		
        		
        		parameter p1=new parameter();           //non static parameterised method in same class
        		p1.add2(2,2);
        		p1.sub2(5, 3);
        		
        		parameter2 p2=new parameter2();    //non static method call from diff class
        		p2.add3(4, 4);
        		p2.sub4(4, 4);
        		studinfo("priyanka,",21,'A',65f);
	
            }
         public static void add(int a,int b)  //static method 
            {
        	 
        	 	System.out.println("addition is  "+(a+b));
             }
         public static void sub(int a,int b)
         	{
    	 
        	 	System.out.println("sub is  "+(a-b));
         	}
         public  void add2(int a,int b)
         	{
    	 
        	 	System.out.println("addition is  "+(a+b));
         	}
         public  void sub2(int a,int b)
         	{
	 
         		System.out.println("sub is  "+(a-b));
         	}
         
         //method using string char int float parameter
        public static void studinfo(String name,int rollno,char grade,float per)
          {
        	 System.out.println("name is  "+name+" roll no is  "+rollno+"grade is  "+grade+"percentage is  "+per);
        	 
           }
}

