package stringsMethods;

public class ReplaceStringMethod {

	public static void main(String[] args) {
		// replace()-- replace single/multiple of character in a string
		
		String s= "Welcome to selenium java selenium python selenium c# python";
		System.out.println(s.replace('e', 'X')); // WXlcomX to sXlXnium java sXlXnium python sXlXnium c# python
		System.out.println(s.replace("selenium", "Plawright"));
		
		String s1 = "abcccdbaa";
		System.out.println(s1.replace('a', 'X').replace('c', 'y'));
		
		
		
	}

}
