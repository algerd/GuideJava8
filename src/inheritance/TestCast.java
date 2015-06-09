
package inheritance;

/**
 *
 * @author Alex
 */
public class TestCast {
    public static void main(String[] args) {
        /*
        Upcasting.
            Use a simple rule to check if an assignment is a case of upcasting. Look at the compile-time type (declared type) of the
            expression on the right side of the assignment operator (e.g. b in a = b). If the compile-time type of the right hand operand
            is a subclass of the compile-time type of the left-hand operand, it is a case of upcasting, and the assignment is safe and
            allowed.
        */
        Object obj;
        Employee emp = new Employee();
        Manager mng = new Manager();
        
        obj = emp;  // Upcasting
        emp = mng;  // Upcasting
           
        emp.setName("Richard Castillo");
        String name = emp.getName();
        
        /*
        Downcasting.
            Assigning a superclass reference to a subclass variable is called downcasting (or narrowing conversion).
            Downcasting is the opposite of upcasting. In upcasting, the assignment moves up the class hierarchy whereas in
            downcasting the assignment moves down the class hierarchy. The Java compiler cannot make sure at compile time
            that downcasting is legal or not.
        */
        //mng = emp; // A compiler error. Downcasting
        mng = (Manager)emp; // OK. Downcast at work
        
        /*
        You should use the instanceof operator before downcasting to check if the reference variable you are trying to
        downcast is of the type you expected it to be.
        */
        if (emp instanceof Manager) {
            mng = (Manager)emp;
        }
        else {
            // emp is not a Manager type
        }
        
                
        
    }
}
