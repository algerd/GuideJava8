
package assertion;

/**
 * Assertions are used to verify that what a programmer assumes about his program at a specific point in his code is true.
 * You should never use an assertion to handle a user’s error or to validate data, because assertions are not meant to be
 * enabled in the production environment.
 * Assertions are used for detecting logical errors in a program and they are typically enabled in development and testing environments. 
 * Assertions can be enabled and disabled for packages and classes. They should not be used to validate user’s inputs or business rules.
 * @author Alex
 */
public class Assertion {
    
    public static void main(String[] args) {
        
        /*
        Form #1
                assert booleanAssertionExpression;
            If the assertion expression evaluates to true, no action is taken.
            If the assertion expression evaluates to false, the runtime throws a java.lang.AsssertionError.
        */
        int x = 10 + 15;
        assert x == 25;
        int z = x + 12;
        
        /*
        Form #2
                assert booleanAssertionExpression : errorMessageExpression;
            The errorMessageExpression does not have to be a string. It could an expression that may evaluate to any data type,
            except the void data type. The runtime will convert the result of the error message expression to string.   
        */
        int y = 100+ 15;
        assert y == 25: "y = " + y; // Exception in thread "main" java.lang.AssertionError: y = 115 at assertion.Assertion.main(Assertion.java:29) 
        z = y + 12;
        
        /*
        By default, assert statements are not executed by the Java runtime. In other words, the assertion is disabled by default. 
        You must enable the assertion when your class, so your assert statements are executed. 
        The –ea switch enables the assertion at runtime.
            C:\Users\Alex>java -classpath E:\Java_projects\GuideJava8\build\classes -ea assertion.Assertion
                Exception in thread "main" java.lang.AssertionError: y = 115
                at assertion.Assertion.main(Assertion.java:29)  
        */
        
        // Проверка статуса assert (включения assert)
        boolean enabled = false;
        assert enabled = true;
        if (enabled) {
            System.out.println("Assertion is enabled.");
        }
        else {
            System.out.println("Assertion is disabled.");
        }      
    }
    
    
}
