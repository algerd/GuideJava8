
package statements;

/**
 * A for statement is an iteration statement (also called a for-loop statement), which is used to loop through a
 * statement for a number of times based on some conditions.
 * @author Alex
 */
public class ForStatement {
    public static void main(String[] args) {
        /*
        for (initialization; condition-expression; expression-list)
            Statement
        The order of execution: (all parts are optional)
            1.Initialization - one time
            2.Condition-expression
            3.Statement (empty: {} or ;)
            4.Expression-list - optional
        This loop of execution is repeated until the condition-expression evaluates to false.
        */
        // Variables declared in the initialization part of the for-loop statement can only be used within that for-loop statement.
        for(int num = 1; num <= 5; ++num)
            System.out.println(num); // 1, 2, 3, 4, 5
        // num = 5; // A compile-time error. 
        
        int k;
        //for(int i = 1; i <= 5; ++i); // A compile-time error. var. i already declared
        for(k = 1; k <= 5; ++k);
         
        /* Initialization
        The initialization part of a for-loop statement can have a variable declaration statement, which may declare one
        or more variables of the same type, or it can have a list of expression statements separated by a comma. 
        Note that the statements used in the initialization part do not end with a semicolon.
        */       
        // Declares two variables i and j of the same type int
        for(int i = 10, j = 20; i < 15; ++i){}
        // Declares one double variable salary
        for(double salary = 3455.78F; salary < 20; ++salary){}    
        //for(int i = 10, double d1 = 20.5; i < 15; ++i); // An error. Attempts to declare two variables of different types
        // Uses an expression i++
        int i = 1;
        for(i++; i < 15; ++i); // OK
        // Uses an expression to print a message on the console
        for(System.out.println("Hello"); i < 3; ++i); // OK
        // Uses two expressions: to print a message and to increment num
        int num = 100;
        for(System.out.println("Hello"), num++; num < 102; ++num );
        
        /*
        Condition-expression
        The condition-expression must evaluate to a Boolean value of true or false. Otherwise, a compiler error occurs. The
        condition-expression is optional. If it is omitted, a Boolean value of true is assumed as a condition-expression, which
        results in an infinite loop unless a break statement is used to stop the loop.
        */
        // Infinite loop I
        //for( ; ; ); // Implicitly condition-expression is true
        // Infinite loop II
        //for( ; true; ); // Explicit true is used here
        
        // A break statement is used to stop the execution of a for-loop statement.
        for(int num1 = 1; ; num1++) { // No condition-expression
            System.out.println(num1); // Print the number
            if (num1 == 10) {
                break; // Break out of loop when i is 10
            }
        }
        
        /*
        Expression-list
        It may contain one or more expressions separated by a comma. You can use only
        expressions that can be converted to a statement by appending a semicolon at the end
        */
        for(int num2 = 1; num2 <= 5; System.out.println(num2), num2++);
        //for(int num2 = 1; num2 <= 5; System.out.println(num2++)); 
        
        System.out.println("---------------------------------------------");
        // The code print the 3x3 matrix
        for(int ii = 1; ii <= 3; ii++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print(ii + "" + j);
                // Print a tab, except for the last number in a row
                if (j < 3) {
                    System.out.print("\t");
                }
            }
            // Print a new line, except after the last line
            if (ii < 3) {
                System.out.println();
            }
        }
    }
} 
