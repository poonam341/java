 package conditionalstatement;

public class LargestOf3Number {

	public static void main(String[] args) {

  /*
    a>b and a>c---- a is largest Number
    b>a and b>c ----b is largest number
    c>a and c>b ----c is largest number
   
   */
    int a=100, b=200, c=30;
    
    if(a>b && a>c) {
    	System.out.println("a is largest Number "+a);
    }
    else if (b>a && b>c) {
    	System.out.println("b is largest Number "+b);
    }
    else if (c>a && c>b) {
    	System.out.println("c is largest Number "+c);
    }
    else {
    	System.out.println("No largest Number");
    }
		
		
		
		
		
	}

}
