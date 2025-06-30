package exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException123 {

	public static void main(String[] args) {
		// example --1

		System.out.println("Programme is started....");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number    ");
		int num =sc.nextInt();
		
		System.out.println(100/num);// -------java.lang.ArithmeticException: / by zero
		
		
		// example 2
		int a[]=new int[5];
		System.out.println("Enter the position.....(0-4)");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		a[pos]=value; 							// java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		
		System.out.println("Programme is Completed....");
		System.out.println("Programme is exited....");

	}

}
