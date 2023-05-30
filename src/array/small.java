package array;
import java.util.Arrays;

public class small
{
	public static void main(String[] args)
	{
		int a[]= {10,2,5,7};
		System.out.println(a.length);
		System.out.println("----------------------");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("----reverse----------");
		for(int  i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
			Arrays.sort(a);
			System.out.println("-------asending order--------------");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}	
			System.out.println("-------------desending ---------------");
			
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
			  int max = a[0];  
		        //Loop through the array  
		        for (int i = 1; i < a.length; i++)
		        {  
		            //Compare elements of array with max  
		           if(a[i] > max)  //2>10
		               max = a[i];  
		        }  
		        System.out.println("lagest number is" +max);
			
		
		
	}

}
