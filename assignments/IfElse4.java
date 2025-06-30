package assignments;

public class IfElse4 {

	public static void main(String[] args) {
		
		//WAP to find maximum between Four numbers
		
			int a =30;
			int b = 22;
			int c=256;
			int d=56;
			
			if (a>b){
				if(a>c) {
					if(a>d) {
						System.out.println("A is Greter");
					}else {
						System.out.println("D is Greter");
					}
				}else {
					if (c>d) {
						System.out.println("C is Greter");
					}else {
						System.out.println("D is Greter");
					}
				}
			}else {
				if(b>c) {
					if(b>d) {
						System.out.println("B is Greter");
					}else {
						System.out.println("D is Greter");
					}
				}else {
					if (c>d) {
						System.out.println("C is Greter");
					}else {
						System.out.println("D is Greter");
					}
				}
				
			}

	}

}
