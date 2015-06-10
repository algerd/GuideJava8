
package interfaces;

/**
 * The general (incomplete) syntax for declaring an interface is
 *   <modifiers> interface <interface-name> {
 *       Constant-Declaration
 *       Method-Declaration
 *       Nested-Type-Declaration
 *   }
 * The class that implements an interface must override to implement all abstract methods declared in the
 * interface. Otherwise, the class must be declared abstract.
 * @author Alex
 */

// interface Declareable {      // package-level scope
// public interface abstract Declareable { // full declare - obsolete. Interfaces in Java are implicitly abstract.
public interface Declareable {
    /*
    All fields in an interface are implicitly public, static, and final. Although the interface declaration syntax permits
    the use of these keywords in a field declaration, their use is redundant. It is recommended not to use these keywords
    when declaring fields in an interface.
    Since a final field (constant field) is assigned a value only once, you cannot set the value of the
    field of an interface, except in its declaration.
    You can access the fields in an interface using the dot notation in the form of
        <interface-name>.<field-name>  : Declareable.YES    
    */
    int YES = 1;// public static final int YES = 1;
    int NO = 2; // public static final int NO = 2;
    int X = YES + NO;
    
    /*
    You can declare three types of methods in an interface:
        • Abstract methods
        • Static methods
        • Default methods
    */
    /*
    Abstract methods
    All method declarations in an interface are implicitly abstract and public unless they are declared static or default.
    Use of the abstract and public keywords in a method declaration in an interface is redundant, even though
    allowed by the compiler, because a method in an interface is implicitly abstract and public.
    */
    void play(); // public abstract void play();
    void stop(); // public abstract void stop();
    // Abstract method declarations in an interface may include parameters, a return type, and a throws clause.
    boolean withdraw(double amount) throws Exception;
    
    /*
    Static methods
    Unlike static methods in a class, static methods in an interface are not inherited by implementing classes or subinterfaces.
    There is only one way to call static methods of an interface: by using the interface name.
    Static methods are implicitly public.
    You can use the static methods of an interface using the dot notation.
        <interface-name>.<static-method> : Declareable.run()
    Используются для создания запускных методов, для создания которых до java8 делали отдельные классы параллельно интерфейсу с именованием имя интерфейса+s (Declareables)
    */
    static void run() { } // public static void run()
    
    /*
    Default Methods
    A default method provides a default implementation for the classes that implements the interface, but does not override the default method.
    All classes implementing the interface will inherit the default implementation, thus not breaking them. Classes may choose to
    override the default implementation.
    A default method cannot be declared abstract or static.
    !!! The major difference lies in the access to the state of the object. A concrete method in a class
    can access the instance variables of the class. However, a default method does not have access
    to the instance of variables of the class implementing the interface. The default method has
    access to the other members of the interface, for example other methods, constants, and type
    members.
    */
    default double move(double deltaX, double deltaY) {
        return deltaX + deltaY;
    }
}
