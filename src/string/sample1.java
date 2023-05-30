package string;

public class sample1
{
	public static void main(String[] args) 
	{
		String s1="priya";
		String s2="";
		String s3="i am ";
		String s4="software";
		String s5="SOFTWARE";
		
		System.out.print("length is  "); 
		System.out.println(s1.length());
		System.out.println(s2.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println("---------------------");
		
		System.out.println(s4.equals(s5));
	    System.out.println(s4.equalsIgnoreCase(s5));
	    System.out.println(s1.contains("i"));
	    System.out.println("----------------------");
	    System.out.println(s1.charAt(2));
	    System.out.println(s1.indexOf('r'));
	    System.out.println(s1.indexOf('a'));
	    System.out.println(s1.lastIndexOf('i'));
	    System.out.println("-----------------------------");
	    System.out.println(s4.toUpperCase());
	    System.out.println(s5.toLowerCase());
	    System.out.println(s3.concat(s1));
	    System.out.println("---------------------");
	    System.out.println(s3.startsWith("p"));
	    System.out.println(s3.startsWith("i"));
	    System.out.println(s3.endsWith("e"));
	    System.out.println(s1.endsWith("a"));
	    System.out.println("-----------------------------");
	    System.out.println(s1.substring(2));
	    System.out.println(s1.substring(2,4));
	    System.out.println(s1.replace("priya", "eira"));
	    System.out.println(s1);
		
	}

}
