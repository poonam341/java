package inheritance;

class Person {
    Person() {
        System.out.println("Person constructor");
    }

    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    Student() {
        super(); //					 optional - calls Person constructor
        System.out.println("Student constructor");
    }

    void study() {
        System.out.println("Student studies");
    }
}


public class InheritanceSingle2 {

	public static void main(String[] args) {

		 Student s = new Student();
	        s.speak();
	        s.study();

	}

}
