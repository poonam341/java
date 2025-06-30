package assignments;

public class IfElse3 {

	public static void main(String[] args) {
		// WAP to find maximum between Three numbers
		
		int a = 12;
		int b = 16;
		int c = 15 ;
		
		if (a>b){
			if(a>c) {
				System.out.println("A is Greater");
			}else {
				System.out.println("C is Greater");
			}
		}else {
			if(b>c) {
				System.out.println("B is Greater");
			}else {
				System.out.println("C is Greater");
			}
		}

	}

}
