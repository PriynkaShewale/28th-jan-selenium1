package controlstatement;

public class assignment1
{
	public static void main(String[] args)
	{
		int SA=500;
		if(SA>=500)
		{
			
			System.out.println("you are eligible for free dilivery");
			if(SA>=10000)
			{
				System.out.println("you have 10% discount on total shopping ammount");
			}
			else
			{
				System.out.println("shop for 10000 or more for 10% discount");
			}
		}
		
		else
			  {
				System.out.println("you are not eligible for dilivery charges will applied ");
				System.out.println("shop for rs.500 or more for free dilivery");
		      }
		
	}

}
