package inheritance;


class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal1 {
    void meow() {
        System.out.println("Cat meows.");
    }
}


public class HierarchyInheritance1 {

	public static void main(String[] args) {

		 Dog1 d = new Dog1();
	        d.eat();   // Inherited from Animal
	        d.bark();  // Dog-specific

	        Cat c = new Cat();
	        c.eat();   // Inherited from Animal
	        c.meow();  // Cat-specific

	}

}
