package exception;

public class HandleExceptions2 {

	public static void main(String[] args) {

		   System.out.println("Programme is started....");

	        String s = null;

	        try 
	        {
	            System.out.println(s.length());    // This will throw NullPointerException
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Handle Exception.....");
	            System.out.println(e.getMessage());
	        } 
	        System.out.println("Programme is Finished....");

	}

}
