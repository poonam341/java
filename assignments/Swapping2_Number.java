package assignments;

public class Swapping2_Number {

	public static void main(String[] args) {
		
		// Program to swap a numbers with Third Variable
		
		int a=10;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		//Program to swap a numbers without using Third Variable
		
		int p = 10 ;
		int r = 20 ;
		p = p + r ;
		r = p - r;
		p = p- r;
		System.out.println(p);
		System.out.println(r);
	
	
	//OR 
	
	    int f = 10;
	    int e = 20;
		f = f * e;
		b = f/e;
		f = f/e;
		System.out.println(f);
		System.out.println(e);
	
}

}