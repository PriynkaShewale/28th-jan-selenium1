package loops;

public class star2 

{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	

}



/*c 5 4 3 2 1
r 5 * * * * *
  4 * * * *         
  3 * * *       i   j
  2 * *         5   5 
  1 * 
 
 
*/