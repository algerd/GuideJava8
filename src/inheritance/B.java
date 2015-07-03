
package inheritance;

/**
 *
 * @author Alex
 */
public class B extends A {
    
    void getB(){};
    
    @Override
    void print() {
        System.out.println(this.getClass());
    }
    
}
