package stringsMethods;

public class TrimStringMethod {

	public static void main(String[] args) {
		// trim()...... it remove the space right and left side
		
		String s = "   Welcome   ";
		
		System.out.println(s); // print string along with spaces
		System.out.println("Before triming "+ s.length()); 
		System.out.println(s.trim());
		System.out.println("After triming "+s.trim().length()); 
		

	}

}
