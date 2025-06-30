package javaprogrming;

public class VariableDemo1 {

	int a; // declaring the variable
	int b = 5;// defining the Variable
	int c = 10; // Global Variable
	static int d = 15; // static variable 
	
	public static void main(String[] args) {
	
		int e = 20; // local Variable 
     System.out.println(e); // calling a variable 
     
     // static member calling
     System.out.println(d); // 15
     System.out.println(VariableDemo1.d);// 15
     VariableDemo1.aMethod(); //25
     aMethod(); // 25
     
     
     //non static Member calling 
     VariableDemo1 refname = new VariableDemo1();
     System.out.println(refname.c);// 10 	// calling the global variable
     refname.bMethod();// 30 				// calling b Method which without static keyword
     
     
	}
	
     public static void aMethod() { // pre-defined Method with static keyword
    	 
    	 int f= 25; 
    	 System.out.println(f);
     }
     
     public void bMethod() { // pre-defind method without static keyword
    	 int j=30;
    	 System.out.println(j);
     }
}

