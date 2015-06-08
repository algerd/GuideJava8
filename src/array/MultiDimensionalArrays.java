
package array;

/**
 *
 * @author Alex
 */
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // declare a two dimensional array of int
        int[][] table;
        // A two-dimensional array of int with three rows and two columns can be created as shown:
        table = new int[3][2];
        table[0][1] = 32;
        table[2][0] = 71;
        /*
        The name of the two-dimensional array, table, refers to an array of three elements. Each element of the array
        is a one-dimensional array of int. The data type of table[0], table[1] and table[2] is an int array. The length of
        table[0], table[1] and table[2] is each 2.
        */
        int[] arr = table[1]; // raw 1
        /*
        You must specify the dimension of at least the first level array at the time you create a multi-dimensional array.
        For example, when you create a two-dimensional array, you must specify at least the first dimension, which is the
        number of rows. You can achieve the same results as the above code fragment as follows:
        table = new int[3][];
        */
        table = new int[3][]; // 3 row array
        //It is also possible to create a two-dimensional array with different number of columns for each row. 
        // Such an array is called a ragged array.
        table[0] = new int[2]; // Create two columns for row 1
        table[1] = new int[4]; // Create two columns for row 2
        table[2] = new int[3]; // Create two columns for row 3
        table[1][4] = 55;
        table[2][2] = 24;
        
        int[][] ra = new int[3][];
        ra[0] = new int[2];
        ra[1] = new int[1];
        ra[2] = new int[3];
        // Populate the ragged array using for loops
        for(int i = 0; i < ra.length; i++) {
            for(int j = 0; j < ra[i].length; j++){
                ra[i][j] = i + j;
            }
        }
        // Print the array using for loops
        for(int i = 0; i < ra.length; i++) {
            for (int j = 0; j < ra[i].length; j++){
                System.out.print(ra[i][j] + "\t");
            }
        // Add a new line after each row is printed
        System.out.println();
        }
        
        /*
        Initializing Multi-Dimensional Arrays
        */
        // This statement creates a two-dimensional array with three rows.
        int[][] ar = {
            {10, 20, 30}, 
            {11, 22}, 
            {222, 333, 444, 555}
        };
        // A zero-row and zero-column two-dimensional array
        int[][] empty2D = { };
        String[][] acronymList = {
            {"JMF", "Java Media Framework"},
            {"JSP", "Java Server Pages"},
            {"JMS", "Java Message Service"}
        };
        // You can initialize the elements of a multi-dimensional array at the time you create it.
        int[][] arr2 = new int[][]{{1, 2}, {3,4,5}};
        
        /*
        Array Declaration Syntax
        You can declare an array by placing brackets ([]) after the data type of the array or after the name of the array
        reference variable.
        */
        int[] empIds;
        int[][] points2D;
        int[][][] points3D;
        //Person[] persons;
        
        //is equivalent to
        int empIds1[];
        int points2D1[][];
        int points3D1[][][];
        //Person persons[];
        
        // Java also allows you to mix two syntaxes.
        int[] points2d[];
        
        //You can declare a two-dimensional and a three-dimensional array of int in one declaration statement as
        int[] pointss2D[], pointss3D[][];
        //or
        int[][] pointsss2D, pointsss3D[];
        
        /*
        Array Assignment Compatibility
            The value assigned to an element of an array must be assignment-compatible to its data type.
            The subclass object reference is always assignment compatible to the superclass reference variable. 
            Because the Object class is the superclass of all classes in Java, you can use an array of Object class to store objects of any class.
        */
        byte bValue = 10;
        float fValue = 10.5f;
        int[] sequence = new int[10];
        sequence[0] = bValue; // Ok
        //sequence[1] = fValue; // A compile-time error
        
        Object[] genericArray = new Object[4];
        genericArray[0] = new String("Hello"); // Ok
        //genericArray[1] = new Person("Daniel"); // Ok. Assuming Person class exists
        //genericArray[2] = new Account(189); // Ok. Assuming Account class exist
        genericArray[3] = null; // Ok. null can be assigned to any reference type
        
        String str = (String)genericArray[0]; // Ok
        //Person p = (Person)genericArray[1]; // Ok
        //Account a = (Account)genericArray[2]; // Ok
        
    }
        
    
}
