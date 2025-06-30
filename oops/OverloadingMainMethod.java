package oops;

public class OverloadingMainMethod {
	
	void main (int a) 
	{
		System.out.println(a);
	}
	void main (String s) 
	{
		System.out.println(s);
	}
	
	void main (String s1, String s2) 
	{
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) 
	{ 
		OverloadingMainMethod ov=new OverloadingMainMethod();
				ov.main(10235);
				ov.main("Poonam");
				ov.main("Prasad", "Ranjeet");
	}
	
	

}
