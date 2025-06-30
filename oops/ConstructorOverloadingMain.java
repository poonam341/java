package oops;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {

		ConstructorOverloading over= new ConstructorOverloading();
		System.out.println(over.volume());
		
		ConstructorOverloading over1= new ConstructorOverloading(10.5,20.0,30.25);
		System.out.println(over1.volume());
		
		
	}

}
