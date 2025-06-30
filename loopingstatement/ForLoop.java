package loopingstatement;

public class ForLoop {

	public static void main(String[] args) {
		// 1 to 10 print
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		// 1 to 10 even number
		
		for (int i1=2; i1<=10; i1+=2)

		{
			System.out.println(i1);
		}
	
		// example --3
		
				/* 1---odd
				 * 2---even
				 * 3---odd
				 * -----
				 * 10---even
				 */
	
		for(int i2=1; i2<=10; i2++)
		{
			if(i2%2==0) 
			{
				System.out.println(i2 + "Even Number");
			}else 
			{
				System.out.println(i2 + "odd number");
			}
		}
			
	
	
	
	
	
	}
	

}
