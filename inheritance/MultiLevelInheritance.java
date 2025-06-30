package inheritance;

class Animal {									// Parents Class
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {						//	1st child class----Dog Acquire Animal class
    void bark() {
        System.out.println("Dog barks");
    }
}
	
class Puppy extends Dog {						//	2nd Child class--- Puppy Acquire Dog and Animal class
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dog obj=new Dog();
		Puppy obj1=new Puppy();
		
		obj1.bark();
		obj1.eat();
		obj1.weep();
		
		
 
	}

}
