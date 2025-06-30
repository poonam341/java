package wrapperclass;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		// ------------------ Scenario 1 -------------------------------

		// String -------> Int
		
		//String s="Welcome"; // cannot convert into int
		
		String s="123456";
		int sint=Integer.parseInt(s);
		System.out.println(sint);
		
		String s1 = "10";
		String S2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(S2));
		
		// String -----> double
		
		String s3="10.25";
		String s4="20.356";
		double sdou=Double.parseDouble(s3);
		System.out.println(sdou);
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		// String -----> boolean
		
		String s5= "Selenium"; // other than true, if you pass any string that will return false
		boolean sboo=Boolean.parseBoolean(s5);
		System.out.println(sboo);
		System.out.println(Boolean.parseBoolean(s5));
		
		// ------------------ Scenario 2 -------------------------------

		// int, double, boolean, char-------> String
		
		int a = 10;
		double b =10.5;
		boolean boo=true;
		char ch='A';
		
		String s6=String.valueOf(a);
		System.out.println(s6);
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(boo));
		System.out.println(String.valueOf(ch)); 
		
		
		

	}

}
