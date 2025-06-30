package oops;

public class ConstructorOverloading {
	
	double width, height, depth;
	
	ConstructorOverloading() // 1 
	{
		width=0;
		height=0;
		depth=0;
		
	}
	ConstructorOverloading(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
		
	}
	
	ConstructorOverloading(double len)
	{
		width=len;
		height=len;
		depth=len;
		
	}
	double volume ()
	{
		return (width*height*depth);
	}
	}
	
	

