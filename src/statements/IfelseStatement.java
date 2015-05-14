
package statements;

/**
 * If-else statements.
 * @author Alex
 */
public class IfelseStatement {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;  
        boolean b;
        
        // Note that the condition expression in an if statement must be of the boolean type.
        if (num1 == num2) num3 = 5;
        //if (num1 = 5) num3 = 5;/* A compile-time error */
        if (b = true) num3 = 5;
        
        // if-else without brace            
        if (num1 > 50)
            num2 = num2 + 10;
        else
            num2 = num2 - 10;
        
        // The snippet of code will generate a compiler error.
        if (num1 > 50)
            num2 = num2 + 10;
            //num3 = num3 + 10;
        else
            num2 = num2 - 10;
            //num3 = num3 - 10;
        
        // Valid code - рекомендуется всегда использовать скобки!
        if (num1 > 50) {
            num2 = num2 + 10;
            num3 = num3 + 10;
        }
        else {
            num2 = num2 - 10;
            num3 = num3 - 10;
        }
           
        // The if-else statement can be nested, as shown:
        if (num1 > 50) {
            if (num2 < 30) {
                num3 = num3 + 130;
            }
            else {
                num3 = num3 - 130;
            }
        }
        else {
            num3 = num3 = 200;
        }
        
        /* Ternary operator is expression.
        You can use the ternary operator in place of the if-else statement only when the if and else parts in the if-else statement contain
        only one statement and both statements return the same type of values.
        */
        String title = "";
        boolean isMale = true;
        // Using an if-else statement
        if (isMale)
            title = "Mr.";
        else
            title = "Ms.";
        // Using a ternary operator
        title = (isMale ? "Mr." : "Ms.");
        // Using a ternary operator in initialization
        int i = 10;
        int j = 20;
        int k = (i < j ? i : j); 
        
        // You can use ternary operator as an argument to a method:
        System.out.println(k == 15 ? "k is 15" : "k is not 15");
        
        /*
        Область видимости переменных в if-else блоках аналогична block statement
        All the variables declared in a block statement can only be used within that block (local scope).
        */
        int outer = 10;
        if (i > 20) {
            int inner = 100;
            //int outer = 200;  // A compile-time error. inner is already in scope. Cannot redeclare inner      
            outer = 200; 
        }
        //inner = 200; // A compile-time error. inner has been declared inside a block and so it cannot be used outside that block
        
        // else if
        if (i > 20) {
            // ...
        } 
        else 
            if(true) {
            //...    
        }
        else {
            //...    
        }
                
    }
}
