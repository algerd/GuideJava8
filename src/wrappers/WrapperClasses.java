
package wrappers;

/**
 * The Java library (java.lang) provided eight classes in the java.lang package to represent each of the eight primitive types:
 *  Byte, Short, Int, Long, Float, Double, Boolean, Character, String.
 * @author Alex
 */
public class WrapperClasses {
    
    public static void main(String[] args) {
        /*
        All wrapper classes are immutable. They provide two ways to create their objects:
            - Using constructors
            - Using the valueOf() factory methods
            Use of this method to create objects for integer numeric values (byte, short, int, and long) is preferred over
            constructors as this method caches some objects for reuse. The wrapper classes for these primitive types cache wrapper
            objects for primitive values between -128 and 127. For example, if you call Integer.valueOf(25) multiple times, the
            reference of the same Integer object from the cache is returned. However, when you call new Integer(25) multiple
            times, a new Integer object is created for each call.
        !!! Чтобы не плодить объекты всегда использовать valueOf() для создания примитивных объектов-обёрток.
        Если не предполагается повторное создание примитивного объекта(кеширование объекта) и требуется высокая производительность, 
        то лучше создавать примитивный объект-обёртку через конструктор.
        */
              
        Integer intObj1 = new Integer(100);
        Boolean booleanObj1 = new Boolean(true);
        
        Integer intObj2 = Integer.valueOf(100);
        Boolean booleanObj2 = Boolean.valueOf(true);
        
        // Creates objects from a String
        Integer intObj3 = new Integer("1969");
        Boolean booleanObj3 = new Boolean("false");
        
        Integer intObj4 = Integer.valueOf("100");
        Boolean booleanObj4 = Boolean.valueOf("true");
        
        // The Difference Between Using Constructors and valueOf( ) Method to Create Integer Objects
        Integer constr1 = new Integer(25);
        Integer constr2 = new Integer(25);
        System.out.println("constr1 == constr2 = " + (constr1 == constr2));         // Compare references - false
        System.out.println("constr1.equals(constr2) = " + constr1.equals(constr2)); // Compare values - true (equals override in wrappers)
        
        Integer valof1 = Integer.valueOf(25);
        Integer valof2 = Integer.valueOf(25);
        System.out.println("valof1 == valof2 = " + (valof1 == valof2));         // Compare references - true
        System.out.println("valof1.equals(valof2) = " + valof1.equals(valof2)); // Compare values - true (equals override in wrappers)
    
    }
    
}
