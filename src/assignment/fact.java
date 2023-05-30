package assignment;

public class fact
{
	int num=1;
	
public static void main(String[] args) 
{
	fact ob =new fact();
	for(int i=5;i>=1;i--)
	{
		ob.num=ob.num*i;
	}
	System.out.println(ob.num);
	
}

}
