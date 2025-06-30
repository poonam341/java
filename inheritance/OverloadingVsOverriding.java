package inheritance;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a) // overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b) // overloading
	{
		System.out.println(a+b);
	}
}


public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 XYZ obj=new XYZ();
 obj.m1(10);
 obj.m2(20);
 obj.m2(5, 6);
		 
	}

}
