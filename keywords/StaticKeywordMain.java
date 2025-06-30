package keywords;

public class StaticKeywordMain {

	public static void main(String[] args) {
		
		
			
			// static method can access static stuff directly without object

			System.out.println(StaticKeyword.a);
			StaticKeyword.m1();
			
			//System.out.println(b); // cannot access, b is non static variable
			//m2();   //cannot access,m2 is non static method
			
			
			// static method can access static stuff directly creatig  object
			StaticKeyword stkey= new StaticKeyword();
			System.out.println(stkey.b);
			stkey.m2();
			
			// non static method can access everything directly
			
			stkey.m();
		

	}

}
