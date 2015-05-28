
package wrappers;

/**
 * Byte, Short, Integer, Long, Float, and Double classes are numeric wrapper classes. 
 * They are all inherited from the Number class. The Number class is declared abstract.
 * @author Alex
 */
public class NumericWrapper {
    
    public static void main(String[] args) {
        /*
        The Number class contains six methods. They are named xxxValue() where xxx is one of the six primitive data
        types (byte, short, int, long, float, and double). The return type of the methods is the same as xxx.
        */
        // Creates a Double object
        Double doubleObj = Double.valueOf("329.78");
        // Gets different types of primitive values from Double
        double d = doubleObj.doubleValue();
        float f = doubleObj.floatValue();
        int i = doubleObj.intValue();
        long l = doubleObj.longValue();
        System.out.println("doubleObj = " + doubleObj);
        System.out.println("double from doubleObj = " + d);
        System.out.println("float from doubleObj = " + f);
        System.out.println("int from doubleObj = " + i);
        System.out.println("long from doubleObj = " + l);
        
        /*
        Java 8 has added some methods like sum(), max(), and min() in some of the numeric wrapper classes such as
        Integer, Long, Float, and Double.
        */    
        int n = Integer.sum(10, 20); // 30
        
        /*
        Wrapper classes help in working with strings containing primitive values.
            - Use the valueOf() methods to convert strings into wrapper objects.
            - Use the parseXxx() methods to convert strings into primitive values.
        */
        // code converts a string containing an integer in binary format into an Integer object and an int value:
        String str = "01111111";
        int radix = 2;
        // Creates an Integer object from the string
        Integer intObject = Integer.valueOf(str, radix);
        // Extracts the int value from the string
        int intValue = Integer.parseInt(str, 2);
        System.out.println("str = " + str); // 01111111
        System.out.println("intObject = " + intObject); // 127
        System.out.println("intValue = " + intValue); // 127
        
        /*
        If strings cannot be converted to numbers, wrapper classes will throw a NumberFormatException. 
        It is common to place the string parsing logic inside a try-catch block and handle the exceptions.
        */
        String str1 = "123.89";
        // String str1 = "78H.90"; // An invalid double
        try {
            double value1 = Double.parseDouble(str1);
            System.out.println("value1 = " + value1);   // 123.89
        }
        catch (NumberFormatException e) {
            System.out.println("Error in parsing " + str1); // Error in parsing 78H.90
        }
        
        /*
        All numeric wrapper classes contain several useful constants. For example, MIN_VALUE and MAX_VALUE, SIZE.
        */
      
    }
    
}
