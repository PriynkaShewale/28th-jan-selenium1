package loops;

public class evendo 
{
	int i=1;
	public static void main(String[] args)
	{
		evendo ob=new evendo();
	
	do
	{
		if(ob.i%2==0)
		{
			System.out.println(ob.i);
		}
		
		ob.i++;
	}while(ob.i<=10);
	}

}
