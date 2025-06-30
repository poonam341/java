package arrays;

public class SearchingElementsInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int search_elements=300;
		boolean status=false;
		
		for (int i=0; i<a.length; i++)
		{
			if(a[i]== search_elements)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
			
		}
		
		if (status==false)
		{
		System.out.println("Element not found");
		}
	}

}
