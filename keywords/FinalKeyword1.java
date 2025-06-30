package keywords;

class ABC 
{
	final void m()
	{
		System.out.println("This is m method from test");
	}
}

class test2 extends ABC
{
	//void m() //------incorrect becoz variable is applied final keyword so, modification is restrict
	{
		System.out.println("This is m method from test2****");
	}
}

public class FinalKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
