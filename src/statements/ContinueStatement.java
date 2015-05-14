
package statements;

/**
 * A continue statement can only be used inside the for-loop, while-loop, and do-while statements.
 * There are two forms of the continue Statements:
 *  - Unlabeled continue statement
 *  - Labeled continue statement
 * When a continue statement is executed inside a for loop, the rest of the statements in the body of the loop are
 * skipped and the expressions in the expression-list are executed.
 * @author Alex
 */
public class ContinueStatement {
    public static void main(String[] args) { 
        /*
        The main difference in using a continue statement inside a for loop and a while loop is the place where the
        control is transferred. Inside a for loop, control is transferred to the expression-list, and in a while loop, the control is
        transferred to the condition-expression.
        */
        // You can print all odd integers between 1 and 10
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        // You can rewrite the above for-loop statement using a continue statement
         for (int i = 1; i < 10; i++) {
            if (i % 2 == 0 ) 
                continue;
            System.out.println(i);
        }
        // The snippet of code will print all odd integers between 1 and 10, using a continue statement inside a while loop.
        int i = 0;
        while (i++ < 10) {
            if (i % 2 == 0 ) 
                continue;
            System.out.println(i);
        }
        
        /*
        An unlabeled continue statement always continues the innermost for loop, while loop, and do-while loop. If
        you are using nested loop statements, you need to use a labeled continue statement to continue in the outer loop.
        */
        // 3x3 matrix
        outer: // The label "outer" starts here
        for(i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print(i + "" + j);
                System.out.print("\t");
                if (i == j) {
                    System.out.println();   // Print a new line
                    continue outer;         // Continue the outer loop
                }
            }
        } // The label "outer" ends here
        
         
    }
}
