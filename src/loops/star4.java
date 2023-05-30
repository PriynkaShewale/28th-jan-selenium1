package loops;

public class star4
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int k=9;k>=i;k--)
			{
				System.out.println("");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
					
	       System.out.println("");
		}
		
	}

}
