package stringsMethods;

public class ContainsStringMethod {

	public static void main(String[] args) {
		// contains()----return true/false
		// check string is part of main string or not
		
		String s ="Welcome";
		System.out.println(s.contains("Wel")); // true
		System.out.println(s.contains("come")); // true
		System.out.println(s.contains("wel"));// false
		System.out.println(s.contains("COME"));// false 
		

	}

}
