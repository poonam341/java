package stringsMethods;

public class EqualsStringMethod {

	public static void main(String[] args) {
		// equals()    equalsIgnoreCase()--- compare string
		
		String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("WELCOME"));
		

	}

}
