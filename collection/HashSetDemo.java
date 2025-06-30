package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		
		HashSet myset = new HashSet();						// Store Heterogeneous data integer, string etc
		Set myset1=new HashSet(); 							// parent & child class -- allowed 
		HashSet <Integer> myset2 = new HashSet<Integer>(); 	// Store Homogeneous data
		
		// Adding data into HashSet
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome Poonam");
		myset.add('A');
		myset.add(null);
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add("john");
		
		// printing the HashSet element
		
		System.out.println(myset); // [null, A, 100, 10.5, Welcome Poonam, john, true]
		
		// find Size of HashSet
		System.out.println("Size of HashSet "+myset.size());
		
		// Remove specific element for HashSet
		myset.remove(10.5); // 10.5 is value not an index
		System.out.println("After removing element: "+myset); // [null, A, 100, Welcome Poonam, john, true]
		
		// inserting element in HashSet----- Not possible 
		// Access specific element --------- Not Possible
		
		// Convert HashSet into ArrayList
			ArrayList al= new ArrayList(myset);
			System.out.println(al);			//	[null, A, 100, Welcome Poonam, john, true]
			System.out.println(al.get(2));    //100
			
		// Read all the element from hashSet ----- using enhanced for loop	
			
			for (Object x:myset)
			{
				System.out.println(x);
			}
			// Read all the element from hashSet ----- using for loop -- Not Possible because of Indexing is not proper
			
			// Read all the element from hashSet ----- using Iterator for loop		
			
			Iterator <Object> it2= myset.iterator();
			
			while(it2.hasNext())
			
			{
				System.out.println(it2.next());
			}
			
			// clearing all the element from HashSet
			
			myset.clear();
			
			System.out.println(myset);
			System.out.println(myset.isEmpty());	
		
		


		
		
		
		
		
		

	}

}
