
package inheritance;

/**
 * 
 * @author Alex
 */
public class ConstructSuper {
    
    protected String name;
    
    // переопределение дефолтного конструктора
    /*
    public ConstructSuper() {
        this("Kate");
    }
    */
    
    public ConstructSuper(String n) {
        this.name = n;
    }
}
