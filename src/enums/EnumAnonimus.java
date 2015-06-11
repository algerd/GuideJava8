
package enums;

/**
 *
 * @author Alex
 */
public enum EnumAnonimus {
    /*
    You can also associate a different body to each enum constant. The body can have fields and methods.
    The compiler creates an anonymous class, which inherits from the enum type. 
    It moves the body of the enum constant to the body of that anonymous class.
    To let the client code use the inner const method (getDescript()), you must declare a method for the enum class
    type. If you want all constants of ETemp to override and provide implementation for this method, you need to declare
    it as abstract. If you want it to be overridden by some, but not all constants, you need to declare it non-abstract and
    provide a default implementation for it.
    */ 
    LOW(1){
        public void getDescript(){
             System.out.println("Const LOW");
        }
    }, 
    MEDIUM(15), 
    HIGH(40);
    
    private int value;
    
    private EnumAnonimus(int var) {
        this.value = var;
    }
    
    public int getValue() {
        return this.value;
    }
    
    // default implementation method for inner const methods (getDescript())
    public void getDescript(){
            System.out.println("Outer");
    }
    
    
    //////////////////////////////////////
    public static void main(String[] args) {
        for(EnumAnonimus s : EnumAnonimus.values()) {          
            String name = s.name();         // имя константы
            int ordinal = s.ordinal();      // порядковый номер константы  
            int val = s.getValue();
            
            s.getDescript();
            System.out.println(
                "name=" + name +
                ", ordinal=" + ordinal +
                ", value=" + val
            );      
        }    
    }
    
}
