package assignments;

public class SmallestOfNumber {

	public static void main(String[] args) {
		
		int a=99, b=80, c=30;
		
		if (a<b && a<c) {
			
			System.out.println("A is smallest number");  
			
		} else if (b<a && b<c) {
			
			System.out.println("B is smallest number");
		}
		else if (c<a && c<b) {
			
			System.out.println("C is smallest number");
			
		}
		else {
			
			System.out.println("invalid Number");
		}

	}

}
