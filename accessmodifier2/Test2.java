package accessmodifier2;
import accessmodifier.Test1;

/*public class Test2 extends Test1
{
	
	public static void main(String[] args) {
		
	Test1 t=new Test1();
		System.out.println(t.x); // Not possible becoz variable is private
		t.m1();  
		
		Test2 t2 = new Test2();
		System.out.println(t2.x);
		t2.m1();
	
	Test1 t=new Test1();
	System.out.println(t.x);
	t.m1();
	
	}
}*/

public class Test2 {
	
	public static void main(String[] args) {
		
		Test1 t=new Test1();
		System.out.println(t.x);
		t.m1();
		
	}
}
