package arrays;

import java.util.Scanner;

public class InputFromTheConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int num = sc.nextInt();
		System.out.println("Given number "+num);
		
		
		System.out.println("Enter the Decimal NUmber");
		double num1 = sc.nextDouble();
		System.out.println("Given number "+num1);
		
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Your City "+city);
	}

}
