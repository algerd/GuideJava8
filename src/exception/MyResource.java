
package exception;

/*
A resource that you specify in a try-with-resources must be of the type java.lang.AutoCloseable. 
Java 7 added the AutoCloseable interface, which has a close() method. When the program exits the try-with-resources
block, the close() method of all the resources is called automatically. In the case of multiple resources, the close()
method is called in the reverse order in which the resources are specified.
*/
public class MyResource implements AutoCloseable {
	private int level;
	private boolean exceptionOnClose;

	public MyResource(int level, boolean exceptionOnClose) {
		this.level = level;
		this.exceptionOnClose = exceptionOnClose;
		System.out.println("Creating MyResource. Level = " + level);
	}

	public void use() {
		if (level <= 0) {
			throw new RuntimeException("Low in level.");
		}
		System.out.println("Using MyResource level " + this.level);
		level--;
	}

    /*
    When a resource is being closed automatically, an exception may be thrown. If a try-with-resources block
    completes without throwing an exception and the call to the close() method throws the exception, the runtime
    reports the exception thrown from the close() method. If a try-with-resources block throws an exception and the
    call to the close() method also throws an exception, the runtime suppresses the exception thrown from the close()
    method and reports the exception thrown from the try-with-resources block.
    */
	@Override
	public void close() {
		if (exceptionOnClose) {
			throw new RuntimeException("Error in closing");
		}
		System.out.println("Closing MyResource...");
	}
}
