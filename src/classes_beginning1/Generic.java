
package classes_beginning1;

/**
 * A generic class is defined using formal type parameters. Formal type parameters are a list of comma-separated
 * variable names placed in angle-brackets (<>) after the class name in the class declaration.
 * The actual type parameter for a generic class, if specified, must be a reference type, for example, String, Human, etc. 
 * Primitive types are not allowed as the actual type parameters for a generic class.
 * @author Alex
 */
public class Generic <T> {
    
    public static void main(String[] args) {
        Generic<String> obj1 = new Generic<String>("Hello1");
        // you can omit the actual type parameter.
        Generic<String> obj2 = new Generic<>("Hello2"); 
        
        System.out.println("obj1.obj = " + obj1.get());
        System.out.println("obj2.obj = " + obj2.get());
    }
    
    private T obj;
    public Generic (T obj) {
        this.obj = obj;
    }
    public T get() {
        return obj;
    }
    public void set(T obj) {
        this.obj = obj;
    }
    
}
