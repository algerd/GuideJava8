
package inheritance;


/**
 * You can use a variable of an super type to invoke any methods declared only in the super class.
 * Super тип переменной накладывает ограничение на использование объектом методов только этого super класса.
 * @author Alex
 */
public class ABTest {
    public static void main(String[] args) {
        
        B b = new B();
        b.getA();   // OK. Using B, you can access only the getA() method of A object (super)
        b.getB();   // OK. Using B, you can access only the getB() method of B object
        
        A a = new B();
        a.getA();   // OK. Using A, you can access only the getA() method of A object
        //a.getB(); // error
    }
}
