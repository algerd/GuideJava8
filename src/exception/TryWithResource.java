
package exception;

/**
 * The try-with-resources construct automatically closes the resources when the program exits the construct. 
 * Это аналог try-finally, в котором в finally встраивается try-catch блок по закрытию какого-то ресурса.
 * A try-with-resource construct may have one or more catch blocks and/or a finally block.
 * @author Alex
 */
public class TryWithResource {
    
    public static void main(String[] args) {
        // Create and use a resource of MyResource type. Its close() method will be called automatically
        try (MyResource mr = new MyResource (2, true) ) {
            mr.use();
            mr.use();
            /* If a try-with-resources block throws an exception and the сall to the close() method also throws an exception, 
                the runtime suppresses the exception thrown from the close() method and reports the exception thrown from the try-with-resources block.
            */
            //mr.use(); // Will throw a RuntimeException from mr.use(), but will not Exception from mr.close()
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            // You can retrieve the suppressed exceptions by using the getSuppressed() method of the Throwable class.
            //for(Throwable t : e.getSuppressed()) { System.out.println(t.getMessage()); }
        }
    }
}
