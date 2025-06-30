package keywords;

public class StaticKeyword {
	
	static int a=10; /// static variable
	int b=20; // non static variable
	
	static void m1() // static method
	{
		System.out.println("this m1 static metho");
	}
	
	void m2() // non static method
	{
		System.out.println("this m2 non static method");
	}
	
	void m()// non static method can access everything directly
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	/*public static void main(String[] args) {
		
		// static method can access static stuff directly without object

		System.out.println(a);
		m1();
		
		//System.out.println(b); // cannot access, b is non static variable
		//m2();   //cannot access,m2 is non static method
		
		
		// static method can access static stuff directly creatig  object
		StaticKeyword stkey= new StaticKeyword();
		System.out.println(stkey.b);
		stkey.m2();
		
		// non static method can access everything directly
		
		stkey.m();
	}*/

}
