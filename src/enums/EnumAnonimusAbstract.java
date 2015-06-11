package enums;

/**
 *
 * @author Alex
 */
public enum EnumAnonimusAbstract {
    /*
    You can also associate a different body to each enum constant. The body can have fields and methods.
    The compiler creates an anonymous class, which inherits from the enum type. 
    It moves the body of the enum constant to the body of that anonymous class.
    To let the client code use the inner const method (descript()), you must declare a method for the enum class
    type. If you want all constants of ETemp to override and provide implementation for this method, you need to declare
    it as abstract. If you want it to be overridden by some, but not all constants, you need to declare it non-abstract and
    provide a default implementation for it.
    */ 
    LOW(1, "bottom"){
        public void descript(){
             System.out.println("Const LOW is " + getDescriptor());
        }
    }, 
    MEDIUM(15, "middle"){
        public void descript(){
             System.out.println("Const MEDIUM is " + getDescriptor());
        }
    }, 
    HIGH(40, "top"){
         public void descript(){
             System.out.println("Const HIGH is " + getDescriptor());
        }
    };
    
    private int value;
    private String descriptor;
    
    private EnumAnonimusAbstract(int var, String descr) {
        this.value = var;
        this.descriptor = descr;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getDescriptor(){
        return this.descriptor;
    }
    
    // declare abstract method for inner const methods (getDescript())
    public abstract void descript();
    
    
    //////////////////////////////////////
    public static void main(String[] args) {
        for(EnumAnonimusAbstract s : EnumAnonimusAbstract.values()) {          
            String name = s.name();         // имя константы
            int ordinal = s.ordinal();      // порядковый номер константы  
            int val = s.getValue();
            
            s.descript();
            System.out.println(
                "name=" + name +
                ", ordinal=" + ordinal +
                ", value=" + val
            );      
        }    
    }
    
}
