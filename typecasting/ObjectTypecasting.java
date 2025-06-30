package typecasting;

//type casting for Obects

	// example ----1

class parents {
	
	String name="john";
	
	void m1()
	{
		System.out.println("This is m1 from parents");
	}
}

class child extends parents
{
	int id=12345;
	
	void m2()
	{
		System.out.println("This is m2 from child class");
	}
}

public class ObjectTypecasting {

	public static void main(String[] args) {
		
		child ch=new child();
		System.out.println(ch.name); // parent
		ch.m1(); // parent
		System.out.println(ch.id); // child
		ch.m2(); // child	
		
		parents p = new child(); // UpTypecasting
		System.out.println(p.name); // parents
		p.m1(); // parents
		
		//System.out.println(p.id); // child class --we can not access
		//p.m2(); // child class --- we can not access
		
		
		
		

	}

}
