package keywords;

class test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		
		//t.x=200; // incorrect becoz variable is applied final keyword so, modification is restrict
		
		System.out.println(t.x);
	}

}
