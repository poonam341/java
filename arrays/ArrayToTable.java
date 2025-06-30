package arrays;

public class ArrayToTable {
    public static void main(String[] args) {
        int[][] b = {
            {100, 200},
            {300, 400},
            {500, 600},
            {700, 800, 900}
        };

       // enhanced for loop example
    	
        for (int[] row : b) 
        {
            for (int cell : row) 
            {
                System.out.print(cell + "  ");
            }
            System.out.println();
        }
    }
}
