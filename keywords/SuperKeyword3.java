package keywords;

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dogge extends Animal {
    Dogge() {
        super();  // Calls Animal constructor
        System.out.println("Dog constructor called");
    }
    

	public static void main(String[] args) {

Dogge dg=new Dogge();



	}

}
