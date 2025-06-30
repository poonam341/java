package exception;

public class Finally {

	public static void main(String[] args) {

		try 
		{
		    int x = 5;
		    System.out.println("x = " + x);
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception caught");
		} 
		finally 
		{
		    System.out.println("Finally block executed");
		}
	}

}
