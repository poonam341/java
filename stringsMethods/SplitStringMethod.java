package stringsMethods;

import java.util.Arrays;

public class SplitStringMethod {

	public static void main(String[] args) {
		// split() *------split the string on multiple part in delimeter 
		// *  %  ^  & (  ) ----you cannot use as delimeter
		
		String s="abcd@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		// example 2 
		
		String amount ="$ 15, 20, 60,70";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		// example3
		
		String email= "abc,123@xyz";
		
		String arry[]=email.split(",");
		System.out.println(Arrays.toString(arry)); //[abc, 123@xyz]
		
		String arry2[]=arry[1].split("@");
		System.out.println(Arrays.toString(arry2));
				

	}

}
