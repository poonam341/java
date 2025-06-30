package inheritance;

//Base class
class Person5 {
 void walk2() {
     System.out.println("Person walks.");
 }
}

//Derived class
class Student5 extends Person5 {
 void study2() {
     System.out.println("Student studies.");
 }
}

//Further derived class
class CollegeStudent extends Student5 {
 void attendLecture() {
     System.out.println("College student attends lecture.");
 }
}

public class MultiLevelInheritance1 {

	public static void main(String[] args) {

		CollegeStudent cs = new CollegeStudent();
        cs.walk2();           // from Person
        cs.study2();          // from Student
        cs.attendLecture();  // from CollegeStudent

	}

}
