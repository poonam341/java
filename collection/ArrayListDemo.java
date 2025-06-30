package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oops.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {

		// declaration 
/*		List mylist1=new ArrayList();							//  parent & child class -- allowed 
		ArrayList mylist=new ArrayList(); 						// Store Heterogeneous data integer, string etc
		ArrayList <Integer> mylist2=new ArrayList<Integer>();	 // Store Homogeneous data 
		ArrayList <String> mylist3=new ArrayList<String>();		// Store Homogeneous data
		ArrayList <Employee> mylist4=new ArrayList<Employee>(); // Store Employee type of data 
*/
		// Adding data into ArrayList 
		
		ArrayList mylist=new ArrayList(); 
		
		mylist.add(123);
		mylist.add(10.5);
		mylist.add("Welcome to Home");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(123);
		mylist.add(null);
		
		// Find size of ArrayList
		
		System.out.println("Size of an ArrayList:"+mylist.size()); // 8
		
		
		// Printing an ArrayList data	
		System.out.println("Printing data of ArrayList:"+mylist); //[123, 10.5, Welcome to Home, A, true, null, 123, null]
		
		// Remove one of the element from ArrayList  
		
		System.out.println(mylist.remove(6)); // here 6 is index of element 
		System.out.println("After Revoming Printing data of ArrayList:"+mylist); //[123, 10.5, Welcome to Home, A, true, null, null]
		
		// insert element in ArrayList
		
		mylist.add(2, "Poonam");
		System.out.println("After insertion Printing data of ArrayList :"+mylist); // [123, 10.5, Poonam, Welcome to Home, A, true, null, null]
		
		// Modify/change the element in the ArrayList
		
		mylist.set(0, "java");
		System.out.println("After Modification Printing data of ArrayList :"+mylist);// [java, 10.5, Poonam, Welcome to Home, A, true, null, null]
		
		// Access the specific elements from ArrayList
		System.out.println(mylist.get(3));  // here 3 is a index---Welcome to Home
		
		// Reading all the elements from An ArrayList
		
				// Approach ---1 ----- Using normal for loop
		
		for (int i =0; i<=mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}
		
				// Approach ---2 ----- Using enhanced for loop
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
			
				// Approach --- 3 ----- Using Iterator 
		
			Iterator it =mylist.iterator();
			
			
			while(it.hasNext())
			{
			System.out.println(it.next());
			}
			
			//Checking ArrayList is empty or not 
			System.out.println("Is arraylist is empty? "+ mylist.isEmpty());
			

			// Remove multiple the element from ArrayList randomly
			
			ArrayList mylist2=new ArrayList();
			
			mylist2.add(10.5);
			mylist2.add("Welcome to Home");

			
			mylist.removeAll(mylist2);
			System.out.println("After removing multiple Element"+mylist); // [java, Poonam, A, true, null, null]
			
			// Remove all the element/clear from ArrayList 

			mylist.clear();
			System.out.println("Is arraylist is empty? "+ mylist.isEmpty());
			
		}

}
