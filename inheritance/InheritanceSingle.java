package inheritance;

class A 							//---- Parents class 
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class B	extends A							 //parent B child class
{
	int b=200;
	void show() 
	{
		System.out.println(b);
	}
}


public class InheritanceSingle {
	
	public static void main(String[] args) {
		
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.display();
		obj.show();
		
	}

}
