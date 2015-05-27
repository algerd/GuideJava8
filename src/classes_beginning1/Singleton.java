
package classes_beginning1;

/**
 *
 * @author Alex
 */
public class Singleton {
    public static void main ( String[] args ) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        System.out.println("st1 = " + st1.toString());
        System.out.println("st2 = " + st2.toString());
    }
    
    /*
        Singleton
    */
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return Singleton.instance;
    }
}
