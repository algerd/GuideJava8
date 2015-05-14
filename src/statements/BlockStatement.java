
package statements;

/**
 * A block statement is a sequence of zero or more statements enclosed in braces.
 * @author Alex
 */
public class BlockStatement {
    public static void main(String[] args) {
        /* All the variables declared in a block statement can only be used within that block (local scope). */
        int num1;
        { // Start of a block statement
            // Declares a variable num2, which is a local variable for this block
            int num2;
            // num2 is local to this block, so it can be used here
            num2 = 200;
            // We can use num1 here because it is declared outside and before this block
            num1 = 100;
        } // End of the block statement
        // A compile-time error. num2 has been declared inside a block and so it cannot be used outside that block
        //num2 = 50; 
        
        /*
        You can also nest a block statement inside another block statement. All the variables declared in the enclosing
        blocks (outer blocks) are available to the enclosed blocks (inner blocks). However, the variables declared in the
        enclosed inner blocks are not available in enclosing outer blocks.
        */ 
        // Start of the outer block
        {
            int num3 = 10;
            // Start of the inner block
            {
                // num1 is available here because we are in an inner block
                num3 = 100;
                int num2 = 200; // Declared inside the inner block
                num2 = 678; // OK. num2 is local to inner block
            }
            // End of the inner block
            // A compile-time error. num2 is local to the inner block. So, it cannot be used outside the inner block.
            //num2 = 200;
        }
        // End of the outer block 
        
        /*
        You cannot declare a variable with the same name inside an inner block 
        if a variable with the same name has already been defined in the outer block.
        */
        int num4 = 10;
        {     
            //float num4 = 10.5F;// A compile-time error. num4 is already in scope. Cannot redeclare num1
            float num5 = 12.98F; // OK
            num4 = 5;
            {
                //float num5; // A compile-time error. num5 is already in scope. You can use num2 already define in the outer block, but cannot redeclare it.
                num5 = 2.F;
            }
        }
    }
}
