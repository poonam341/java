package exception;

public class NumberFormatException {

	public static void main(String[] args) {
				
		System.out.println("Programme is started....");
		
		String s="Welcome";
		int sint = Integer.parseInt(s); // NumberFormatException
		System.out.println(sint); 

		System.out.println("Programme is Completed....");
		System.out.println("Programme is exited....");
	}

}
