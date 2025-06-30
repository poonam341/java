package dataabstraction;

interface shape
{
	int lenght = 10; // final and staticvariable
	int width = 20; // final and staticvariable
	
	void circle(); // abstract Method ---
	
	default void Square ()   // default Method
	{
		System.out.println("this is square....--Default Method");
	}
	
	static void rectangle() // static Method
	{
		System.out.println("this is rectang=le- Static Method");
	}
}

public class InterfaceDemo implements shape

{
	public void circle()
	{
		System.out.println("This is circle.....-- Abstract Method");
	}
	
	void trinagle()
	{
		System.out.println("this is triangle------ Own method");
	}
	
	 int x=100, y=200;
	 
	public static void main(String[] args) {
		
		// scenario-1
		
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle(); // abstract method
		idobj.Square(); // default Method
		shape.rectangle();// static method can directly access/call from interface
		idobj.trinagle();
		System.out.println(idobj.x+idobj.y);
		
		// Scenario 2
		shape sh=new InterfaceDemo();
		sh.circle(); //  abstract method
		sh.Square(); //default Method
		shape.rectangle(); //static method can directly access/call from interface
		//sh.triangle(); ------- we can not access Becoz it's belong to class not interface
		
		System.out.println(shape.lenght * shape.width); // acessing satatic variable directly
		//System.out.println(sh.x+sh.y);  ------- we can not access Becoz it's belong to class not interface
	}

}
