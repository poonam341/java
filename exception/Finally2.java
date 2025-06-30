package exception;

public class Finally2 {

	public static void main(String[] args) {

		System.out.println("Programme is started....");
		 String s = null;

	        try 
	        {
	            System.out.println(s.length());   
	        }
	        catch (Exception e) 
	        {
            System.out.println("Handle Exception.....");
            System.out.println(e.getMessage());
	        } 
	        finally 
	        {
	        	System.out.println("You enter to finally block......");
	        }
        System.out.println("Programme is Finished....");
	}

}
