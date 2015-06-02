
package statements;

/**
 * The switch-expression must evaluate to a type: byte, short, char, int, enum, or String.
 * @author Alex
 */
public class SwitchStatement {
    public static void main(String[] args) {
        /*
        Switch используется, когда надо сравнить одну и ту же переменную с разными её значениями.
        switch (switch-expression) {
            case label1: 
                statements
            case label2:
                statements
            case label3:
                statements
            default:
                statements
        }
        1. The switch-expression is evaluated.
        2. If the value of the switch-expression matches a case label, the execution starts from the
            matched case label and executes all statements until the end of the switch statement.
        3. If the value of the switch-expression does not match a case label, execution starts at the
            statement following the optional default label and continues until the end of the switch
            statement.   
        */        
        int i = 10;
        switch (i) {
            case 10: // Found the match
                System.out.println("Ten");      // Execution starts here (Ten Twenty No-match)
            case 20:
                System.out.println("Twenty");
            default:
                System.out.println ("No-match");
        }        
         
        // The default label may not be the last label to appear in a switch statement and is optional. For example,
        // The default label is optional. There can be at most one default label in a switch statement.
        i = 50;
        switch (i) {
            case 10:
                System.out.println("Ten");
            default:
                System.out.println("No-match"); // Execution starts here (No-match Twenty)
            case 20:
                System.out.println("Twenty");
        }
        
        // When a break statement is executed inside a switch statement, the control is transferred outside the switch statement.
        i = 10;
        switch (i) {
            case 10:
                System.out.println("Ten");
                break; // Transfers control outside the switch statement
            case 20:
                System.out.println("Twenty");
                break; // Transfers control outside the switch statement
            default:
                System.out.println("No-match");
                // it is recommended to use a break statement even inside the last label to avoid errors if additional labels are added later.
                break; // Transfers control outside the switch statement. It is not necessary.
        }
        
        // The value of the constant expressions used as the case labels must be in the range of the data type of switch-expression.
        byte b = 10;
        switch (b) {
            case 5:
                b++;
            //case 150: // A compile-time error. 150 is greater than 127
                b--;
            default:
                b = 0;
        }
        
        // Two case labels in a switch statement cannot be the same. The following piece of code would not compile because case label 10 is repeated:
        int num = 10;
        switch (num) {
            case 10:
                num++;
            //case 10: // A compile-time error. Duplicate case label 10
                num--;
            default:
            num = 100;
        }
        
        // It is important to note that the labels for each case in a switch statement must be a compile-time constant. 
        // That is, the value of the labels must be known at compile time.
        int num1 = 10;
        int num2 = 10;
        switch (num1) {
            case 20:
                System.out.println("num1 is 20");
            //case num2: // A Compile-time error. num2 is a variable and cannot be used as a label
                System.out.println("num1 is 10");
        }
        
        /*
        The switch-expression uses a String type. If the switch-expression is null, a NullPointerException is thrown. The case
        labels must be String literals. You cannot use String variables in the case labels.
        The switch statement for strings compares the switch-expression with case labels as if the equals() method
        of the String class has been invoked.
        */
        String status = "on";
        switch(status) {
            case "on":
                System.out.println("Turn on"); // Will execute this
                break;
            case "off":
                System.out.println("Turn off");
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
        /*
        As good programming practice, you need to do the following two things before executing a switch statement
        with strings:
            • Check if the switch-expression for the switch statement is null. If it is null, do not execute
            the switch statement.
            • If you want to perform a case-insensitive comparison in a switch statement, you need to
            convert the switch-expression to lowercase or uppercase and use lowercase or uppercase in
            the case labels accordingly.
        */
        operate("on");
        operate("off");
        operate("ON");
        operate("Nothing");
        operate("OFF");
        operate(null);              
    }
    
    public static void operate(String status) {
        // Check for null
        if (status == null) {
            System.out.println("status cannot be null.");
            return;
        }
        // Convert to lowercase
        status = status.toLowerCase();
        switch (status) {
            case "on":
                System.out.println("Turn on");
                break;
            case "off":
                System.out.println("Turn off");
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
    
}
