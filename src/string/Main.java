
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
        
        
        
    }
    
}
