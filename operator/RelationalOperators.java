package operator;

public class RelationalOperators {

	public static void main(String[] args) {

				// 2) Relation Operators > >= < <= != ==
				// always return boolean value -- true/false
		
				int a=20, b=10;
				// boolean result = a>b;
				System.out.println(a>b); 	 	//true
				System.out.println(a<b); 	 	//False
				System.out.println(a>=b);   	//True
				System.out.println(a<=b);   	//False
				System.out.println(a!=b); 		// True
				System.out.println(a==b);		//False
				b=20;
				System.out.println(a<=b); 		// true
				System.out.println(a>=b); 		// true
				System.out.println(a!=b);       // False
				System.out.println(a==b); 		// True

	}

}
