
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
      
}
