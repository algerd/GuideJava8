
package statements;

/**
 * A break statement is used inside switch, for-loop, while-loop, and do-while statements to exit from a these blocks.
 * There are two forms of the break Statements:
 *  - Unlabeled break statement
 *  - Labeled break statement
 * @author Alex
 */
public class BreakStatement {
    public static void main(String[] args) {  
        /* In case of nested statements, if an unlabeled break statement is used inside the inner statement, 
            it transfers control only out of the inner statement, not out of the outer statement.
        */
        //To print only the lower half of the 3x3 matrix, you can write the following snippet of code:               
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print ( i + "" + j);
                if (i == j) {
                    break; // Exit the inner for loop
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        
        /*
        A label of break in Java is any valid Java identifier followed by a colon.
        */
        // Now use a labeled break statement in the above example and see the result: The output of the above snippet of code will be 11.
        outer: // Defines a label named outer
        for(int i = 1; i <= 3; i++ ) {
            for(int j = 1; j <= 3; j++ ) {
                System.out.print(i + "" + j);
                if (i == j) {
                    break outer; // Exit the outer for loop
                }
                System.out.print("\t");
            }
            System.out.println();
        } // The outer label ends here
        
        // Labeled statement it can be used with any type of a block statement:
        blockLabel:
        {
            int i = 10;
            if (i == 5) {
            // break; // error. use only inside switch, for-loop, while-loop, and do-while or with label   
            break blockLabel; // Exits the block
            }
                if (i == 10) {
                System.out.println("i is not five");
            }
        }
        
    }
}
