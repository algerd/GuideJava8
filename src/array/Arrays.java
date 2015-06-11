
package array;

/**
 * An array is a fixed-length data structure to store data items of the same type. 
 * All elements of an array are stored contiguously in memory.
 * Remember that every array is an object!!!
 * The length of an array cannot be modified after it has been created. If you need to modify the
 * length of an array, you must create a new array and copy the elements from the old array to the new array.
 * @author Alex
 */
public class Arrays {
    
    // Magic numbers are not supposed to be changed It can be look up though
    private int[] magicNumbers = {5, 11, 21, 51, 101};
    
    public static void main(String[] args) {
        // array declarations:
        float[] salary;
        int[] counter;
        String[] name;     
        //Employee[] emp; // emp can hold multiple references to Employee objects
        
        // array initialization
        salary = new float[]{4.4f, 3.6f};
        counter = new int[2];
        counter[0] = 5;
        counter[1] = 7;
        name = new String[]{"John", "Kate"};
        
        /*
        Creates an array object of type ArrayDataType of ArrayLength length
            new ArrayDataType[ArrayLength];
        The new operator will return an object reference of array type.
        */
        int[] id = new int[5];
        
        //You can also use an expression to specify the length of an array while creating the array.
        int total = 23;
        int[] array1 = new int[total];      // array1 has 23 elements
        int[] array2 = new int[total * 3];  // array2 has 69 elements
        
        //Accessing Array Elements
        id[0] = 5;
        id[2] = 10;
        // id[5] = 8; // runtime error: you refers to the sixth element, which is non-existent.
        
        // Length of an Array
        int length = id.length;
        for (int i = 0 ; i < length; i++) {
            id[i] = (i + 1) * 10;
        }
        // id.length = 10; // error: length is final property of object
        
        /*
        Array elements are always initialized irrespective of the scope in which the array is created. Array elements of
        primitive data type are initialized to the default value for their data types. For example, the numeric array elements are
        initialized to zero, boolean elements to false, and the reference type elements to null
        */ 
        int[] intArray = new int[3];// intArray[0], intArray[1] and intArray[2] are initialized to zero by default.      
        boolean[] bArray = new boolean[2];// bArray[0] and bArray[1] are initialized to false.
        String[] strArray = new String[2];// An example of a reference type array. strArray[0] and strArray[1] are initialized to null.
        
        //Person[] person = new Person[100];// Another example of a reference type array. All 100 elements of the person array are initialized to null.
        
        /*
        Explicit Array Initialization
        */    
        int[] empId1 = {1, 2, 3, 4, 5};      // Initialize the array at the time of declaration
        int[] empId2 = {1, 2, 3, 4, 5, };    // A comma after the last value 5 is valid.
        int[] empId3 = new int[]{1, 2, 3, 4, 5}; // Alternatively
        int[] emptyNumList = { };   // empty array
        // For a reference type array, you can specify the list of objects in the initialization list.
        String[] name1 = {new String("Sara"), new String("Truman")};
        String[] name2 = {"Sara", "Truman"};
        //Account[] ac = new Account[]{new Account(1), new Account(2)};
        
        /*
        You can copy array elements from one array to another in two ways: 
            - Using a loop
            - Using the static arraycopy()method of the java.lang.System class
        */
        // Copy data array to new arrays using loop
        int[] data = {1, 2, 3, 4, 5 };  
        int[] eData = expandArray(data, 7); // Expand the data array to 7 elements      
        int[] tData = expandArray(data, 3); // Truncate the data array to 3 elements
        System.out.println("Using for-loop...");
        System.out.println("Original Array: " + java.util.Arrays.toString(data));
        System.out.println("Expanded Array: " + java.util.Arrays.toString(eData));
        System.out.println("Truncated Array: " + java.util.Arrays.toString(tData));
        
        // Copy data array to new arrays using arraycopy()method of the java.lang.System class
        eData = new int[9];
        tData = new int[2];
        System.arraycopy(data, 0, eData, 0, 5);
        System.arraycopy(data, 0, tData, 0, 2);
        System.out.println("Using System.arraycopy() method...");
        System.out.println("Original Array: " + java.util.Arrays.toString(data));
        System.out.println("Expanded Array: " + java.util.Arrays.toString(eData));
        System.out.println("Truncated Array: " + java.util.Arrays.toString(tData));
        
        /*
        The Arrays class is in the java.util package. It contains many convenience methods to deal with arrays.
        For example, it contains methods for converting an array to a string format, sorting an array, etc.
        */
        
        /*
        The clone() method can be used to make a clone of an array. For a reference array, the clone() method
        performs a shallow copy. An array should be passed to a method and returned from a method with caution. If a method
        may modify its array parameter and you do not want your actual array parameter to get affected by that method call,
        you must pass a deep copy of your array to that method.
        */
             
    }
    
    /*
    * Uses a for-loop to copy an array
    */
    public static int[] expandArray(int[] oldArray, int newLength) {
        int originalLength = oldArray.length;
        int[] newArray = new int[newLength];
        int elementsToCopy = 0;
        
        if (originalLength > newLength) {
            elementsToCopy = newLength;
        }
        else {
            elementsToCopy = originalLength;
        }
        
        for (int i = 0; i < elementsToCopy; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
    
    // Caution!
    public int[] getMagicNumbers () {
        /* Never do the following. If you do this, caller of this method will be able to change the magic numbers. */
        // return this.magicNumbers;
        /* Do the following instead. In case of reference array, make a deep copy, and return that copy. For primitive array you can use the clone() method */
        return (int[])magicNumbers.clone();
    }
    
    
}
