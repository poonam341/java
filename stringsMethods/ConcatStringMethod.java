package stringsMethods;

public class ConcatStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// concat()-- joining strings
		
		String s = "welcome ";
		String s1="Hello Java ";
		String s2 = "Automation";
		s.concat(s1); 
		
		System.out.println(s.concat(s1));  // welcome hello java
		System.out.println(s+s1);
		
		/// multiple concat
		
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s+s1+s2);
		System.out.println(s.concat(s1+s2));
		
		System.out.println("Welcome"+"to java");
		System.out.println("Welcome ".concat("Automation"));

	}

}
