package stringMethods1;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// Mutable--- can change
		
		int a[]= {20,30,10,40,80,60};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);	
		System.out.println(Arrays.toString(a));// mutable we can change
	}

}
