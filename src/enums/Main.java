
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
        
        /*
        You can compare two enum constants in three ways:
            • Using the compareTo() method of the Enum class
            • Using the equals() method of the Enum class
            • Using the == operator
        */
        /*
        The compareTo() method of the Enum class lets you compare two enum constants of the same enum type.
        It returns the difference in ordinal for the two enum constants. If both enum constants are the same, it returns
        zero.
        */
        Enumerate s1 = Enumerate.LOW;
        Enumerate s2 = Enumerate.HIGH;
        // s1.compareTo(s2) returns s1.ordinal() - s2.ordinal()
        int diff = s1.compareTo(s2);
        if (diff > 0) {
        System.out.println(s1 + " occurs after " + s2);
        }
        else {
            System.out.println(s1 + " occurs before " + s2);
        }
        /*
        You can use the equals() method of the Enum class to compare two enum constants for equality. An enum
        constant is equal only to itself. Note that the equals() method can be invoked on two enum constants of different
        types. If the two enum constants are from different enum types, the method returns false.
        */
        System.out.println(s1.equals(s2));
        
        /*
        You can also use the equality operator (==) to compare two enum constants for equality. Both operands to the ==
        operator must be of the same enum type. Otherwise, you get a compile-time error.
        */
        System.out.println(s1 == s2);
        
    }
    
    /*
    If the enum expression of the switch statement evaluates to null, it throws a NullPointerException.
    Такмк свитчи лучше преобразовать в логику внутри Enum класса
    */
    public static int getSwitch(Enumerate en) {
        int days = 0;
        switch (en) {
            // Must use the unqualified name LOW, not Enumerate.LOW
            case LOW:
                days = 30;
                break;
            case MEDIUM:
                days = 15;
                break;
            case HIGH:
                days = 7;
                break;
            case URGENT:
                days = 1;
                break;
        }
        return days;
    }

}
