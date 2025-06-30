package inheritance;

/*     				 Parent
     					|
   					Child 						*/

class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog3 extends Animal2 {
    void bark() {
        System.out.println("The dog barks.");
    }
}



public class InheritanceSingle1 {

	public static void main(String[] args) {

		Dog3 d1 = new Dog3();
        d1.eat();   // Inherited from Animal
        d1.bark();  // Defined in Dog
	}

}
