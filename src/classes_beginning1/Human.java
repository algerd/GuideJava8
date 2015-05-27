
package classes_beginning1;

/**
 *
 * @author Alex
 */
public class Human {
    /*
    Default Initialization of Fields:
        - A numeric field (byte, short, char, int, long, float, and double) is initialized to zero.
        - A boolean field is initialized to false.
        - A reference type field is initialized to null.
    */
    int age;            // int age = 0
    String name;        // String name = null
    String gender;      // String gender = null
    boolean bool;       // boolean bool = false
    static long count;  // static long count = 0
    /*
        Access Level for Class Member:
            private : Only within the same class
            package-level : In the same package
            protected : Same package or descendant in any package
            public : Everywhere
    */
    private int counter;
    protected String child;
    
    /*
    final keyword:
        - A variable declaration: If a variable is declared final, it can be assigned a value only once.
        - A class declaration: If a class is declared final, it cannot be extended (or subclassed).
        - A method declaration: If a method is declared final, it cannot be redefined (overridden or hidden) in the subclasses of the class that contains the method.    
    
    There are two ways to initialize a final variable:
        - You can initialize it at the time of its declaration.
        - You can defer its initialization until a later time.
    You must initialize the final variable before it is read for the first time.
    Blank final object variables must be initialized in one of the instance initializers or all !!! constructors. 
    If you change the value of the compile-time constant in the class, you must recompile all the classes that refer to the constant. Otherwise,
    they will continue using the old value of constant that existed when they were compiled last time.
    */
    // compile-time constant
    final int YES = 1;
    final String MSG = "Good-bye"; 
    public static final int NO = 2;
    
    // runtime final variable.
    //final Account act = new Account();
    final int multiplier; 
    public static final String BLANK;
   
    /*
        Order of Initialization:
            - static Initialization Block
            - Instance Initialization Block
            - construct
    */
    /*
        Instance Initialization Block (It perfom before construct).   
        You can have multiple instance initializers for a class. All of them are executed automatically in textual order for every object you create.
        An instance initializer cannot have a return statement. It cannot throw checked exceptions unless all declared
        constructors list those checked exceptions in their throws clause; an exception to this rule is made in the case of an
        anonymous class because it does not have a constructor; an instance initializer of an anonymous class may throw
        checked exceptions.
    */
    {
        this.age = 10;
        this.multiplier = 20; // Initialization final variable
    }
    {
        this.name = "John";
    }
    
    /*
        static Initialization Block (executed only once for a class when the class definition is loaded into JVM)
        It initialize static (class) variables of class.
        static initializer cannot throw checked exceptions and it cannot have a return statement.
    */
    static {
        Human.count = 10L;
        BLANK = "initialize"; // Initialization final static variable
    }
    static {
        Human.count = 20L;
    }
    
    /*
        Constructor initializes the object.
        The name of a constructor must match the simple name, not the fully qualified name, of the class.
        Unlike a method, a constructor does not have a return type. If it specifies a return type, it is a method. If it does not specify a return type, it is a constructor.
    */
    public Human() {
        /*
        Calling a Constructor from another Constructor:
            - constructor must be the first executable statement in the constructor’s body.
            - constructor cannot call itself because it will result in a recursive call.
        */
        // int k = 10; // First statement. Constructor is second statement. A compile-time error
        // this();     // Error: recursive constructor invocation
        this(103);
        
        /*
            Using a return Statement Inside a Constructor.
            A constructor cannot have a return type in its declaration. It means a constructor cannot return any value.
        */
        if (true) return;
      
    }
    // Below is a method, not a constructor (return void). 
    public void Human() {}
    
    /*
        The rules for overloaded constructors are the same as for overloaded methods. 
        If a class has multiple constructors, all of them must differ from the others in the number, order, or type of parameters.
    */
    private Human(int n) {}
    
    
    
      
}
