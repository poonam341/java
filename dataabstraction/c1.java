package dataabstraction;

public class c1 extends C2 implements InterfaceDemo1, InterfaceDemo2  
{
	 public void m1()
	{
		System.out.println(x);
	}
	 
	 public void m6()
		{
			System.out.println(y);
		}
	 

	public static void main(String[] args) {

		c1 obj=new c1();
		obj.m1();
		obj.m6();
		obj.m3();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
