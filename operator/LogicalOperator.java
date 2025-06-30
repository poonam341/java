package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean x= true;
boolean y= false;

System.out.println(x&&y);  // false
System.out.println(x||y);	// true
System.out.println(!x);		// false
System.out.println(!y);		// true

boolean b1= 10>20;

System.out.println(b1); // false

boolean b2 = 20>10;

System.out.println(b2);  // true

System.out.println(b1 && b2); // false
System.out.println(b1 || b2);	// true
System.out.println(!b2);	// false
System.out.println(!b1);	// true



	}

}
