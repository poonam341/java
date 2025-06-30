package operator;

public class DecrementOperators {

	public static void main(String[] args) {

	// case ----1 
		
		int a =10;
		System.out.println(a); 		//10
		
		a--; 						//a=a-1;
		System.out.println(a); 		//9
		
		// case ---2 -- post Decrement operator
				
		int b= 5;
		int res=b--;
		
		System.out.println(res); 			// 5 , 4
		System.out.println(b--); 			//4 , 3
		
		// case -3---- Pre-Decrement Operator
		
		int c= 10;
		int result=--c;
		
		System.out.println(result); 		// 9
		System.out.println(c); 				//9
		System.out.println(--c);			//8

	}

}
