
package statements;

/**
 * While and Do-While loops.
 * This loops continues until the condition-expression returns false.
 * The statement associated with a while loop statement may not be executed even once if the condition-expression
 * evaluates to false for the first time. However, the statement associated with a do-while statement is executed at least once.
 * @author Alex
 */
public class WhileStatement {
    public static void main(String[] args) {
        // infinite loop
        // while (true) System.out.println ("This is an infinite loop");
        
        /* The conversion between a for-loop and a while-loop statement is shown below.
        A for-loop statement:
            for (initialization; condition-expression; expression-list)
                Statement
        Equivalent while-loop Statements:
            Initialization
            while (condition-expression) {
                Statement
                Expression-list
            }
        */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // The above code can also be rewritten as
        i = 0;
        while (++i <= 10) {
            System.out.println(i);
        }
        // or
        i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
        
        //A break statement is used to exit the loop in a while-loop statement.
        //It is not a good example of using a break statement.
        i = 1;
        while (true) { // Cannot exit the loop from here
            if (i <= 10) {
                System.out.println(i);
                i++;
            }
            else {
                break; // Exit the loop
            }
        }
        
        /*
        The general form of a do-while statement is
            do
                Statement
            while (condition-expression);
        The do-while statement ends with a semicolon!
        */
        i = 1;
        int sum = 0;
        do {
            sum = sum + i; // Better to use sum += i
        }
        while (++i <= 10);
        // Print the result
        System.out.println("Sum = " + sum); // 55
              
    }  
}
