
package operators;

/**
 * Relational operators: ==, !=, <, >, <=, >=.
 * @author Alex
 */
public class RelationalOperator {
    public static void main ( String[] args ) {
        /*
        The equality operator(==) is used to test two operands for equality. It uses the following rules:
            - Both operands must be either primitive type or reference type. Mixed operands types are not
                allowed. Mixing the operands types results in a compile-time error.
            - For primitive operands, it returns true if the both operands represent the same value;
                otherwise, it returns false. If both operands must be either numeric or boolean. A mix of
                numeric and boolean types is not allowed.
            - For reference operands, it returns true if the both operands refer to the same object in
                memory; otherwise it returns false.
        */
        int i;
        int j;
        int k;
        boolean b;
        i = j = k = 15; // Assign 15 to i, j, and k
        // A compile-time error
        //b = (i == j == k); // 1)i==j=true 2)true==k - error(boolean == int)
        
        short sh = 15;
        b = (i == sh); // true
        
        /* The following rules apply when the operands of the equality operator are floating-point types.*/
        /* Rule #1
            Both negative zero (-0.0) and positive zero (0.0) are considered equal.
        */
        double d1 = 0.0;
        double d2 = -0.0;
        b = (d1 == d2); // Assigns true to b
        
        /* Rule #2
            A positive infinity is equal to another positive infinity. 
            A negative infinity is equal to another negative infinity.
            However, a positive infinity is not equal to a negative infinity.
        */
        d1 = Double.POSITIVE_INFINITY;
        d2 = Double.NEGATIVE_INFINITY;
        double d3 = Double.POSITIVE_INFINITY;
        boolean b1 = (d1 == d2); // Assigns false to b1
        boolean b2 = (d1 == d3); // Assigns true to b2
        
        /* Rule #3
            If either operand is NaN, the equality test returns false.
        */
        d1 = Double.NaN;
        d2 = 5.5;
        b = (d1 == d2); // Assigns false to b
        
        // Note that even if both the operands are NaN, the equality operator will return false.
        d1 = Double.NaN;
        d2 = Double.NaN;
        b = (d1 == d2); // Assigns false to b
        
        // If you write the following piece of code to test for the value of a double variable d1 being NaN, it will always return false:
        b = (d1 == Double.NaN); // Assigns false to b. Incorrect way
        
        // Float and Double classes have an isNaN() method, which accepts a float and a double argument, respectively.
        b = Double.isNaN(d1); // Assigns true to b. Correct way to test for a NaN value
        
        /* Rules of comparison string:
            - You should not use == operator to test two strings for equality.
            - To compare the text represented by the two String variables str1 and str2,
                you should use the equals() method of the String class
        */
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        // str1 and str2 refer to two different objects in memory and this is the reason that str1 == str2 evaluates to false.
        b = (str1 == str2);     // Assigns false to b             
        b = str1.equals(str2);  // Assigns true to b because str1 and str2 have the same text of "Hello" 
        b = str2.equals(str1);  // Assigns true to b because str1 and str2 have the same text of "Hello"     
    
        /* Inequality Operator (!=) 
            If either operand is NaN (float or double), inequality operator returns true. 
            If d1 is a floating-point variable(double or float), d1 == d1 returns false and d1 != d1 returns true if and only if d1 is NaN.
        */
        i = 15;
        j = 10;
        k = 15;
        b = (i != j);       // Assigns true to b
        b = (i != k);       // Assigns false to b
        b = (true != true); // Assigns false to b
        b = (true != false);// Assigns true to b
        b = (false != true);// Assigns true to b
        
        /* Operators >, <, >=, <=
            The operators can be used only with primitive numeric data types. 
            If either of the operand is NaN (float or double), it returns false.     
        */
        i = 10;
        j = 15;
        d1 = Double.NaN;
        b = (i > j);    // Assigns false to b
        b = (j > i);    // Assigns true to b     
        // b = (true > false);  // A compile-time error. > cannot be used with boolean operands
        b = ( d1 > Double.NaN );// Assigns false to b
        str1 = "Hello";
        str2 = "How is Java?";   
        //b = (str1 > str2);    // A compile-time error. > cannot be used with reference type operands str1 and str2
        
        /*
        If you want to test if the number of characters in String str1 is greater than that of str2, you should use the length() method of the String class. 
        The length() method of String class returns the number of characters in the string.
        */
        i = str1.length(); // Assigns 5 to i. "Hello" has 5 characters
        b = (str1.length() > str2.length()); // Assigns false to b
        b = (str2.length() > str1.length()); // Assigns true to b
    }
}
