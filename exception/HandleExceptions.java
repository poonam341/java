package exception;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Programme is started....");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number    ");
		int num =sc.nextInt();
		try
		{
			
		System.out.println(100/num);// -------java.lang.ArithmeticException: / by zero
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data");
		}
		System.out.println("Programme is Completed....");
		System.out.println("Programme is exited....");

	}

}
