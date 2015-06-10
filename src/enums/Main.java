
package enums;

/**
 * Enum constants are objects of type of Enum .
 * @author Alex
 */
public class Main {
    
    public static void main(String[] args) {
        // You declare a variable of an enum type the same way you declare a variable of a class type.
        Enumerate en1;
        
        //You can assign null to an enum type variable, like so:
        Enumerate en2 = null;
        
        // You cannot instantiate an enum type. 
        //Enumerate en2 = new Enumerate(); // compile-time error
        
        // The Enumerate enum type defines four enum constants. Therefore, a variable of the Enumerate enum type can have
        // only one of the four values—LOW, MEDIUM, HIGH, and URGENT—or null.
        Enumerate low = Enumerate.LOW;
        Enumerate medium = Enumerate.MEDIUM;
        Enumerate high = Enumerate.HIGH;
        Enumerate urgent = Enumerate.URGENT;
        
        /*
        An enum type also assigns an order number (or position number), called ordinal, to all of its constants. The
        ordinal starts with zero and it is incremented by one as you move from first to last in the list of constants. The first
        enum constant is assigned the ordinal value of zero, the second of 1, the third of 2, and so on. The ordinal values
        assigned to constants declared in Severity enum type are 0 to LOW, 1 to MEDIUM, 2 to HIGH, and 3 to URGENT. If
        you change the order of the constants in the enum type body, or add new ones, their ordinal values will change
        accordingly.
        You can read the ordinal of an enum constant using the ordinal() method
        */
        System.out.println("ordinal Enumerate.MEDIUM = " + medium.ordinal()); // 1
        // You can read the name of an enum constant using the name() method
        System.out.println("name = " + urgent.name() + " ordinal = " + urgent.ordinal()); // 1
        
        //Each enum type has a static method named values() that returns an array of constants in the order they are declared in its body.
        for(Enumerate s : Enumerate.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }
        
        
    }
    
}
