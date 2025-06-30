package methods;

public class Greetings {
	
	
	//  No Parameter      no return value
	
	void m1()
	{
		System.out.println("Hello");
	}
	
//  No Parameter       return value
	
	String m2() {
		
		return "Hello how r you?";
}
	
	
//  Takes Parameter      no return value
	void m3(String name){
		
		System.out.println("hello Java"+ name);
		
	}
	
	// take parameter    return value
	
	String m4(String name)
	{
		return ("hello Java"+ name);
	}	
	
	
}
