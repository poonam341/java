package assignments;

public class SwitchCase1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=0;
		
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplicaiton");
		int choice = 1;
		
		switch (choice) 
		{
		case 1 :
			c = a + b;
			System.out.println("Addition of two number is "+c);
		break;
		

		case 2 :
			 c = a - b;
			System.out.println("Subtraction of two number is "+c);
		break;
		
		case 3 :
			 c = a * b;
			System.out.println("Multiplication of two number is "+c);
		break;
		
		}
	}
		

	

}
