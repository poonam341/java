package methods;

public class GreetingMainMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greetings gr=new Greetings();
		gr.m1(); //No Parameter      no return value
		
		String s=gr.m2();	
		System.out.println(s);
		
		gr.m3("John");
		
		String var=gr.m4("Poonam");
		System.out.println(var);
		
	}

}
