
package exception;

/**
 * Throwable class is the superclass of all exception classes in Java. 
 * All of the methods of Throwable are available in all exception classes.
 * @author Alex
 */
public class MyException extends Exception {
    /*
    The first constructor creates an exception with null as its detailed message. 
    The second constructor creates an exception with a detailed message. 
    The third and fourth constructors let you create an exception by wrapping another
    exception with/without a detailed message.
    */
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyException(Throwable cause) {
        super(cause);
    }
}
