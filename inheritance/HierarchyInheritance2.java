package inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike rides");
    }
}

public class HierarchyInheritance2 {

	public static void main(String[] args) {

		Car c1=new Car();
		c1.start();
		c1.drive();
		
		Bike b1=new Bike();
		b1.start();
		b1.ride();

	}

}
