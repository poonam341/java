package operator;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// 3) Logical Operators && || !
		// always return boolean value -- true/false
		// works between 2 boolean values
		
		boolean x=true;
		boolean y= false;
		
		System.out.println(x&&y); 	//false (&&--and)
		System.out.println(x||y); 	//true  (||-- OR)
		System.out.println(!x); 	//false (! opposite of boolean values)
		System.out.println(!y); 	//True
		
		boolean bl= 10>20;
		System.out.println(bl); 	// false
		
		boolean b2=20>10;	
		System.out.println(b2); 		// true
		
		System.out.println(bl && b2); 	// false
		System.out.println(bl || b2); 	// true
		System.out.println(!bl);   		// true
		System.out.println(!b2);  		//false
		
	
		System.out.println((10<20) && (20>10)); // true
		System.out.println((10>20) && (20>10)); //false
		
		
	}

}
