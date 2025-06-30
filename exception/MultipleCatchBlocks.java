package exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		   System.out.println("Programme is started....");

	        String s = null;

	        try {
	            System.out.println(s.length());    // This will throw NullPointerException
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Handle Exception.....");
	            System.out.println(e.getMessage());
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Handle Exception.....");
	            System.out.println(e.getMessage());
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Handle Exception.....");
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Programme is Finished....");
	    }

}
