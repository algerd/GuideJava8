
package string;

/**
 * This section describes some of the frequently used operations on String objects.
 * @author Alex
 */
public class Methods {
    
    public static void main(String[] args) {
        /*
        charAt()
            You can use the charAt() method to get a character at a particular index from a String object. The index starts at zero
        */
        String str = "HELLO";
        char ch = str.charAt(4); // 'O'
        
        /*
        equals(), equalsIgnoreCase()
            If you want to compare two strings for equality ignoring their cases, you can use the equalsIgnoreCase() method.
            If you want to perform a case-sensitive comparison for equality, you need to use the equals() method instead as
            previously described.
        */
        boolean b;
        String str1 = "Hello";
        String str2 = "HELLO";
        b = str1.equals(str2); // false
        b = str1.equalsIgnoreCase(str2); // true
        
        /*
        isEmpty()
            Sometimes you need to test whether a String object is empty. The length of an empty string is zero.
        */
        str1 = "";
        // There are three ways to check for an empty string:
        b = str1.isEmpty();  // true
        b = str1.equals(""); // true !!!
        b = str1.length() == 0; // true
        /*
        The first method may seem more readable as the method name suggests
        what is intended. However, the second method is preferred as it handles the comparison with null gracefully. The
        first and third methods throw a NullPointerException if the string is null. The second method returns false when
        the string is null, for example, "".equals(null) returns false.
        */
        
        /*
        toLowerCase(), toUpperCase()
            To convert the content of a string to lower and upper case, you can use the toLowerCase() and the toUpperCase() methods.
        */
        str1 = "hello";            // code creates new object in string pool
        str1 = str1.toUpperCase(); // "HELLO", code creates new object in string pool
        str1 = str1.toUpperCase(); // "hello", code return reference on object "hello" from string pool
        
        str2 = new String("hello"); // code creates new String object out string pool
        str2 = str1.toUpperCase();  // code creates new String object out string pool
        str2 = str1.toLowerCase();  // code creates new String object out string pool
        
        /*
        indexOf(), lastIndexOf()
            Searching for a String.
            The indexOf() method starts searching for the character or the string from the start of the string and returns the
            index of the first match. The lastIndexOf() method matches the character or the string from the end and returns
            the index of the first match. If the character or string is not found in the string, these methods return –1.
        */
        int index;
        index = str.indexOf('p');       // index will have a value of 1
        index = str.indexOf("pl");      // index will have a value of 2
        index = str.lastIndexOf('p');   // index will have a value of 2
        index = str.lastIndexOf("pl");  // index will have a value of 2
        index = str.indexOf("k");       // index will have a value of -1
        
        /*
        static valueOf()
            The String class has an overloaded valueOf() static method. It can be used to get the string representation of the
            values of any primitive data type or any object.
        */
        String s1 = String.valueOf('C'); // s1 has "C"
        String s2 = String.valueOf("10"); // s2 has "10"
        String s3 = String.valueOf(true); // s3 has "true"
        String s4 = String.valueOf(1969); // s4 has "1969"
        
        /*
        substring()
            You can use the substring() method to get a sub-part of a string. This method is overloaded. One version takes the
            start index as the parameter and returns a substring beginning at the start index to the end of string. Another version
            takes the start index and the end index as parameters. It returns the substring beginning at the start index and one less
            than the end index.
        */
        s1 = "Hello".substring(1);      // s1 has "ello"
        s2 = "Hello".substring(1, 4);   // s2 has "ell"
        
        /*
        trim()
            Note that the trim() method removes only leading and trailing whitespaces. It does not remove any whitespace
            or control characters if they appear in the middle of the string.
        */
        s1 = "  Hello world!  ";
        s1 = s1.trim(); // "Hello world!"
        
        /*
        replace()
            It returns a new String object by replacing all occurrences of the old character by the new character.
        */
        String oldStr = new String("tooth");
        String newStr = oldStr.replace('o', 'e'); // o in oldStr will be replaced by e. newStr will contain "teeth"
        
        /*
        startsWith(), endsWith()
            Checks if the string starts with the specified argument, whereas endsWith() checks if the string
            ends with the specified string argument. Both methods return a boolean value.
        */
        str = "This is a Java program";
        b = str.startsWith("This"); // true
        b = str.endsWith("program"); // true
        
        /*
        split()
            Use the split() method to split a string into multiple strings. Splitting is performed using a delimiter.
            The split() method returns an array of String.
        */
        str = "AL,FL,NY,CA,GA";    
        String[] parts = str.split(",");    // Split str using a comma as the delimiter
        // Print the the string and its parts
        System.out.println(str);
        for(String part : parts) {
            System.out.println(part);
        }
        
        /*
        join() method to the String class that joins multiple strings into one string. It is overloaded.
            • String join(CharSequence delimiter, CharSequence... elements) - takes a delimiter and a sequence of strings to be joined
            • String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) - takes a delimiter and an Iterable, for example, a List or Set.         
        */
        // Join some strings using a comma as the delimiter
        str = String.join(",", "AL", "FL", "NY", "CA", "GA");
        System.out.println(str);
        
        
        
    }
    
}
