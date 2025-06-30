package operator;

public class IncrementOperators {

	public static void main(String[] args) {
		
		// ++ is called increment Operators
		
		// case ----1 
		
		int a =10;
		System.out.println(a); 		//10
		
		a++; 						//a=a+1;
		System.out.println(a); 		//11
		
		// case ---2 -- post Increment operator
				
		int b= 5;
		int res=b++;
		
		System.out.println(res); 			// 5 , 6
		System.out.println(b); 			//6 , 7
		
		// case -3---- Pre-increment Operator
		
		int c= 10;
		int result=++c;
		
		System.out.println(result); 		//11,10
		System.out.println(c); 				//11, 10
		System.out.println(++c);			//12,12
		
		
	}

}
