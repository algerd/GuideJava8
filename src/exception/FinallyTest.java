// FinallyTest.java
package exception;

/*
    A try block can have a maximum of one finally block.
    Try executing the code in the try. If the code in the try block throws any exception, execute the
matching catch block. Finally, execute the code in the finally block no matter how the code in the
try and catch blocks finish executing. 
    A finally block is guaranteed to be executed no matter what happens in the associated try and/or catch
block. There are two exceptions to this rule: the finally block may not be executed if the thread that is executing the
try or catch block dies, or a Java application may exit, for example, by calling System.exit() method, while executing
the try or catch block.
*/
public class FinallyTest {
	public static void main(String[] args) {
        /*
        The first try-catch-finally block attempts to perform a divide-by-zero operation on an integer. The expression
        x/y throws an ArithmeticException and control is transferred to the catch block. The finally block is executed after
        the catch block finishes. Note that the second message in the try block is not printed because once an exception is
        thrown, the control jumps to the nearest matching catch block and the control never goes back to the try block again.
        */
		int x = 10, y = 0, z;
		try {
			System.out.println("Before dividing x by y.");
			z = x / y;
			System.out.println("After dividing x by y.");
		}
		catch (ArithmeticException e) {
			System.out.println("Inside catch block - 1.");
		}
		finally {
			System.out.println("Inside finally block - 1.");
		}

		System.out.println("-------------------------------");

        /*
        The second try-catch-finally block is an example where the try block finishes normally (without throwing an
        exception). After the try block finishes, the finally block is executed.
        */
		try {
			System.out.println("Before setting z to 2449.");
			z = 2449;
			System.out.println("After setting z to 2449.");
		}
		catch (Exception e) {
			System.out.println("Inside catch block - 2.");
		}
		finally {
			System.out.println("Inside finally block - 2.");
		}

		System.out.println("-------------------------------");

        /*
        The third try-finally block is simple. The try block finishes normally, and then the finally block is executed.
        */
		try {
			System.out.println("Inside try block - 3.");
		}
		finally {
			System.out.println("Inside finally block - 3.");
		}

		System.out.println("-------------------------------");
        
        /*
        The fourth try-finally block demonstrates an exceptional case when a finally block is not executed. The
        try block exits the application by executing the System.exit() method. The application stops executing when the
        System.exit() method is called without executing the associated finally block.
        */
		try {
			System.out.println("Before executing System.exit().");
			System.exit(0);
			System.out.println("After executing System.exit().");
		}
		finally {
			// This finally block will not be executed because application exits in try block
			System.out.println("Inside finally block - 4.");
		}
	}
}
