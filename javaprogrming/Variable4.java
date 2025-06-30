package javaprogrming;

public class Variable4 {
	
	int a=100; // Global variable
	static int b=300; // static Variable

	public static void main(String[] args) {
		
		String Name= "Poonam"; // local variable
		System.out.println(Name); // Poonam
		System.out.println(b);   // 300
		System.out.println(Variable4.b);// 300
		aMethod(); // 304
		Variable4.aMethod(); // 304
		Variable4 refname = new Variable4();
		System.out.println(refname.a); // 100
		
		refname.bMethod(); //200
		
		
		
	}
  public static void aMethod() {
	  
	  int R=304;
	  System.out.println(R); 
	  
  }
  
  public void bMethod() {
	   int U= 200;
	   System.out.println(U);//200
  }
}
