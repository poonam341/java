package oops;

public class PolymorphismOverloadingMain {

	public static void main(String[] args) {


		PolymorphismOverloading overloading= new PolymorphismOverloading();
		
		overloading.sum(); //1 method
		overloading.sum(20, 50); //2 method
		overloading.sum(10.50, 50); //4 method
		overloading.sum(10, 50.56); // 3rd method
		overloading.sum(10,200, 20); // 5 method
		

	}

}
