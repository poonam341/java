package inheritance;

class bank
{
	double roi() 
	{
		return 0;
		
	}
}

class icici extends bank
{
	double roi() 
	{
		return 10.5;
		
	}
}

class SBI extends bank
{
	double roi() 
	{
		return 11.55;
		
	}
}




public class MethodOverridingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		icici ic=new icici();
		System.out.println(ic.roi());
		
		SBI sb=new SBI ();
		System.out.println(sb.roi());
	}

}
