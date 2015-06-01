
package exception;

/**
 * Examplr demonstrates how to print the stack trace of an exception on the standard error.
 * @author Alex
 */
public class TestMyException {
    
    public static void main(String[] args) {
        try {
            m1();
        }
        catch(MyException e) {
            e.printStackTrace(); // Print the stack trace
        }     
    }
    
    public static void m1() throws MyException {
        m2();
    }
    
    public static void m2() throws MyException {
        throw new MyException("Some error has occurred.");
    }
    
}
