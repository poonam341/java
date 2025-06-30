package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
	  	Map  hm1=new HashMap();     // parent & child class -- allowed
		HashMap hm2=new HashMap(); 	// Syntax
			
		// adding Pairs (Key-Values) in HashMap
		HashMap <Integer, String> hm=new HashMap<Integer, String>(); 
		hm.put(101, "ABCD");
		hm.put(102, "PQR");
		hm.put(103, "XYZ");
		hm.put(104, "Poonam");
		hm.put(101, "John");
		hm.put(105, "PQR");
		
		// printing the HashMap
		System.out.println(hm); //{101=John, 102=PQR, 103=XYZ, 104=Poonam, 105=PQR}
		
		//size of hashmap
		System.out.println("Size of HashMap:"+hm.size());
		
		//Remove Pairs 
		hm.remove(105);  // 105 is Key of the pair 
		System.out.println("After removing pair HashMap:"+hm); // {101=John, 102=PQR, 103=XYZ, 104=Poonam}
		
		// Access value of particular Key
		System.out.println(hm.get(104)); // 104 is key of the pair -- Poonam
		
		// get all the keys from HashMap
		System.out.println(hm.keySet());  // [101, 102, 103, 104]
		
		// get all the Values from HashMap
		System.out.println(hm.values());   //[John, PQR, XYZ, Poonam]
		
		// Get  Key-Value Pair
		System.out.println(hm.entrySet()); // [101=John, 102=PQR, 103=XYZ, 104=Poonam]
		
		// Reading data from HashMap------using for loop -- Not Possible because of Indexing is not proper
		
		// Reading Data from HashMap ----- Using Enhanced for loop 
		
		for (int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		
		// Reading Data from HashMap ----- Using Iterator
		
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) 
		{
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		// clearing all the element from HashMap
		
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());	
				
	}

}
 