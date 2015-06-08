
package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList and Vector are two classes in the java.util package that can be used whenever variable-length arrays are needed.
 * ArrayList and Vector classes work the same way, except that the methods in the Vector class are
 * synchronized, whereas methods in ArrayList are not. If your object list is accessed and modified by multiple threads
 * simultaneously, use the Vector class, which will be slower but thread safe. Otherwise, you should use the ArrayList class.
 * @author Alex
 */
public class VariableLengthArrays {
    public static void main(String[] args) {
        
        ArrayList<Integer> ids = new ArrayList<>(); // Create an ArrayList of Integer     
        int total = ids.size(); // Get the size of array list, total will be zero at this point
        // The toString() method of the ArrayList class returns a string that is a comma-separated string representation of its elements enclosed in brackets ([]).
        System.out.println("ArrayList size is " + total);
        System.out.println("ArrayList elements are " + ids);
        
        // Add three ids 10, 20, 30 to the array list.
        ids.add(new Integer(10)); // Adding an Integer object.
        ids.add(20); // Adding an int. Autoboxing is at play.
        ids.add(30); // Adding an int. Autoboxing is at play.
        total = ids.size(); // total will be 3
        System.out.println("ArrayList size is " + total);
        System.out.println("ArrayList elements are " + ids);
        
        Integer firstId = ids.get(0); // Get the element at the index 0 (the first element)    
        int secondId = ids.get(1);    // Autounboxing is at play // Get the element at the index 1 (the second element)
        
        // Clear all elements from array list
        ids.clear();    
        total = ids.size(); // total will be 0
        System.out.println("ArrayList size is " + total);
        System.out.println("ArrayList elements are " + ids);
        
        // You can check if the ArrayList contains an object using its contains() method.
        Integer id20 = 20;
        Integer id50 = 50;
        // Add three objects to the arraylist
        ids.add(10);
        ids.add(20);
        ids.add(30);
        // Check if the array list contains id20 and id50
        boolean found20 = ids.contains(id20); // found20 will be true
        boolean found50 = ids.contains(id50); // found50 will be false
        
        // Iterate through all elements using loop
        total = ids.size();
        for (int i = 0; i < total; i++) {
            int temp = ids.get(i);
        }
        
        // Iterate through all elements using foreach
        for (int temp : ids) { }
        
        // Общий тест
        VariableLengthArrays.test();
        
        // Converting an ArrayList/Vector to an Array
        VariableLengthArrays.convert();
    }
    
    /*
    *
    */
    public static void test() {
      
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Christopher");
        nameList.add("Kathleen");
        nameList.add("Ann");
   
        int count = nameList.size();
        System.out.println("List of names...");
        for(int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }
        
        nameList.remove("Kathleen");    // Let us remove Kathleen from the list  
        count = nameList.size();
        System.out.println("After removing Kathleen...");
        for(int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }
    }
    
    /*
    An ArrayList can be used when the number of elements in the list is not precisely known. Once the number of elements
    in the list is fixed, you may want to convert an ArrayList to an array.
    */
    public static void convert() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("cat");
        al.add("dog");
        al.add("rat");
     
        System.out.println("ArrayList:" + al);
       
        String[] s1 = new String[al.size()]; // Create an array of teh same length as teh ArrayList    
        String[] s2 = al.toArray(s1);   // Copy the ArrayList elements to teh array
        
        // s1 has enough space to copy all ArrayList elements. al.toArray(s1) returns s1 itself
        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));
        
        // Create an array of string with 1 element.
        s1 = new String[1];
        s1[0] = "hello" ; // Store hello in first element
        // Copy ArrayList to the array s1
        s2 = al.toArray(s1);
        /* Since s1 doesn't have sufficient space to copy all ArrayList elements, al.toArray(s1) creates a new String array with 3 elements in it. All elements of
        arraylist are copied to new array. Finally, new array is returned. Here, s1 == s2 is false. s1 will be untouched by the method call.
        */
        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));
    }
    
}
