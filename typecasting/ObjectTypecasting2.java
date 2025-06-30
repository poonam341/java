package typecasting;

class Animal{}

class Dog extends Animal{}

class cat extends Animal {}



public class ObjectTypecasting2 {

	public static void main(String[] args) {
		
		// rule 1--conversion is valid or not
		// the type of 'd' and 'c' must have some relationship (either parent to child or child to parent)
		
		
		Animal an = new Dog();
		cat ct= (cat) an; // valid as per rule no. 1
		
		// rule 2 --- assignment is valid or not 
		// 'C' must be either same or child of 'A' 
		
	}

}
