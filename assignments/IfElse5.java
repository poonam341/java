package assignments;

public class IfElse5 {

	public static void main(String[] args) {
		// WAP to find maximum between fIVE numbers

		//Marks Grades
		//Marks > 66 : Distinction
		//marks > 60 but marks < 66 : First Class
		//MArks > 50 but marks < 60 : Secnod class
		
		
		int marks = 51;
			if(marks >= 66) {
				System.out.println("You got Distrinction");
			}else if(marks >= 60 || marks < 55) {
				System.out.println("You got First class");
			}else if(marks >= 50 && marks < 60) {
				System.out.println("You got Second class");
			}else {
				System.out.println("You are fail");
			}
		}
	}


