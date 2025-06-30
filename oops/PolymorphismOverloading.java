package oops;

public class PolymorphismOverloading {

	int a=10, b=20;
	
	void sum() 
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y) 
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y) 
	{
		System.out.println(x+y);
	}
	
	void sum(double y, int x) 
	{
		System.out.println(x+y);
	}

	void sum(int a, int b, int c) 
	{
		System.out.println(a+b+c);
	}
	
	}


