package keywords;

public class SuperKeyword {
	
	String colour="white";
	void eat()
	{
		System.out.println("eating");
	}
	    
	}

	class Dog extends SuperKeyword 
	{
	    String colour="Black";
	    void displaycolour()
	    {
	    	System.out.println(super.colour);
	    }
	    void eat()
		{
		System.out.println("eating bread");
	    	super.eat();
		}
	}


