package arrays;

public class TwoDientional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring an array and assigning the values
		
		// approach---1
		/*int a[][]= new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		// approach---2
		
		int b[][]= { {100,200},{300,400},{500,600},{700,800,900}};
		
		// find size of length
		
		//System.out.println("Length of and row:"+a.length);
		//System.out.println("Length of and columns:"+a[0].length);
		System.out.println("Length of and row:"+b.length);
		System.out.println("Length of and columns:"+b[3].length);
		
		// read single value from an array
		
		System.out.println(b[2][1]);
		
		// read all the values of an array
		
		for (int r=0; r<b.length; r++)
		{
			for(int c=0; c<b[r].length; c++)
			{
				System.out.print(b[r][c]+ "  ");
			}
			System.out.println();
		}		
		
		// enhanced for loop
		
		for( int arry[]:b)
		{
			for(int x:arry)
			{
				System.out.print(x+"  ");
			}		
			System.out.println();
		}
		
		
	}

}
