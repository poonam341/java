package stringMethods1;

public class ReverseStringMethod {

	public static void main(String[] args) {
		
		// Approach 1 ------- length() ,  charAt()
		
		String s = "Poonam";
		String rev ="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is: "+ rev);
		
		
		// Approach-2 --------- without using string Method
		
		String s1= "Welcome";
		String rev1="";
		
		char a[]=s1.toCharArray();
		
		for(int i=a.length-1;i>=0; i--)
		{
			rev1=rev1+a[i];
		}
		
		System.out.println("Reverse string is: "+ rev1);
		
		// Approach-3-----using StringBuffer class''
		
		StringBuffer sb= new StringBuffer ("Welcome");
		
		System.out.println("Reverse string is:"+ sb.reverse());
		
		// Approach-4------- using StringBuilder class
		
		StringBuilder sb1= new StringBuilder ("Welcome");
		
		System.out.println("Reverse string is:"+ sb1.reverse());
		
	
		}
	

	}


