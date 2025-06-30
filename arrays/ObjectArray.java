package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a[]= {10,10.5,'A',"Welcome", true};
		
		for (Object x:a)
		{
			System.out.println(x);
		}
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
