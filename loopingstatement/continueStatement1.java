package loopingstatement;

public class continueStatement1 {

	public static void main(String[] args) {
		
		// skip the number of 3 ...5...9
		for (int i=1; i<=10; i++) 
		{
			if(i==3 || i==5 || i==9)
			{
				continue;
			}
			System.out.println(i);
		} 

	}

}
