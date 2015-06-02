
package string;

/**
 *
 * @author Alex
 */
public class Main {
    
    public static void main(String[] args) {
        /*
        A string literal cannot be broken into two lines.
        If you want to break "Hello" in two lines, you must break it using the string concatenation operator (+), as shown:
        */
        String str = "This is a big string literal" +
        " and it will continue in several lines.";
        
        // length() method that returns the number of characters in the String object.
        System.out.println("str.length() = " + str.length());
        
        /*
        All string literals are objects of the String class.
        All methods of the String class can be used with String literals directly.
        */
        int len = "Hello".length();
        
        /*
        String objects are immutable. That is, you cannot modify the content of a String object.
        But reference variable on object can be changed and it is mutable.
        */
        str = new String("Just a string"); // new String("Just a string") - immutable, reference str - mutable
        str = new String("Another string");
        // If you do not want str to refer to any other String object after it has been initialized, you can declare it final
        final String strfinal = new String("str cannot refer to other object");
        
        /*
        The String class overrides the equals() method of the Object class and provides its own implementation, 
        which compares two strings for equality based on their contents. 
        Opposite the == operator always compares the references of two objects in memory.
        */
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        boolean b1 = str1.equals(str2); // true
        boolean b2 = (str1 == str2);    // false
        
        /*
        If you want to compare two strings based on the Unicode values of their characters, you can use the compareTo() method.
        It returns int difference of Unicode values.
        compareTo() method compares two strings based on the Unicode values of their characters. 
        The comparison may not be the same as the dictionary order comparison (no latin). To perform language-based string comparisons, you should
        use the compare() method of the java.text.Collator class instead.
        */
        int dif = "apple".compareTo("Orange");
        
        /*
            All string literals("Hello") and string literals resulting from compile-time constant expressions are added to the string pool automatically.
            You can add a String object to the string pool using its intern() method. The intern( ) method returns the
            reference of the object from string pool if it finds a match. Otherwise, it adds a new String object to the string pool
            and returns the reference of the new object.
            You cannot access the pool directly. 
            There is no way to remove string objects from the pool, except exiting and restarting the app.
        */
        boolean bool;
        
        String h1 = "Hello"; // object "Hello" is added to the string pool, h1 is object reference in the string pool
        String h2 = new String("Hello"); // object "Hello" are invoked from the string pool, h2 is reference on new object, which isn't added to the string pool
       
        bool = h1 == h2; // false
        bool = h1 == "Hello"; // true
        bool = h2 == "Hello"; // false
        h2 = h2.intern(); // object is added to the string pool and return the reference of the string object from the pool
        bool = h2 == "Hello"; // true 
        
        final String constStr = "Constant"; // constStr is a constant
        String varStr = "Variable";         // varStr is not a constant
        
        String s1 = constStr + " is pooled";    // "Constant is pooled" will be added to the string pool
        String s2 = varStr + " is not pooled";  // Concatenated string will not be added to the string pool
        
        bool = ("Constant is pooled" == s1); // true
        bool = ("Variable is pooled" == s2); // false
            
        s2 = s2.intern(); // Will add the content of s2 to the string pool and return the reference of the string object from the pool
        bool = ("Variable is pooled" == s2); // true
        
    }
    
}
