package inheritance;

		/*					Parent
							/  |   \
						Child1 Child2 Child3 ...			*/

class Parents
{
	void display(int a)
	{
		System.out.println(a);
	}
	
}

class child1 extends Parents
{
	void show (int b)
	{
		System.out.println(b);
	}
}
class child2 extends Parents
{
	void display (int c)
	{
		System.out.println(c);
	}
}

class child3 extends Parents
{
	void print(int e)
	{
		System.out.println(e);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {

		child1 ch=new child1();
		ch.display(100);
		ch.show(200);
		
		child2 ch1=new child2();
		ch1.display(500);
		ch1.display(600);
		
		child3 ch2=new child3();
		ch2.display(800);
		ch2.print(900);
	}

}
