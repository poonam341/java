package loopingstatement;

public class WhileLoop3 {

	public static void main(String[] args) {

		// print even number between 1 to 100
		// Approach--1
		int i=2;
		
		while (i<=100) {
			
			System.out.println(i);
			
			i+=2;
		}
		
		// Approach--2
		
		int i1=1;
		
		while (i1<=10) 
		{
			if (i1%2==0) 
			{
				System.out.println(i1);
			}
			i1++;
		}
		
		// approach--3
		
		/* 1---odd
		 * 2---even
		 * 3---odd
		 * -----
		 * 10---even
		 */
	
		int i2=1;
		
		while(i2<=10) 
		{
			if(i2%2==0)
			{
				System.out.println(i2 + " Even" );
			}else 
			{
				System.out.println(i2+ " Odd"); 
			}
			i2++;
		}
		
		// example print descending order from 10 to 0
		
		int i4=10;
		
		while(i4>0) 
		{
			System.out.println(i4);
			i4--;
		}
		
		
	}

}
