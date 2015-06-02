
package string;

/**
 * StringBuilder and StringBuffer are companion classes for the String class. 
 * Unlike a String, they represent a mutable sequence of characters.
 * You can change the content of StringBuilder and StringBuffer without creating a new object.
 * @author Alex
 */
public class Builder {
    
    public static void main(String[] args) {
        
        /*
        The difference between the two lies in thread safety. StringBuffer is thread-safe and
        StringBuilder is not thread-safe. Most of the time, you do not need thread safety and using StringBuffer in those
        cases has a performance penalty. This is the reason that StringBuilder was added later. Both classes have the same
        methods, except that all methods in StringBuffer are synchronized.
        The StringBuilder class contains four constructors:
            • StringBuilder()
            • StringBuilder(CharSequence seq)
            • StringBuilder(int capacity)
            • StringBuilder(String str)
        */
        // Create an empty StringBuilder with a default initial capacity of 16 characters
        StringBuilder sb1 = new StringBuilder();
        // Create a StringBuilder from of a string
        StringBuilder sb2 = new StringBuilder("Here is the content");
        // Create an empty StringBuilder with 200 characters as the initial capacity
        StringBuilder sb3 = new StringBuilder(200);
        
        
        StringBuilder sb = new StringBuilder(200); // Capacity:200, length:0
        sb.append("Hello"); // Capacity:200, length:5
        int len = sb.length(); // len is assigned 5
        int capacity = sb.capacity(); // capacity is assigned 200
        
        
        // Create a String object
        String s1 = new String("Hello");
        // Create a StringBuilder from of the String object s1
        sb = new StringBuilder(s1);
        // Append " Java" to the StringBuilder's content
        sb.append(" Java"); // Now, sb contains "Hello Java"
        // Get a String from the StringBuilder
        String s2 = sb.toString(); // s2 contains "Hello Java"
        
        /*
        To optimize the string concatenation operation, the compiler replaces the string concatenation by a statement, which uses a StringBuilder:
        */
        String str = "X" + "Y" + 12.56;
        str = new StringBuilder().append("X").append("Y").append(12.56).toString();
        
        // Create an empty StringNuffer
        sb = new StringBuilder();
        printDetails(sb);
        
        // Append "blessings"
        sb.append("blessings");
        printDetails(sb);
        
        // Insert "Good " in the beginning
        sb.insert(0, "Good ");
        printDetails(sb);
        
        // Delete the first o
        sb.deleteCharAt(1);
        printDetails(sb);
        
        // Append " be with you"
        sb.append(" be with you");
        printDetails(sb);
        
        // Set the length to 3
        sb.setLength(3);
        printDetails(sb);

        // Reverse the content
        sb.reverse();
        printDetails(sb);
    }
    
    public static void printDetails(StringBuilder sb) {
        System.out.println("Content: \"" + sb + "\"");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        // Print an empty line to separate results
        System.out.println();
    }


}
