package assignments;

public class LargeOf2Numbers {

		public static void main(String[] args) {
			
        int a = 10;
        int b = 20;
        
        // Using ternary operator to find the largest number
        int largest = (a > b) ? a : b;
        
        // Output the largest number
        System.out.println("Largest number is: " + largest);
    }

}

