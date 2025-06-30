package arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// declaring an array
		// APrroach ---1
		int a[]=new int [5];
		
		// printing the lenght of an array
		
		System.out.println("Array value"+ a.length);
		
		// assigning or add the values into array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// Approach---2
		
		 int b[]= {100, 200, 300, 400, 500};
		 
		// find size of array
		 
		 System.out.println(a.length);
		 
		 
		// ready single data from an array

		  System.out.println(b[4]);
		 
		 // ready multiple data from an array
		 
		for (int i=0; i<b.length; i++) // i<=4   i<=b.length-1  i<5  i<b.lenght
		{
			System.out.println(a[i]); //100 200 300 400 500
		}
		
		// enhanced for loop / each loop
		
		for (int x:a)
		{
		System.out.println(x);	
		}
	}

}
