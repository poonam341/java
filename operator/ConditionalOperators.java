package operator;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		// conditional/ ternary Operator ?:
		// variable=expression ? result: result;
		
		// example1
		int a=200, b=100;
		
		int x= (a>b)? a:b;
		int y= (a<b)? a:b;
		
		System.out.println(x); //200
		System.out.println(y); //100
		
		//example2
		
		int z = (1==1)? 100: 200; 
		System.out.println(z);  // 100
		
		int p = (1==2)? 100: 200; 
		System.out.println(p);  //200
		
		//Example 3
		
		int person_age=30;
		String result= (person_age>=18)? "Eligible": "Not Eligible";
		
		System.out.println(result);
		
		

	}

}
