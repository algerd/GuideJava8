
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
        The order of execution:
            1.Initialization - one time
            2.Condition-expression
            3.Statement
            4.Expression-list
        This loop of execution is repeated until the condition-expression evaluates to false.
        */
        // Variables declared in the initialization part of the for-loop statement can only be used within that for-loop statement.
        for(int num = 1; num <= 5; ++num)
            System.out.println(num); // 1, 2, 3, 4, 5
        // num = 5; // A compile-time error. 
        
        int i;
        //for(int i = 1; i <= 5; ++i); // A compile-time error. var. i already declared
        for(i = 1; i <= 5; ++i);
        
        // An infinite loop using a for-loop statement can be written as follows: 
        //for( ; ; ) { /* An infinite loop */}
        //for( ; ; );
        
    }
}
