package constructer;

public class staticv 
{
	
	int rolll_no;
	String name;
	static  String prici;
	void data()
	{
		System.out.println(rolll_no);
		System.out.println(name);
		System.out.println(prici);
	}
	public static void main(String[] args) 
	{
		staticv s1=new staticv();
		s1.rolll_no=1;
		s1.name="priya";
		staticv.prici="pawar";
		s1.data();
		//s2.rolll_no=2;
		//s2.name="eira";
		staticv.prici="sonawane";
		staticv s2=new staticv();
		s2.data();
		
	}

}
